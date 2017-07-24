package org.cyberpwn.fusionapi.type;

/**
 * Represents a registerable object for use in plugins
 * 
 * @author cyberpwn
 */
public class FusionSound extends FusionResource implements FSound
{
	private String soundPath;
	
	public FusionSound(String resource, String soundPath) 
	{
		super(resource);
		
		this.soundPath = soundPath;
	}

	@Override
	public String getSoundPath() 
	{
		return soundPath;
	}
}
