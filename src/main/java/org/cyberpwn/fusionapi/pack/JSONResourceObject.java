package org.cyberpwn.fusionapi.pack;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import org.cyberpwn.fusionapi.json.JSONObject;

public class JSONResourceObject extends ResourceObject
{
	private JSONObject j;
	
	public JSONResourceObject(String fileName, JSONObject j)
	{
		super("internal", fileName);
		
		this.j = j;
	}
	
	@Override
	public URL getResource()
	{
		return null;
	}
	
	@Override
	public InputStream getResourceStream()
	{
		try
		{
			return new ByteArrayInputStream(toByteArray());
		}
		
		catch(IOException e)
		{
			
		}
		
		return null;
	}
	
	@Override
	public byte[] toByteArray() throws IOException
	{
		return j.toString(RawResourcePack.indent).getBytes();
	}
	
	@Override
	public void writeToFile(File f) throws IOException
	{
		FileOutputStream fos = new FileOutputStream(f);
		PrintWriter pw = new PrintWriter(fos);
		pw.println(j.toString(RawResourcePack.indent));
		pw.close();
	}
}
