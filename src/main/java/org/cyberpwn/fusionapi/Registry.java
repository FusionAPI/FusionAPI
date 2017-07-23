package org.cyberpwn.fusionapi;

import java.io.IOException;

import org.cyberpwn.fusionapi.registry.Fuse;
import org.cyberpwn.fusionapi.registry.Registrar;
import org.cyberpwn.fusionapi.resource.ResourceHolder;

/**
 * Represents the fusion registry
 * 
 * @author cyberpwn
 */
public interface Registry 
{
	/**
	 * Get the registrar for a source (plugin)
	 * 
	 * @param source
	 *            the source
	 * @return the registrar or null
	 */
	public Registrar getRegistrar(String source);

	/**
	 * Get the api host
	 * 
	 * @return the host
	 */
	public String getHost();

	/**
	 * Begin registration of plugins to fuses
	 */
	public void startRegistration();

	/**
	 * Write resources to file
	 * @throws IOException 
	 */
	public void writeResources() throws IOException;
	
	/**
	 * Begin registration for a fuse plugin
	 * 
	 * @param i
	 *            the fuse
	 * @param source
	 *            the source name
	 */
	public void startRegistration(Fuse i, String source);

	/**
	 * Get the resource holder
	 * 
	 * @return the holder
	 */
	public ResourceHolder getResourceHolder();
}
