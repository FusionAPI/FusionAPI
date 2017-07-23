package org.cyberpwn.fusionapi.resource;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.cyberpwn.fusionapi.type.FResource;

/**
 * Create a resource horde which holds resources and dynamically loads them as
 * needed
 * 
 * @author cyberpwn
 *
 * @param <T>
 *            the type of resource
 */
public interface Horde<T extends FResource>
{
	/**
	 * Get the location to cache horded resources
	 * 
	 * @return the file horde location
	 */
	public File getHordeLocation();

	/**
	 * Add a resource to the horde
	 * 
	 * @param id
	 *            the id
	 * @param t
	 *            the resource
	 */
	public void addResource(String id, T t);

	/**
	 * Get all ids
	 * 
	 * @return all of the ids
	 */
	public List<String> getIds();
	
	/**
	 * Get a horded resource
	 * 
	 * @param id
	 *            the resource id
	 * @return the resource
	 */
	public T getResource(String id);

	/**
	 * Get an output stream for the given resource id
	 * 
	 * @param id
	 *            the id
	 * @return the io stream
	 * @throws IOException
	 *             shit happens
	 */
	public InputStream openStream(String id) throws IOException;

	/**
	 * Write a resource to a file
	 * 
	 * @param id
	 *            the id
	 * @param f
	 *            the file
	 * @throws IOException 
	 */
	public void writeToFile(String id, File f) throws IOException;
}
