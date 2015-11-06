package logic;

import sprite.IRenderable;

public abstract class Block implements IRenderable{
	protected int x,y,z,width,height;
	
	protected int centerx,centery;
	
	protected Player posessedBy;
	protected Block[] nextBlock;
	
	public Block(int x, int y,int width,int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.centerx = x + width/2;
		this.centery = y + height/2;
	}
	
	@Override
	public int getZ() {
		// TODO Auto-generated method stub
		return -9999;
	}

	@Override
	public boolean isVisible() {
		// TODO Auto-generated method stub
		return true;
	}

	public Block[] getNextBlock() {
		return nextBlock;
	}

	public void setNextBlock(Block[] nextBlock) {
		this.nextBlock = nextBlock;
	}
	
	public int getPositionX(){
		return centerx;
	}
	
	public int getPositionY(){
		return centery;
	}
}
