package org.cyberpwn.fusionapi.type;

import org.cyberpwn.fusionapi.registry.Registered;
import org.cyberpwn.fusionapi.registry.RegistryType;

/**
 * Represents a registerable texture
 * 
 * @author cyberpwn
 */
public interface FTexture extends Registered, FResource
{
	@Override
	public default RegistryType getRegistryType()
	{
		return RegistryType.TEXTURE;
	}
}
