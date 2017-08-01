package org.cyberpwn.fusionapi.pack;

public interface PackLense
{
	public RawResourcePack getPack();
	
	public Allocator getAllocator();
	
	public void writeToPack();
}
