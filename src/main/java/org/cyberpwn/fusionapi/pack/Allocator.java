package org.cyberpwn.fusionapi.pack;

import java.util.HashMap;
import java.util.Map;

public class Allocator
{
	private Map<BasicModel, AllocatedObject> map;
	private Map<String, AllocatedObject> ref;
	
	public Allocator()
	{
		map = new HashMap<BasicModel, AllocatedObject>();
		ref = new HashMap<String, AllocatedObject>();
	}
	
	public void sacrifice(BasicModel model, int allocations)
	{
		map.put(model, new AllocatedObject(model, allocations));
	}
	
	private AllocatedObject getAllocation(BasicModel model)
	{
		return map.get(model);
	}
	
	public void assign(BasicModel superModel, String texture, int index)
	{
		getAllocation(superModel).allocate(index, texture);
		ref.put(texture, getAllocation(superModel));
	}
	
	public Map<BasicModel, AllocatedObject> getMap()
	{
		return map;
	}
	
	public Map<String, AllocatedObject> getRef()
	{
		return ref;
	}
}
