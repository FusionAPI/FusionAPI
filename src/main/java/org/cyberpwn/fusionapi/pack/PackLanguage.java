package org.cyberpwn.fusionapi.pack;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class PackLanguage
{
	private Map<String, String> lang;
	
	public PackLanguage()
	{
		lang = new HashMap<String, String>();
	}
	
	public String get(String key)
	{
		return lang.get(key);
	}
	
	public void put(String key, String value)
	{
		lang.put(key, value);
	}
	
	public void reset()
	{
		try
		{
			PackResource r = new PackResource("org.cyberpwn.fusionapi.resource", "en_us.lang");
			byte[] data = r.toByteArray();
			ByteArrayInputStream boin = new ByteArrayInputStream(data);
			InputStreamReader reader = new InputStreamReader(boin);
			BufferedReader br = new BufferedReader(reader);
			String line;
			
			while((line = br.readLine()) != null)
			{
				if(line.contains("=") && line.split("=").length == 2)
				{
					String key = line.split("=")[0];
					String value = line.split("=")[1];
					lang.put(key, value);
				}
			}
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void writeLang(File f) throws FileNotFoundException
	{
		FileOutputStream fos = new FileOutputStream(f);
		PrintWriter pw = new PrintWriter(fos);
		
		for(String i : lang.keySet())
		{
			pw.println(i + "=" + lang.get(i));
		}
		
		pw.close();
	}
	
	public int size()
	{
		return lang.size();
	}
}
