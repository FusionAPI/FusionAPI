package org.cyberpwn.fusionapi.type;

import org.cyberpwn.fusionapi.registry.Registered;
import org.cyberpwn.fusionapi.registry.RegistryType;

/**
 * Represents a registered material
 * 
 * @author cyberpwn
 */
public interface FMaterial extends Registered
{
	@Override
	public default RegistryType getRegistryType()
	{
		return RegistryType.MATERIAL;
	}
	
	/**
	 * Get the texture id for this object
	 * 
	 * @return the texture id which should be registered at the end of registry
	 */
	public String getTextureId();
	
	/**
	 * Get the model id for this object
	 * 
	 * @return the model id which should be registered at the end of registry
	 */
	public String getModelId();
}
