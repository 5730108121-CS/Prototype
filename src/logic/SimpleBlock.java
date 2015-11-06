package logic;

import java.awt.Color;
import java.awt.Graphics2D;

public class SimpleBlock extends Block{

	public SimpleBlock(int x, int y, int width, int height){
		super(x,y,width,height);
		
	}
	
	@Override
	public void draw(Graphics2D g2d) {
		// TODO Auto-generated method stub
		g2d.setColor(Color.BLACK);
		g2d.fillRect(x-2, y-2, width+4, height+4);
		g2d.setColor(Color.GRAY);
		g2d.fillRect(x, y, width, height);
	}

}
