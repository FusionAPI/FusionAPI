package org.cyberpwn.fusionapi.pack;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class PackResource
{
	public String rPackage;
	public String rName;
	
	public PackResource(String rPackage, String rName)
	{
		this.rPackage = rPackage;
		this.rName = rName;
	}
	
	public String getPackage()
	{
		return rPackage;
	}
	
	public String getName()
	{
		return rName;
	}
	
	public String getCombined()
	{
		return getPackage().replaceAll("\\.", "/") + "/" + getName();
	}
	
	public URL getResource()
	{
		return this.getClass().getResource(getCombined());
	}
	
	public InputStream getResourceStream()
	{
		return this.getClass().getResourceAsStream("/" + getCombined());
	}
	
	public byte[] toByteArray() throws IOException
	{
		ByteArrayOutputStream boas = new ByteArrayOutputStream();
		InputStream is = getResourceStream();
		byte[] buf = new byte[1024];
		
		while(is.read(buf) != -1)
		{
			boas.write(buf);
		}
		
		return boas.toByteArray();
	}
	
	public void writeToFile(File f) throws IOException
	{
		FileOutputStream fos = new FileOutputStream(f, false);
		InputStream is = getResourceStream();
		byte[] buf = new byte[1024];
		
		if(is == null)
		{
			System.out.println("THIS ONE: " + f.toString());
			fos.close();
			return;
		}
		
		while(is.read(buf) != -1)
		{
			fos.write(buf);
		}
		
		fos.close();
	}
}
