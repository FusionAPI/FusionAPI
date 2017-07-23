package org.cyberpwn.fusionapi.type;

public class FusionResource implements FResource
{
	public String resource;
	
	public FusionResource(String resource)
	{
		this.resource = resource;
	}
	
	@Override
	public String getResource() 
	{
		return resource;
	}
}
