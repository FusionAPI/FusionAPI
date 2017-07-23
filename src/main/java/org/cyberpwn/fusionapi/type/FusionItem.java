package org.cyberpwn.fusionapi.type;

/**
 * Represents a registerable object for use in plugins
 * 
 * @author cyberpwn
 */
public class FusionItem extends FusionMaterial implements FItem
{
	public FusionItem(String textureId, String modelId)
	{
		super(textureId, modelId);
	}
	
	public FusionItem(String textureId)
	{
		this(textureId, null);
	}
}
