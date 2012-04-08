package net.minecraft.src;

//ITOS: MP client version.

public class mod_D32d extends BaseMod
{
	public static int hwID = 181;
	public static int dhwID = 182;
	/*public static int woolcushionID = 182;
	public static int seatablestairID = 183;
	public static int seatablestairpID = 184;
	public static int seatablestairsID = 185;
	public static int embID = 192;
	
	public static final Block woolseat = new BlockWoolSeat (woolseatID, 0).setHardness(1F).setResistance(10F).setStepSound(Block.soundClothFootstep).setBlockName("Wool Seat");
	public static final Block woolcushion = new BlockWoolCushion (woolcushionID, 0).setHardness(1F).setResistance(10F).setStepSound(Block.soundClothFootstep).setBlockName("Wool Cushion");
	public static final Block seatablestair = new BlockSeatableStair (seatablestairID, 0, Block.cloth).setHardness(1F).setResistance(10F).setStepSound(Block.soundClothFootstep).setBlockName("Seatable Stair");
	public static final Block seatablestairp = new BlockSeatableStair (seatablestairpID, 0, Block.planks).setHardness(1F).setResistance(10F).setStepSound(Block.soundWoodFootstep).setBlockName("Seatable Stair Planks");
	public static final Block seatablestairs = new BlockSeatableStair (seatablestairsID, 0, Block.stone).setHardness(1F).setResistance(10F).setStepSound(Block.soundStoneFootstep).setBlockName("Seatable Stair Stone");
	*/
	public static final Block halfwool = new BlockHalfWool (hwID, false).setHardness(1F).setResistance(10F).setStepSound(Block.soundClothFootstep).setBlockName("Wool Seat");
	public static final Block dublehalfwool = new BlockHalfWool (dhwID, true).setHardness(1F).setResistance(10F).setStepSound(Block.soundClothFootstep).setBlockName("Wool Seat");
	public void mod_D32d()
	{
		
	}
	
	public void load () 
	{
		//ModLoaderMp.registerNetClientHandlerEntity(EntityMountableBlock.class, embID);
		
		//Wool Seat
		ModLoader.registerBlock(halfwool, ItemHalfWool.class);
		ModLoader.addName(halfwool, "Шерстяной полублок");
		halfwool.blockIndexInTexture = 129;
		ModLoader.registerBlock(dublehalfwool, ItemHalfWool.class);
		ModLoader.addName(dublehalfwool, "Шерстяной двойной полублок");
		halfwool.blockIndexInTexture = 129;
		for (int i = 0; i <= 15; i++)
		{
			ModLoader.addRecipe(new ItemStack(halfwool, 4, i), new Object[] {
				"   ", "   ", "XXX", Character.valueOf('X'), new ItemStack(Block.cloth, 1, i)
			});
		}
		/*
		//Wool Cushion
		ModLoader.registerBlock(woolcushion, ItemWoolCushion.class);
		ModLoader.addName(woolcushion, "Wool Cushion");
		woolcushion.blockIndexInTexture = 129;
		for (int i = 0; i <= 15; i++)
		{
			ModLoader.addRecipe(new ItemStack(woolcushion, 2, i), new Object[] {
	            "   ", "   ", " XX", Character.valueOf('X'), new ItemStack(Block.cloth, 1, i)
	        });
		}
		
		//Seatable Stair Wool
		ModLoader.registerBlock(seatablestair);
		ModLoader.addName(seatablestair, "Seatable Stair Wool");
		seatablestair.blockIndexInTexture = 129;
		ModLoader.addRecipe(new ItemStack(seatablestair, 1), new Object[] {
            "   ", "  X", " XX", Character.valueOf('X'), new ItemStack(Block.cloth, 1, 14)
        });
		
		//Seatable Stair Wood
		ModLoader.registerBlock(seatablestairp);
		ModLoader.addName(seatablestairp, "Seatable Stair Planks");
		seatablestairp.blockIndexInTexture = 4;
		ModLoader.addRecipe(new ItemStack(seatablestairp, 1), new Object[] {
            "   ", "  X", " XX", Character.valueOf('X'), Block.planks
        });
		
		//Seatable Stair Stone
		ModLoader.registerBlock(seatablestairs);
		ModLoader.addName(seatablestairs, "Seatable Stair Stone");
		seatablestairs.blockIndexInTexture = 1;
		ModLoader.addRecipe(new ItemStack(seatablestairs, 1), new Object[] {
            "   ", "  X", " XX", Character.valueOf('X'), Block.stone
        });*/
	}
	
	public String getVersion ()
	{
		return "0.0.2 mod_D32d";
	}
}