package org.cyberpwn.fusionapi.type;

import org.cyberpwn.fusionapi.registry.RegistryType;

public interface FItem extends FMaterial 
{
	@Override
	public default RegistryType getRegistryType() 
	{
		return RegistryType.ITEM;
	}
}
