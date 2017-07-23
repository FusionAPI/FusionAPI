package org.cyberpwn.fusionapi.type;

import org.cyberpwn.fusionapi.registry.Registered;
import org.cyberpwn.fusionapi.registry.RegistryType;

/**
 * Represents a registerable model
 * 
 * @author cyberpwn
 */
public interface FModel extends Registered, FResource
{
	@Override
	public default RegistryType getRegistryType()
	{
		return RegistryType.MODEL;
	}
}
