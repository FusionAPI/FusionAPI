package org.cyberpwn.fusionapi.type;

import org.cyberpwn.fusionapi.registry.RegistryType;

public interface FBlock extends FMaterial 
{
	@Override
	public default RegistryType getRegistryType() 
	{
		return RegistryType.BLOCK;
	}

	/**
	 * Get the material sound for step sounds and dig sounds
	 * 
	 * @return the material sound
	 */
	public String getMaterialSound();
}
