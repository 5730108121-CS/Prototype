package logic;

import java.util.ArrayList;
import java.util.List;

import sprite.RenderManager;

public class MainLogic {
	
	private int indexOfPlayer;
//	private List<Living> livings;
	private Player[] players;
	
	public MainLogic(){
//		livings = new ArrayList<Living>();
		
		for(Block block : Field.getBlocks()){
			RenderManager.getInstance().getAllthing().add(block);
		}
		
		Player player1 = new Player(Field.getBlocks()[0]);
		
		players = new Player[1];
		players[0] = player1;
//		livings.add(player1);
		
//		for(Living living : livings){
//			RenderManager.getInstance().getAllthing().add(living);
//		}
		for(Player player : players){
			RenderManager.getInstance().getAllthing().add(player);
		}
	}
	
	public void logicUpdate(){
		//Preventing thread interference
		synchronized(RenderManager.getInstance()){
//			for(Living living : livings){
//				living.update();
//			}
			for(Player player : players){
				player.update();
			}
		}
	}

	public int getIndexOfPlayer() {
		return indexOfPlayer;
	}

	public Player[] getPlayers() {
		return players;
	}
	
	
}
