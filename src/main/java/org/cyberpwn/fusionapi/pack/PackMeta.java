package org.cyberpwn.fusionapi.pack;

import org.cyberpwn.fusionapi.json.JSONObject;

public class PackMeta
{
	private int format;
	private String description;
	
	public PackMeta(int format, String description)
	{
		this.format = format;
		this.description = description;
	}
	
	public PackMeta(String description)
	{
		this(3, description);
	}
	
	public JSONObject toJSON()
	{
		JSONObject meta = new JSONObject();
		JSONObject pack = new JSONObject();
		
		pack.put("pack_format", format);
		pack.put("description", description);
		meta.put("pack", pack);
		
		return meta;
	}
	
	public int getFormat()
	{
		return format;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public void setFormat(int format)
	{
		this.format = format;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
}
