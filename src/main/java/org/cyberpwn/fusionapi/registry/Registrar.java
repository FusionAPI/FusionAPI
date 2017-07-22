package org.cyberpwn.fusionapi.registry;

import org.cyberpwn.fusionapi.type.FMaterial;
import org.cyberpwn.fusionapi.type.FModel;
import org.cyberpwn.fusionapi.type.FShader;
import org.cyberpwn.fusionapi.type.FSound;
import org.cyberpwn.fusionapi.type.FTexture;

/**
 * Represents a collection of registrants to host a registrar for a given fuse
 * 
 * @author cyberpwn
 */
public interface Registrar extends Sourced
{
	/**
	 * Get the registrant for the given object type
	 * 
	 * @param type
	 *            the object type
	 * @return the registrant
	 */
	public Registrant<?> getRegistrant(RegistryType type);
	
	/**
	 * Get a type specific registrant
	 * 
	 * @return the type specific registrant
	 */
	public Registrant<FMaterial> getMaterialRegistrant();
	
	/**
	 * Get a type specific registrant
	 * 
	 * @return the type specific registrant
	 */
	public Registrant<FSound> getSoundRegistrant();
	
	/**
	 * Get a type specific registrant
	 * 
	 * @return the type specific registrant
	 */
	public Registrant<FTexture> getTextureRegistrant();
	
	/**
	 * Get a type specific registrant
	 * 
	 * @return the type specific registrant
	 */
	public Registrant<FModel> getModelRegistrant();
	
	/**
	 * Get a type specific registrant
	 * 
	 * @return the type specific registrant
	 */
	public Registrant<FShader> getShaderRegistrant();
}
