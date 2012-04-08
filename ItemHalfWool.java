package net.minecraft.src;

public class ItemHalfWool extends ItemBlock
{
	
	public ItemHalfWool(int i)
	{
		super(i);
		setMaxDamage(0);
		setHasSubtypes(true);
	}
	
    public int getMetadata(int i)
    {
        return i;
    }
	
}
