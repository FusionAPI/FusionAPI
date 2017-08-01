package org.cyberpwn.fusionapi.pack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResourceSet
{
	private Map<String, ResourceObject> map;
	
	public ResourceSet()
	{
		map = new HashMap<String, ResourceObject>();
	}
	
	public void put(String name, ResourceObject block)
	{
		map.put(name, block);
	}
	
	public ResourceObject get(String name)
	{
		return map.get(name);
	}
	
	public List<String> getNames()
	{
		return new ArrayList<String>(map.keySet());
	}
}
