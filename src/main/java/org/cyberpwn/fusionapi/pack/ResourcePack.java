package org.cyberpwn.fusionapi.pack;

import java.io.File;
import java.io.IOException;
import org.bukkit.Material;

public class ResourcePack
{
	private PackLense lense;
	
	public ResourcePack(String name)
	{
		lense = new ResourcePackLense(new RawResourcePack(name));
	}
	
	public void setDescription(String description)
	{
		lense.getPack().getMeta().setDescription(description);
	}
	
	public String getDescription()
	{
		return lense.getPack().getMeta().getDescription();
	}
	
	public void setIcon(PackIcon icon)
	{
		lense.getPack().setIcon(icon);
	}
	
	public PackIcon getIcon()
	{
		return lense.getPack().getIcon();
	}
	
	public ResourceWriter write()
	{
		return lense.getPack().write();
	}
	
	private void allocate(BasicModel model, String texture, int index)
	{
		lense.getAllocator().assign(model, texture, index);
	}
	
	public void allocate(Material material, String texture, int index)
	{
		MaterialFilter f = MaterialFilter.getFilter(material);
		
		if(f != null)
		{
			allocate(f, texture, index);
		}
	}
	
	private void allocate(MaterialFilter filter, String texture, int index)
	{
		if(filter.canBeAllocated())
		{
			allocate(filter.getBaseModel(), texture, index);
		}
	}
	
	public void sacrifice(Material material)
	{
		MaterialFilter f = MaterialFilter.getFilter(material);
		
		if(f != null)
		{
			sacrifice(f);
		}
	}
	
	public void sacrifice(Material material, int sects)
	{
		MaterialFilter f = MaterialFilter.getFilter(material);
		
		if(f != null)
		{
			sacrifice(f, sects);
		}
	}
	
	private void sacrifice(MaterialFilter f, int sects)
	{
		if(f.canBeAllocated())
		{
			sacrifice(f.getBaseModel(), sects);
		}
	}
	
	private void sacrifice(MaterialFilter filter)
	{
		if(filter.canBeAllocated())
		{
			sacrifice(filter.getBaseModel(), filter.getSectors());
		}
	}
	
	private void sacrifice(BasicModel model, int allocations)
	{
		lense.getAllocator().sacrifice(model, allocations);
	}
	
	public void setFormat(int format)
	{
		lense.getPack().getMeta().setFormat(format);
	}
	
	public int getFormat()
	{
		return lense.getPack().getMeta().getFormat();
	}
	
	public void addLang(String key, String val)
	{
		lense.getPack().addLang(key, val);
	}
	
	public void writeTo(File f)
	{
		try
		{
			lense.writeToPack();
			lense.getPack().writeTo(f);
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
