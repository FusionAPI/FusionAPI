package org.cyberpwn.fusionapi.pack;

public class TextureWriter
{
	private final PackWriter blockWriter;
	private final PackWriter colorMapWriter;
	private final PackWriter effectWriter;
	private final PackWriter entityWriter;
	private final PackWriter environmentWriter;
	private final PackWriter fontWriter;
	private final PackWriter guiWriter;
	private final PackWriter itemWriter;
	private final PackWriter mapWriter;
	private final PackWriter miscWriter;
	private final PackWriter armorWriter;
	private final PackWriter paintingWriter;
	private final PackWriter particleWriter;
	
	public TextureWriter(RawResourcePack pack)
	{
		blockWriter = new ResourcePackWriter("textures/blocks", pack);
		colorMapWriter = new ResourcePackWriter("textures/colormap", pack);
		effectWriter = new ResourcePackWriter("textures/effect", pack);
		entityWriter = new ResourcePackWriter("textures/entity", pack);
		environmentWriter = new ResourcePackWriter("textures/environment", pack);
		fontWriter = new ResourcePackWriter("textures/font", pack);
		guiWriter = new ResourcePackWriter("textures/gui", pack);
		itemWriter = new ResourcePackWriter("textures/items", pack);
		mapWriter = new ResourcePackWriter("textures/map", pack);
		miscWriter = new ResourcePackWriter("textures/misc", pack);
		armorWriter = new ResourcePackWriter("textures/models/armor", pack);
		paintingWriter = new ResourcePackWriter("textures/painting", pack);
		particleWriter = new ResourcePackWriter("textures/particle", pack);
	}
	
	public PackWriter block()
	{
		return blockWriter;
	}
	
	public PackWriter colorMap()
	{
		return colorMapWriter;
	}
	
	public PackWriter effect()
	{
		return effectWriter;
	}
	
	public PackWriter entity()
	{
		return entityWriter;
	}
	
	public PackWriter environment()
	{
		return environmentWriter;
	}
	
	public PackWriter font()
	{
		return fontWriter;
	}
	
	public PackWriter gui()
	{
		return guiWriter;
	}
	
	public PackWriter item()
	{
		return itemWriter;
	}
	
	public PackWriter map()
	{
		return mapWriter;
	}
	
	public PackWriter misc()
	{
		return miscWriter;
	}
	
	public PackWriter armor()
	{
		return armorWriter;
	}
	
	public PackWriter painting()
	{
		return paintingWriter;
	}
	
	public PackWriter particle()
	{
		return particleWriter;
	}
}
