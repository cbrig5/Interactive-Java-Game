package Event;



import Main.GameManager;

public class IntroEvents {
	
	GameManager gameManager;
	
	

	public IntroEvents(GameManager gameManager) {
		this.gameManager = gameManager;
	}
	
	public void lookHut() {
		gameManager.ui.messageText.setText("A unkown home...");
	}
	public void talkHut() {		
		gameManager.ui.messageText.setText("You say 'Hello' to the house.\n"
				+ "But it's a house, it doesn't say anything back.\n");
	}

	public void enterHut() {	
		if(gameManager.ui.panelNumber == 1) {
			System.out.println(gameManager.ui.panelNumber);
			gameManager.sceneChanger.showHouse_WithCow_WithoutCow();
		}
		else if (gameManager.ui.panelNumber == 2) {
			gameManager.sceneChanger.showHouse_WithoutCow_WithoutCow();
		}
		else if (gameManager.ui.panelNumber == 3) {
			gameManager.sceneChanger.showHouse_WithoutCow_WithCowRight();
		}
		else if (gameManager.ui.panelNumber == 4) {
			gameManager.sceneChanger.showHouse_WithoutCow_WithCowLeft();
		}
		else {
			gameManager.sceneChanger.showHouse_withoutCowEnd();

		}
	}
	public void lookChest() {	
		gameManager.ui.messageText.setText("A chest with no lock.");
		
	}
	public void talkChest() {	
		gameManager.ui.messageText.setText("'Hey, can I take a look at your chest? ;)'\n"
				+ "you gigly say to the chest.");
		
	}
	public void openChest() {	
		gameManager.player.hasNote1 = true;
		gameManager.player.updatePlayerStatus();
		gameManager.ui.messageText.setText("You find a note in the chest.");
		
	}
	public void lookCow() {	
		gameManager.ui.goCowScene("goIntroWithCow_WithoutCow");
		gameManager.sceneChanger.showCowScene();

	}
	public void talkCow() {
		gameManager.ui.messageText.setText("'HELLO BEAUTIFULLL' you joyfully proclaim\nto the cow!");
		
	}
	public void takeCow() {
		gameManager.sceneChanger.showIntroWithoutCow_WithoutCow();
		gameManager.ui.messageText.setText("'I steal you Mr.MooMoo.' you think to yourself.\n\nYou now have a cow.");
		gameManager.player.hasCow = true;
		gameManager.player.updatePlayerStatus();

	}
	public void placeCow() {
		if(gameManager.player.hasCow) {
			gameManager.sceneChanger.showIntroWithCow_WithoutCow();
			gameManager.ui.messageText.setText("'I give you back Mr.MooMoo.'");
			gameManager.player.hasCow = false;
			gameManager.player.updatePlayerStatus();
			
		}
		else {
			gameManager.ui.messageText.setText("You have nothing to put down.");
		}
	}
	
	public void restart() {

		gameManager.player.setPlayerDefaultStatus();
		gameManager.sceneChanger.showIntroWithCow_WithoutCow();
	}
	

}
