package org.cyberpwn.fusionapi.pack;

public class ModelWriter
{
	private final PackWriter blockWriter;
	private final PackWriter itemWriter;
	
	public ModelWriter(RawResourcePack pack)
	{
		blockWriter = new ResourcePackWriter("models/block", pack);
		itemWriter = new ResourcePackWriter("models/item", pack);
	}
	
	public PackWriter block()
	{
		return blockWriter;
	}
	
	public PackWriter item()
	{
		return itemWriter;
	}
}
