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
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((texture == null) ? 0 : texture.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj)
		{
			return true;
		}
		if(obj == null)
		{
			return false;
		}
		if(getClass() != obj.getClass())
		{
			return false;
		}
		BasicModel other = (BasicModel) obj;
		if(model == null)
		{
			if(other.model != null)
			{
				return false;
			}
		}
		else if(!model.equals(other.model))
		{
			return false;
		}
		if(texture == null)
		{
			if(other.texture != null)
			{
				return false;
			}
		}
		else if(!texture.equals(other.texture))
		{
			return false;
		}
		return true;
	}
}
