package org.cyberpwn.fusionapi.resourcefilter;

import org.cyberpwn.fusionapi.pack.RawResourcePack;

public interface PackLense
{
	public RawResourcePack getPack();
	
	public Allocator getAllocator();
	
	public void writeToPack();
}
