package net.minecraft.src;


public class BlockCloth extends Block
{
	
    public BlockCloth()
    {
        super(35, Material.cloth);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int par1)
    {
        return par1;
    }

    /**
     * Takes a dye damage value and returns the block damage value to match
     */
    public static int getBlockFromDye(int par0)
    {
        return ~par0 & 15;
    }

    /**
     * Takes a block damage value and returns the dye damage value to match
     */
    public static int getDyeFromBlock(int par0)
    {
        return ~par0 & 15;
    }
    
    /**
     * Called upon block activation (right click on the block.)
     */
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
    	int meta = world.getBlockMetadata(x, y, z);
    	System.out.println("Color: " + meta);
    	
    	switch(meta){
    		case 0:
//    			for(int a=1; a <= 10; a++){
//    				world.setBlock(x, y+a, z, 35, 0, 0x02);
//    				System.out.println("a: " + a);
//    			}
    			for(int a=0; a <= 15; a++){
    				for(int b=0; b <= 20; b++){
    					world.setBlock(x+b, y+10, z+a, Block.blockSnow.blockID);
        			}
    			}
    			
    			for(int a=0; a <= 6; a++){
    				for(int b=0; b <= 22; b++){
    					world.setBlock(x-1+b, y+8+a, z-1, Block.stoneBrick.blockID);
        			}
    				for(int b=0; b <= 22; b++){
    					world.setBlock(x-1+b, y+8+a, z+16, Block.stoneBrick.blockID);
        			}
    				for(int b=0; b <= 15; b++){
    					world.setBlock(x-1, y+8+a, z+b, Block.stoneBrick.blockID);
        			}
    				for(int b=0; b <= 15; b++){
    					world.setBlock(x+21, y+8+a, z+b, Block.stoneBrick.blockID);
        			}
    			}
//    			
    			world.setBlock(x-1, y+14, z-1, Block.glowStone.blockID);
    			world.setBlock(x, y+14, z-1, Block.glowStone.blockID);
    			world.setBlock(x-1, y+14, z, Block.glowStone.blockID);
//    			    			
    			world.setBlock(x-1, y+14, z+16, Block.glowStone.blockID);
    			world.setBlock(x, y+14, z+16, Block.glowStone.blockID);
    			world.setBlock(x-1, y+14, z+15, Block.glowStone.blockID);
//
    			world.setBlock(x+21, y+14, z+16, Block.glowStone.blockID);
    			world.setBlock(x+20, y+14, z+16, Block.glowStone.blockID);
    			world.setBlock(x+21, y+14, z+15, Block.glowStone.blockID);
//    			
    			world.setBlock(x+21, y+14, z-1, Block.glowStone.blockID);
    			world.setBlock(x+20, y+14, z-1, Block.glowStone.blockID);
    			world.setBlock(x+21, y+14, z, Block.glowStone.blockID);
    			
    			for(int a=0; a <= 9; a++){
    				y -= 2;
    				for(int b=0; b <= 22; b++){
    					world.setBlock(x-1+b, y+a, z-1, Block.glass.blockID);
        			}
    				for(int b=0; b <= 22; b++){
    					world.setBlock(x-1+b, y+a, z+16, Block.glass.blockID);
        			}
    				for(int b=0; b <= 15; b++){
    					world.setBlock(x-1, y+a, z+b, Block.glass.blockID);
        			}
    				for(int b=0; b <= 15; b++){
    					world.setBlock(x+21, y+a, z+b, Block.glass.blockID);
        			}
    				y += 2;
    			}
    			for(int a=0; a <= 15; a++){
    				for(int b=0; b <= 20; b++){
        					world.setBlockToAir(x+b, y-1, z+a);
        			}
    			}
    			for(int a=0; a <= 15; a++){
    				for(int b=0; b <= 20; b++){
        					world.setBlock(x+b, y, z+a, Block.lavaStill.blockID);
        			}
    			}
    			
    			for(int a=0; a <= 15; a++){
    				for(int b=0; b <= 20; b++){
    					world.setBlock(x+b, y-2, z+a, Block.glass.blockID);
        			}
    			}
    			
    			world.setBlock(x-2, y, z+5, 35, 11, 0x02);
    			world.setBlock(x-2, y, z+10, 35, 14, 0x02);
    			
    			par5EntityPlayer.setRotation(270, 10);
    			par5EntityPlayer.setPositionAndUpdate(x-2.5, y+1, z+0.5);
    			par5EntityPlayer.sendChatToPlayer("You have spawned a spleef arena");
    			
    			break;
    		case 1:
    				par5EntityPlayer.setPositionAndUpdate(x, y+5, z);    			
    			break;
    		case 11:
    				par5EntityPlayer.setRotation(270, 50);
    				par5EntityPlayer.setPositionAndUpdate(x+2.5, y+11, z+3);
    				world.setBlockToAir(x, y, z);
    				ItemStack i = new ItemStack(Item.shovelDiamond);
                    EntityItem var8 = par5EntityPlayer.dropPlayerItem(i);    			
    			break;
    		case 14:
    				par5EntityPlayer.setRotation(90, 50);
    				par5EntityPlayer.setPositionAndUpdate(x+22.5, y+11, z-2);
    				world.setBlockToAir(x, y, z);
    				ItemStack i2 = new ItemStack(Item.shovelDiamond);
                    EntityItem var82 = par5EntityPlayer.dropPlayerItem(i2);    			
    			break;
    	}
        return false;
    }

}
