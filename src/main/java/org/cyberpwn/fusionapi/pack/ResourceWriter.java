package org.cyberpwn.fusionapi.pack;

public class ResourceWriter
{
	private final ModelWriter modelWriter;
	private final TextureWriter textureWriter;
	private final ShaderWriter shaderWriter;
	private final PackWriter textWriter;
	
	public ResourceWriter(RawResourcePack pack)
	{
		modelWriter = new ModelWriter(pack);
		textureWriter = new TextureWriter(pack);
		shaderWriter = new ShaderWriter(pack);
		textWriter = new ResourcePackWriter("texts", pack);
	}
	
	public ModelWriter model()
	{
		return modelWriter;
	}
	
	public TextureWriter texture()
	{
		return textureWriter;
	}
	
	public ShaderWriter shader()
	{
		return shaderWriter;
	}
	
	public PackWriter text()
	{
		return textWriter;
	}
}
