package org.cyberpwn.fusionapi.pack;

import org.cyberpwn.fusionapi.json.JSONArray;
import org.cyberpwn.fusionapi.json.JSONObject;

public class ItemModelBuilder
{
	private JSONObject j;
	private String[] textures;
	private int predacates;
	private String[] predacate;
	private String fileName;
	
	public ItemModelBuilder(String fileName, String... textures)
	{
		this.textures = textures;
		j = new JSONObject();
		predacates = -1;
		this.fileName = fileName;
	}
	
	public void setPredicates(int k)
	{
		predacates = k;
		
		if(predacates > 0)
		{
			predacate = new String[predacates];
		}
	}
	
	public void assignModel(int level, String model)
	{
		predacate[level] = model;
	}
	
	public ResourceObject toResource(String nullModel)
	{
		return new JSONResourceObject(fileName, toJSON(nullModel));
	}
	
	public JSONObject toJSON(String nullModel)
	{
		j.put("parent", "item/handheld");
		JSONObject jTex = new JSONObject();
		
		for(int i = 0; i < textures.length; i++)
		{
			jTex.put("layer" + i, textures[i]);
		}
		
		j.put("textures", jTex);
		
		if(predacates > 0)
		{
			JSONArray jOverrides = new JSONArray();
			
			for(int i = 0; i < predacate.length; i++)
			{
				float damage = ((float) i) / ((float) predacate.length);
				String model = predacate[i];
				
				if(model == null)
				{
					model = nullModel;
				}
				
				JSONObject obj = new JSONObject();
				JSONObject pred = new JSONObject();
				
				pred.put("damaged", 1);
				pred.put("damage", damage);
				obj.put("predicate", pred);
				obj.put("model", model);
				jOverrides.put(obj);
			}
			
			float damage = 1;
			String model = predacate[predacate.length - 1];
			
			if(model == null)
			{
				model = nullModel;
			}
			
			JSONObject obj = new JSONObject();
			JSONObject pred = new JSONObject();
			
			pred.put("damaged", 1);
			pred.put("damage", damage);
			obj.put("predicate", pred);
			obj.put("model", model);
			jOverrides.put(obj);
			
			j.put("overrides", jOverrides);
		}
		
		return j;
	}
}
