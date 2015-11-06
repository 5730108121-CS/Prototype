package logic;

import java.awt.Color;
import java.awt.Graphics2D;

import input.ButtonUtility;

public class Player extends Living{
	
	private static int size = 30;
	
	private static int speed = 3;
	private boolean isWalking;
	private int countstep;
	private int numstep;
	
	private Block currentBlock;
	private int hp;
	
	public Player(Block b){
		currentBlock = b;
		
		this.x = currentBlock.getPositionX();
		this.y = currentBlock.getPositionY();

		setHp(500);
	}
	
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void decreaseHP(int damage){
		hp -= damage;
	}

	@Override
	public void draw(Graphics2D g2d) {
		// TODO Auto-generated method stub
		g2d.setColor(Color.GREEN);
		g2d.fillOval(x-size/2, y-size/2, size, size);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		updateRoll();
		updateWalking();
	}
	
	private void step(){
		this.currentBlock = currentBlock.getNextBlock()[0];
	}
	
	private void updateRoll(){
		if(ButtonUtility.isRoll()){
			ButtonUtility.setRoll(false);
			int numstep = (int) (Math.random()*6+1);
			System.out.println(numstep);
			this.numstep = numstep;
		}
	}
	
	private void updateWalking(){
		if(!isFinishX()){
			stepX();
		} 
		if (!isFinishY()){
			stepY();
		}
		if(isFinishX() && isFinishY()) {
			finishStep();
		}
	}
	
	private void finishStep(){
		if(countstep < numstep){
			step();
			countstep++;
		} else {
			countstep = 0;
			numstep = 0;
		}
	}
	
	private void stepX(){
		if((x-currentBlock.getPositionX()) != 0){
			int sign = (currentBlock.getPositionX()-x) / Math.abs((currentBlock.getPositionX()-x));
			x += speed*sign;
			boolean check = (sign >= 0) ? (x > currentBlock.getPositionX()) : (x < currentBlock.getPositionX());
			if(check) x = currentBlock.getPositionX();
		}
	}
	private void stepY(){
		if((y-currentBlock.getPositionY()) != 0){
			int sign = (currentBlock.getPositionY()-y) / Math.abs((currentBlock.getPositionY()-y));
			y += speed*sign;
			boolean check = (sign >= 0) ? (y > currentBlock.getPositionY()) : (y < currentBlock.getPositionY());
			if(check) y = currentBlock.getPositionY();
		}
	}
	private boolean isFinishX(){
		return x == currentBlock.getPositionX();
	}
	
	private boolean isFinishY(){
		return y == currentBlock.getPositionY();
	}
}
