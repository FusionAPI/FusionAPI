package org.cyberpwn.fusionapi.pack;

public class ShaderWriter
{
	private final PackWriter postWriter;
	private final PackWriter programWriter;
	
	public ShaderWriter(RawResourcePack pack)
	{
		postWriter = new ResourcePackWriter("shaders/post", pack);
		programWriter = new ResourcePackWriter("shaders/program", pack);
	}
	
	public PackWriter post()
	{
		return postWriter;
	}
	
	public PackWriter program()
	{
		return programWriter;
	}
}
