package org.cyberpwn.fusionapi.pack;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import org.cyberpwn.fusionapi.json.JSONObject;

public class RawResourcePack
{
	public static int indent = 2;
	private String name;
	private PackMeta meta;
	private PackIcon icon;
	private PackLanguage lang;
	private ResourceSet resourceSet;
	private PrintWriter pw;
	private ResourceWriter writer;
	
	public RawResourcePack(String name)
	{
		this.name = name;
		meta = new PackMeta("devoid");
		icon = new PackIcon("org.cyberpwn.fusionapi.resource", "fusion-icon.png");
		lang = new PackLanguage();
		resourceSet = new ResourceSet();
		pw = null;
		writer = new ResourceWriter(this);
	}
	
	public void writeTo(File root) throws IOException
	{
		File log = new File(root.getParentFile(), getName() + ".log");
		File assets = new File(root, "assets");
		File minecraft = new File(assets, "minecraft");
		File fLang = new File(minecraft, "lang");
		File fTextures = new File(minecraft, "textures");
		FileOutputStream fos = new FileOutputStream(log, false);
		pw = new PrintWriter(fos);
		i("Creating base Directories");
		root.mkdirs();
		fTextures.mkdirs();
		fLang.mkdirs();
		i("Writing default icon");
		writeResource(icon, new File(root, "pack.png"));
		i("Writing MCMETA: " + meta.toJSON().toString(0));
		writeJSON(meta.toJSON(), new File(root, "pack.mcmeta"));
		i("Writing " + lang.size() + " lang overrides to EN_US");
		lang.writeLang(new File(fLang, "en_us.lang"));
		
		i("Writing " + getResourceSet().getNames().size() + " Resources");
		for(String i : getResourceSet().getNames())
		{
			i("Writing " + getResourceSet().get(i).getCombined() + " to " + i);
			
			if(i.contains("/"))
			{
				String file = i.split("/")[i.split("/").length - 1];
				String folder = i.substring(0, i.length() - file.length());
				File f = new File(minecraft, folder);
				f.mkdirs();
				writeResource(getResourceSet().get(i), new File(f, file));
			}
			
			else
			{
				writeResource(getResourceSet().get(i), new File(minecraft, i));
			}
		}
		
		i("Pack Written");
		
		pw.close();
	}
	
	@Override
	public void finalize()
	{
		try
		{
			pw.close();
		}
		
		catch(Exception e)
		{
			
		}
	}
	
	private void writeResource(PackResource r, File f) throws IOException
	{
		r.writeToFile(f);
	}
	
	private void writeJSON(JSONObject j, File f) throws FileNotFoundException
	{
		FileOutputStream fos = new FileOutputStream(f, false);
		PrintWriter pw = new PrintWriter(fos);
		pw.println(j.toString(RawResourcePack.indent));
		pw.close();
	}
	
	public void addLang(String key, String text)
	{
		getLang().put(key, text);
	}
	
	public void addResource(String name, ResourceObject texture)
	{
		getResourceSet().put(name, texture);
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public PackMeta getMeta()
	{
		return meta;
	}
	
	public void setMeta(PackMeta meta)
	{
		this.meta = meta;
	}
	
	public PackIcon getIcon()
	{
		return icon;
	}
	
	public void setIcon(PackIcon icon)
	{
		this.icon = icon;
	}
	
	public PackLanguage getLang()
	{
		return lang;
	}
	
	public ResourceSet getResourceSet()
	{
		return resourceSet;
	}
	
	public void i(String msg)
	{
		doLog("[INFO]: ", msg);
	}
	
	public void w(String msg)
	{
		doLog("[WARNING]: ", msg);
	}
	
	public void f(String msg)
	{
		doLog("[FATAL]: ", msg.toUpperCase());
	}
	
	private void doLog(String t, String msg)
	{
		System.out.println(t + msg);
		pw.println(t + msg);
	}
	
	public ResourceWriter write()
	{
		return writer;
	}
}
