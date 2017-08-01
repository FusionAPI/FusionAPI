package org.cyberpwn.fusionapi.pack;

public class ResourcePackLense implements PackLense
{
	private RawResourcePack pack;
	private Allocator allocator;
	
	public ResourcePackLense(RawResourcePack pack)
	{
		this.pack = pack;
		allocator = new Allocator();
	}
	
	@Override
	public void writeToPack()
	{
		for(BasicModel i : allocator.getMap().keySet())
		{
			String superModel = i.getModel() + ".json";
			ItemModelBuilder ima = new ItemModelBuilder(superModel, "items/" + allocator.getMap().get(i).getTexture());
			ima.setPredicates(allocator.getMap().get(i).getAllocations());
			
			for(int j = 0; j < allocator.getMap().get(i).getTextureAllocations().length; j++)
			{
				if(allocator.getMap().get(i).getTextureAllocations()[j] != null)
				{
					int id = j;
					String texture = allocator.getMap().get(i).getTextureAllocations()[id];
					String model = superModel.replaceAll(".json", "") + "_u" + id;
					ima.assignModel(j, "item/" + model);
					ItemModelBuilder imb = new ItemModelBuilder(model + ".json", "items/" + texture);
					pack.write().model().item().add(imb.toResource("NO_SOURCE"));
				}
			}
			
			pack.write().model().item().add(ima.toResource("item/" + allocator.getMap().get(i).getModel()));
		}
	}
	
	@Override
	public RawResourcePack getPack()
	{
		return pack;
	}
	
	@Override
	public Allocator getAllocator()
	{
		return allocator;
	}
}
