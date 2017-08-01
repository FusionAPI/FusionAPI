package org.cyberpwn.fusionapi.pack;

public interface PackWriter
{
	public String getHead();
	
	public RawResourcePack getPack();
	
	public void add(String name, ResourceObject object);
	
	public void add(ResourceObject resourceObject);
}
