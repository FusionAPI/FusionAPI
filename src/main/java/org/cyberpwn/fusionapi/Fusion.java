package org.cyberpwn.fusionapi;

/**
 * Root fusion class
 * 
 * @author cyberpwn
 */
public class Fusion
{
	private static Fusion instance = null;
	private Registry registry;
	
	/**
	 * Create a new fusion instance
	 * 
	 * @param registry
	 *            the registry
	 */
	public Fusion(Registry registry)
	{
		instance = this;
		this.registry = registry;
	}
	
	/**
	 * Get the fusion registry
	 * 
	 * @return the registry
	 */
	public Registry getRegistry()
	{
		return registry;
	}
	
	/**
	 * Get the fusion api instance usually hosted by FusionCore plugin
	 * 
	 * @return FusionAPI instance
	 */
	public static Fusion instance()
	{
		return instance;
	}
}
