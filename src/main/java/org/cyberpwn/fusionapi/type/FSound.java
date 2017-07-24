package org.cyberpwn.fusionapi.type;

import org.cyberpwn.fusionapi.registry.Registered;
import org.cyberpwn.fusionapi.registry.RegistryType;

/**
 * Represents a registerable sound
 * 
 * @author cyberpwn
 */
public interface FSound extends Registered, FResource
{
	@Override
	public default RegistryType getRegistryType()
	{
		return RegistryType.SOUND;
	}
	
	/**
	 * Get the minecraft path for this sound
	 * 
	 * @return the sound path used to play it
	 */
	public String getSoundPath();
}
