package org.cyberpwn.fusionapi.type;

/**
 * Represents a registerable object for use in plugins
 * 
 * @author cyberpwn
 */
public class FusionMaterial implements FMaterial
{
	private String textureId;
	private String modelId;
	
	public FusionMaterial(String textureId, String modelId)
	{
		this.textureId = textureId;
		this.modelId = modelId;
	}
	
	public FusionMaterial(String textureId)
	{
		this(textureId, null);
	}
	
	@Override
	public String getTextureId()
	{
		return textureId;
	}
	
	@Override
	public String getModelId()
	{
		return modelId;
	}
}
