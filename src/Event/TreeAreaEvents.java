package Event;

import Main.GameManager;
import Main.Player;


public class TreeAreaEvents{

	GameManager gameManager;
	
	Player player;
	
	boolean chestHasKey = false;
	
	public TreeAreaEvents(GameManager gameManager){	
		this.gameManager = gameManager;
	}

	public void lookSomethingNoCowRight() {
		gameManager.ui.messageText.setText("You think you may see something in the tree!\nBut you're too short tell.");
	}
	public void lookSomethingNoCowLeft() {
		gameManager.ui.messageText.setText("'There may be something in this tree'\nyou think to yourself.");
	}
	public void lookSomethingWithCowDistance() {
		gameManager.ui.messageText.setText("You think you may see something in the Tree!\nBut your cow is too far away to check.");
	}
	public void seeSomethingLeft() {
		gameManager.ui.messageText.setText("You climb on top of the cow and search the tree.\nYou find nothing.");
		
	}
	public void seeSomethingRight() {
		gameManager.ui.messageText.setText("You climb on top of the cow and search the tree.\nYou find a key!\n\n"
				+ "A key has been added to your inventory.");
		gameManager.player.hasKey = true;
		gameManager.player.updatePlayerStatus();
		gameManager.sceneChanger.showTreeAreaWithCowRightWithoutKeys_WithoutCow();
	}
	
	public void placeCowRight() {
		if(gameManager.player.hasCow) {
			gameManager.sceneChanger.showTreeAreaWithCowRight_WithoutCow();
			gameManager.player.hasCow = false;
			gameManager.player.updatePlayerStatus();
		}
		else {
			gameManager.ui.messageText.setText("You need something to put down.");
		}	
	}
	public void placeCowLeft() {
		
		if(gameManager.player.hasCow){
			gameManager.sceneChanger.showTreeAreaWithCowLeft_WithoutCow();
			gameManager.player.hasCow = false;
			gameManager.player.updatePlayerStatus();
		}
		else {
			gameManager.ui.messageText.setText("You have nothing to put down.");
		}
	}

	public void takeCowTreeArea() {
		gameManager.sceneChanger.showTreeAreaWithoutCow_WithoutCow();
		gameManager.player.hasCow = true;
		gameManager.player.updatePlayerStatus();
		
	}
	public void cantTakeCow() {
		gameManager.ui.messageText.setText("You try to take the cow, but he won't budge.");
	}
	public void lookCowRight() {
		gameManager.ui.goCowScene("goTreeAreaWithCowRight_WithoutCow");
		gameManager.sceneChanger.showCowScene();
	}
	public void lookCowLeft() {
		gameManager.ui.goCowScene("goTreeAreaWithCowLeft_WithoutCow");
		gameManager.sceneChanger.showCowScene();
	}
	public void lookCowRight_withoutKeys() {
		gameManager.ui.goCowScene("goTreeAreaWitCowRightWithoutkeys_WithoutCow");
		gameManager.sceneChanger.showCowScene();
	}
	
	public void easterEggDay1() {
		gameManager.sceneChanger.showEasterEggDay1();
		
		
	}

}
