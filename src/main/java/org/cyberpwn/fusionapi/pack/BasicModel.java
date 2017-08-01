package org.cyberpwn.fusionapi.pack;

public class BasicModel
{
	private String model;
	private String texture;
	
	public BasicModel(String model, String texture)
	{
		this.model = model;
		this.texture = texture;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public String getTexture()
	{
		return texture;
	}
}
