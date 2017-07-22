package org.cyberpwn.fusionapi.registry;

/**
 * Represents an object that can be sourced back to the fuse mod which
 * registered the object
 * 
 * @author cyberpwn
 */
public interface Sourced
{
	/**
	 * Get the source fuse who registered this object
	 * 
	 * @return the source
	 */
	public String getSource();
}
