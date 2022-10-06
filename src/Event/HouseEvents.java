package Event;

import Main.GameManager;

import Main.Player;

public class HouseEvents{
	
	GameManager gameManager;
	
	Player player;
	
	boolean chestHasKey = false;
	
	public HouseEvents(GameManager gameManager){	
		this.gameManager = gameManager;
	}
	
	public void lookLockedChest(){
		if(chestHasKey) {
			gameManager.ui.messageText.setText("A unlocked chest.");			
		}
		else {
			gameManager.ui.messageText.setText("A chest with a lock.");
		}
		
	}

	public void talkLockedChest(){
		if(chestHasKey){
			gameManager.ui.messageText.setText("Mr.Chest: You found the key! Good job!");	
		}
		else {
			gameManager.ui.messageText.setText("'May I open you Mr.Chest?' you politely\nask the chest.\n\n"
					+ "Mr.Chest: NO! Find and give me the key first, than you can disover my secrets!");	
			
		}
		
	}
	public void openLockedChest(){
		if(gameManager.player.hasKey){
			gameManager.ui.messageText.setText("Mr.Chest: 'I'll take that key from you!\nAs promised, here is the secret note.'");
			chestHasKey = true;
			
			// takes away key
			gameManager.player.hasKey = false;
			
			// gives note
			gameManager.player.hasNote2 = true;
			gameManager.player.updatePlayerStatus();
		}
		else {
			gameManager.ui.messageText.setText("Mr.Chest: You don't have the key!\nCome back when you do.");		
		}
		
		
	}
	

}

