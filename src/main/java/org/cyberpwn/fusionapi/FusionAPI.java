package org.cyberpwn.fusionapi;

import java.io.File;

public class FusionAPI
{
	public static File getRootFolder()
	{
		return new File("fusion");
	}
	
	public static File getCacheFolder()
	{
		return new File(getRootFolder(), "cache");
	}
	
	public static File getCacheFolder(String subcache)
	{
		return new File(getCacheFolder(), subcache.toLowerCase());
	}
}
