package org.cyberpwn.fusionapi.pack;

public class AllocatedObject
{
	private BasicModel model;
	private int allocations;
	private String[] textureAllocations;
	
	public AllocatedObject(BasicModel model, int allocations)
	{
		this.model = model;
		this.allocations = allocations;
		textureAllocations = new String[allocations];
	}
	
	public void allocate(int index, String s)
	{
		textureAllocations[index] = s;
	}
	
	public int getObjectsAllocated()
	{
		int k = 0;
		
		for(String i : getTextureAllocations())
		{
			if(i != null)
			{
				k++;
			}
		}
		
		return k;
	}
	
	public int getSize()
	{
		return allocations;
	}
	
	public double getUsage()
	{
		return (double) getObjectsAllocated() / (double) getSize();
	}
	
	public int getRemaining()
	{
		return getSize() - getObjectsAllocated();
	}
	
	public String getModel()
	{
		return model.getModel();
	}
	
	public int getAllocations()
	{
		return allocations;
	}
	
	public String[] getTextureAllocations()
	{
		return textureAllocations;
	}
	
	public String getTexture()
	{
		return model.getTexture();
	}
}
