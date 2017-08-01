package org.cyberpwn.fusionapi.pack;

public class ResourcePackWriter implements PackWriter
{
	private String head;
	private RawResourcePack pack;
	
	public ResourcePackWriter(String head, RawResourcePack pack)
	{
		this.head = head;
		this.pack = pack;
	}
	
	@Override
	public String getHead()
	{
		return head;
	}
	
	@Override
	public void add(String name, ResourceObject object)
	{
		pack.addResource(getHead() + "/" + name, object);
	}
	
	@Override
	public RawResourcePack getPack()
	{
		return pack;
	}
	
	@Override
	public void add(ResourceObject resourceObject)
	{
		add(resourceObject.getName(), resourceObject);
	}
}
