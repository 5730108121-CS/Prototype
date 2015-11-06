package sprite;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

import logic.MainLogic;

public class RealScreen extends JComponent{
	
	public RealScreen(){
		super();
		setDoubleBuffered(true);
		setPreferredSize(new Dimension(1000,700));
		
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		
		g2d.setBackground(Color.WHITE);
		g2d.clearRect(0, 0, 1000, 700);
		
		synchronized(RenderManager.getInstance()){
			for(IRenderable thing : RenderManager.getInstance().getAllthing()){
				if(thing.isVisible()){
					thing.draw(g2d);
				}
			}
		}
	}
}
