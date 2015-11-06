package logic;

import sprite.IRenderable;

public abstract class Living implements IRenderable{

	protected int x,y,z;
	protected boolean visible,destroyed;
	
	public Living(){
		this.visible = true;
		this.destroyed = false;
	}
	
	public boolean isDestroyed(){
		return destroyed;
	}
	
	@Override
	public int getZ() {
		// TODO Auto-generated method stub
		return z;
	}

	@Override
	public boolean isVisible() {
		// TODO Auto-generated method stub
		return visible;
	}
	
	public abstract void update();
}
