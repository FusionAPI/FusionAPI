package org.cyberpwn.fusionapi.type;

import org.cyberpwn.fusionapi.registry.Registered;
import org.cyberpwn.fusionapi.registry.RegistryType;

/**
 * Represents a registerable shader
 * 
 * @author cyberpwn
 */
public interface FShader extends Registered
{
	@Override
	public default RegistryType getRegistryType()
	{
		return RegistryType.SHADER;
	}
}
