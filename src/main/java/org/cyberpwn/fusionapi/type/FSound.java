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
}
