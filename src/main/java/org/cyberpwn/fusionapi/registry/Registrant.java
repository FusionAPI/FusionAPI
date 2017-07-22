package org.cyberpwn.fusionapi.registry;

import java.util.List;

/**
 * Represents a registrant which holds registries for a specific type
 * 
 * @author cyberpwn
 * @param <O>
 *            the type of registerable object
 */
public interface Registrant<O> extends Sourced
{
	/**
	 * Register an object by id and object of type O
	 * 
	 * @param id
	 *            the id for this object
	 * @param object
	 *            the object for this registry
	 */
	public void register(String id, O object);
	
	/**
	 * Is a object registered under the given id
	 * 
	 * @param id
	 *            the given id
	 * @return true if there is an object registered under this id
	 */
	public boolean isRegistered(String id);
	
	/**
	 * Get the registered object under this id
	 * 
	 * @param id
	 *            the id
	 * @return the registered object or null
	 */
	public O get(String id);
	
	/**
	 * Get the id for a registered object
	 * 
	 * @param object
	 *            the object
	 * @return an id for this object or null
	 */
	public String get(O object);
	
	/**
	 * Get all objects in this registry
	 * 
	 * @return the objects
	 */
	public List<O> getObjects();
	
	/**
	 * Get all ids in this registry
	 * 
	 * @return the ids
	 */
	public List<String> getIds();
	
	/**
	 * Get the type of registered objects in this registry
	 * 
	 * @return the RegistryType
	 */
	public RegistryType getType();
}
