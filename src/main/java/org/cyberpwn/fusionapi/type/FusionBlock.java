package org.cyberpwn.fusionapi.type;

/**
 * Represents a registerable object for use in plugins
 * 
 * @author cyberpwn
 */
public class FusionBlock extends FusionMaterial implements FBlock
{
	private String materialSound;
	
	public FusionBlock(String textureId, String modelId, String materialSound)
	{
		super(textureId, modelId);
		
		this.materialSound = materialSound;
	}
	
	public FusionBlock(String textureId, String materialSound)
	{
		this(textureId, null, materialSound);
	}

	@Override
	public String getMaterialSound() 
	{
		return materialSound;
	}
}
