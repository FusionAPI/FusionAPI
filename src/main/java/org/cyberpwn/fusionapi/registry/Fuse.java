package org.cyberpwn.fusionapi.registry;

/**
 * Represents a fused plugin
 * 
 * @author cyberpwn
 */
public interface Fuse extends Sourced
{
	/**
	 * Called when this fuse plugin is being registered
	 * 
	 * @param registrar
	 *            the registrar to hold all registries
	 */
	public void onRegister(Registrar registrar);
}
