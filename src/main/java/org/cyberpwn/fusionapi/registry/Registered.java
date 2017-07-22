package org.cyberpwn.fusionapi.registry;

/**
 * Represents a registerable object
 * 
 * @author cyberpwn
 */
public interface Registered
{
	/**
	 * Get the type of registerable object
	 * 
	 * @return the type
	 */
	public RegistryType getRegistryType();
}
