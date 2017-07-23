package org.cyberpwn.fusionapi.resource;

import org.cyberpwn.fusionapi.registry.RegistryType;
import org.cyberpwn.fusionapi.type.FModel;
import org.cyberpwn.fusionapi.type.FResource;
import org.cyberpwn.fusionapi.type.FShader;
import org.cyberpwn.fusionapi.type.FSound;
import org.cyberpwn.fusionapi.type.FTexture;

/**
 * Hold resources
 * 
 * @author cyberpwn
 *
 */
public interface ResourceHolder
{
	/**
	 * Het horder
	 * 
	 * @return the horder
	 */
	public Horde<FModel> getModelHorde();

	/**
	 * Het horder
	 * 
	 * @return the horder
	 */
	public Horde<FShader> getShaderHorde();

	/**
	 * Het horder
	 * 
	 * @return the horder
	 */
	public Horde<FSound> getSoundHorde();

	/**
	 * Het horder
	 * 
	 * @return the horder
	 */
	public Horde<FTexture> getTextureHorde();
}
