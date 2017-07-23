package org.cyberpwn.fusionapi.type;

/**
 * Represents a resourced object
 * 
 * @author cyberpwn
 *
 */
public interface FResource 
{
	/**
	 * Get the resource path (package path) For example:
	 * org.cyberpwn.plugin.resources.object.png
	 * 
	 * @return the resource path to the object
	 */
	public String getResource();
}
