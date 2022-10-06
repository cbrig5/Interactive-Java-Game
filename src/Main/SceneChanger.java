package Main;




public class SceneChanger {
	
	GameManager gameManager;
	
	UI ui;
	
	public SceneChanger(GameManager gameManager) {
		this.gameManager = gameManager;
	}
	
	public void showIntroWithCow_WithoutCow() {
		gameManager.ui.bgPanel[1].setVisible(true);
		gameManager.ui.bgPanel[2].setVisible(false);
		gameManager.ui.bgPanel[3].setVisible(false);
		gameManager.ui.bgPanel[4].setVisible(false);
		gameManager.ui.bgPanel[5].setVisible(false);
		gameManager.ui.bgPanel[6].setVisible(false);
		gameManager.ui.bgPanel[7].setVisible(false);
		gameManager.ui.bgPanel[8].setVisible(false);
		gameManager.ui.bgPanel[9].setVisible(false);
		gameManager.ui.bgPanel[10].setVisible(false);
		gameManager.ui.bgPanel[11].setVisible(false);
		gameManager.ui.bgPanel[12].setVisible(false);
		gameManager.ui.bgPanel[13].setVisible(false);
		gameManager.ui.bgPanel[14].setVisible(false);
		gameManager.ui.bgPanel[15].setVisible(false);
		gameManager.ui.bgPanel[16].setVisible(false);
		gameManager.ui.bgPanel[17].setVisible(false);
		gameManager.ui.bgPanel[18].setVisible(false);
		gameManager.ui.bgPanel[19].setVisible(false);
		gameManager.ui.bgPanel[20].setVisible(false);
		gameManager.ui.bgPanel[21].setVisible(false);
		gameManager.ui.messageText.setText("Explore! :)");
		gameManager.ui.panelNumber =1;
		
	}
	public void showIntroWithoutCow_WithoutCow() {
		gameManager.ui.bgPanel[1].setVisible(false);
		gameManager.ui.bgPanel[2].setVisible(true);
		gameManager.ui.bgPanel[3].setVisible(false);
		gameManager.ui.bgPanel[4].setVisible(false);
		gameManager.ui.bgPanel[5].setVisible(false);
		gameManager.ui.bgPanel[6].setVisible(false);
		gameManager.ui.bgPanel[7].setVisible(false);
		gameManager.ui.bgPanel[8].setVisible(false);
		gameManager.ui.bgPanel[9].setVisible(false);
		gameManager.ui.bgPanel[10].setVisible(false);
		gameManager.ui.bgPanel[11].setVisible(false);
		gameManager.ui.bgPanel[12].setVisible(false);
		gameManager.ui.bgPanel[13].setVisible(false);
		gameManager.ui.bgPanel[14].setVisible(false);
		gameManager.ui.bgPanel[15].setVisible(false);
		gameManager.ui.bgPanel[16].setVisible(false);
		gameManager.ui.bgPanel[17].setVisible(false);
		gameManager.ui.bgPanel[18].setVisible(false);
		gameManager.ui.bgPanel[19].setVisible(false);
		gameManager.ui.bgPanel[20].setVisible(false);
		gameManager.ui.bgPanel[21].setVisible(false);
		gameManager.ui.messageText.setText("Explore! :)");
		gameManager.ui.panelNumber =2;

	}
	

	public void showIntroWithoutCow_WithCowRight() {
		gameManager.ui.bgPanel[1].setVisible(false);
		gameManager.ui.bgPanel[2].setVisible(false);
		gameManager.ui.bgPanel[3].setVisible(true);
		gameManager.ui.bgPanel[4].setVisible(false);
		gameManager.ui.bgPanel[5].setVisible(false);
		gameManager.ui.bgPanel[6].setVisible(false);
		gameManager.ui.bgPanel[7].setVisible(false);
		gameManager.ui.bgPanel[8].setVisible(false);
		gameManager.ui.bgPanel[9].setVisible(false);
		gameManager.ui.bgPanel[10].setVisible(false);
		gameManager.ui.bgPanel[11].setVisible(false);
		gameManager.ui.bgPanel[12].setVisible(false);
		gameManager.ui.bgPanel[13].setVisible(false);
		gameManager.ui.bgPanel[14].setVisible(false);
		gameManager.ui.bgPanel[15].setVisible(false);
		gameManager.ui.bgPanel[16].setVisible(false);
		gameManager.ui.bgPanel[17].setVisible(false);
		gameManager.ui.bgPanel[18].setVisible(false);
		gameManager.ui.bgPanel[19].setVisible(false);
		gameManager.ui.bgPanel[20].setVisible(false);
		gameManager.ui.bgPanel[21].setVisible(false);
		gameManager.ui.messageText.setText("Explore! :)");
		gameManager.ui.panelNumber =3;
	}
	
	public void showIntroWithoutCow_WithCowLeft(){
		gameManager.ui.bgPanel[1].setVisible(false);
		gameManager.ui.bgPanel[2].setVisible(false);
		gameManager.ui.bgPanel[3].setVisible(false);
		gameManager.ui.bgPanel[4].setVisible(true);
		gameManager.ui.bgPanel[5].setVisible(false);
		gameManager.ui.bgPanel[6].setVisible(false);
		gameManager.ui.bgPanel[7].setVisible(false);
		gameManager.ui.bgPanel[8].setVisible(false);
		gameManager.ui.bgPanel[9].setVisible(false);
		gameManager.ui.bgPanel[10].setVisible(false);
		gameManager.ui.bgPanel[11].setVisible(false);
		gameManager.ui.bgPanel[12].setVisible(false);
		gameManager.ui.bgPanel[13].setVisible(false);
		gameManager.ui.bgPanel[14].setVisible(false);
		gameManager.ui.bgPanel[15].setVisible(false);
		gameManager.ui.bgPanel[16].setVisible(false);
		gameManager.ui.bgPanel[17].setVisible(false);
		gameManager.ui.bgPanel[18].setVisible(false);
		gameManager.ui.bgPanel[19].setVisible(false);
		gameManager.ui.bgPanel[20].setVisible(false);
		gameManager.ui.bgPanel[21].setVisible(false);
		gameManager.ui.messageText.setText("Explore :)");
		gameManager.ui.panelNumber =4;


	}
		
	public void showIntroWithoutCow_withoutCowAndKey() {
		gameManager.ui.bgPanel[1].setVisible(false);
		gameManager.ui.bgPanel[2].setVisible(false);
		gameManager.ui.bgPanel[3].setVisible(false);
		gameManager.ui.bgPanel[4].setVisible(false);
		gameManager.ui.bgPanel[5].setVisible(true);
		gameManager.ui.bgPanel[6].setVisible(false);
		gameManager.ui.bgPanel[7].setVisible(false);
		gameManager.ui.bgPanel[8].setVisible(false);
		gameManager.ui.bgPanel[9].setVisible(false);
		gameManager.ui.bgPanel[10].setVisible(false);
		gameManager.ui.bgPanel[11].setVisible(false);
		gameManager.ui.bgPanel[12].setVisible(false);
		gameManager.ui.bgPanel[13].setVisible(false);
		gameManager.ui.bgPanel[14].setVisible(false);
		gameManager.ui.bgPanel[15].setVisible(false);
		gameManager.ui.bgPanel[16].setVisible(false);
		gameManager.ui.bgPanel[17].setVisible(false);
		gameManager.ui.bgPanel[18].setVisible(false);
		gameManager.ui.bgPanel[19].setVisible(false);
		gameManager.ui.bgPanel[20].setVisible(false);
		gameManager.ui.bgPanel[21].setVisible(false);
		gameManager.ui.messageText.setText("You're so close to discovering the secret!\nBut wait...something feels... off.\n\n"
				+ "'I better go check on Mr.MooMoo'\nyou think to yourself.");
		gameManager.ui.panelNumber =5;
	

		
	}
	
	public void showHouse_WithCow_WithoutCow() {	
		gameManager.ui.bgPanel[1].setVisible(false);
		gameManager.ui.bgPanel[2].setVisible(false);
		gameManager.ui.bgPanel[3].setVisible(false);
		gameManager.ui.bgPanel[4].setVisible(false);
		gameManager.ui.bgPanel[5].setVisible(false);
		gameManager.ui.bgPanel[6].setVisible(true);
		gameManager.ui.bgPanel[7].setVisible(false);
		gameManager.ui.bgPanel[8].setVisible(false);
		gameManager.ui.bgPanel[9].setVisible(false);
		gameManager.ui.bgPanel[10].setVisible(false);
		gameManager.ui.bgPanel[11].setVisible(false);
		gameManager.ui.bgPanel[12].setVisible(false);
		gameManager.ui.bgPanel[13].setVisible(false);
		gameManager.ui.bgPanel[14].setVisible(false);
		gameManager.ui.bgPanel[15].setVisible(false);
		gameManager.ui.bgPanel[16].setVisible(false);
		gameManager.ui.bgPanel[17].setVisible(false);
		gameManager.ui.bgPanel[18].setVisible(false);
		gameManager.ui.bgPanel[19].setVisible(false);
		gameManager.ui.bgPanel[20].setVisible(false);
		gameManager.ui.bgPanel[21].setVisible(false);
		gameManager.ui.messageText.setText("How strange! Another chest!");
	}
	
	
	public void showHouse_WithoutCow_WithoutCow() {
		gameManager.ui.bgPanel[1].setVisible(false);
		gameManager.ui.bgPanel[2].setVisible(false);
		gameManager.ui.bgPanel[3].setVisible(false);
		gameManager.ui.bgPanel[4].setVisible(false);
		gameManager.ui.bgPanel[5].setVisible(false);
		gameManager.ui.bgPanel[6].setVisible(false);
		gameManager.ui.bgPanel[7].setVisible(true);
		gameManager.ui.bgPanel[8].setVisible(false);
		gameManager.ui.bgPanel[9].setVisible(false);
		gameManager.ui.bgPanel[10].setVisible(false);
		gameManager.ui.bgPanel[11].setVisible(false);
		gameManager.ui.bgPanel[12].setVisible(false);
		gameManager.ui.bgPanel[13].setVisible(false);
		gameManager.ui.bgPanel[14].setVisible(false);
		gameManager.ui.bgPanel[15].setVisible(false);
		gameManager.ui.bgPanel[16].setVisible(false);
		gameManager.ui.bgPanel[17].setVisible(false);
		gameManager.ui.bgPanel[18].setVisible(false);
		gameManager.ui.bgPanel[19].setVisible(false);
		gameManager.ui.bgPanel[20].setVisible(false);
		gameManager.ui.bgPanel[21].setVisible(false);
		gameManager.ui.messageText.setText("How strange! Another chest!");
		
	}


	public void showHouse_WithoutCow_WithCowRight() {
		gameManager.ui.bgPanel[1].setVisible(false);
		gameManager.ui.bgPanel[2].setVisible(false);
		gameManager.ui.bgPanel[3].setVisible(false);
		gameManager.ui.bgPanel[4].setVisible(false);
		gameManager.ui.bgPanel[5].setVisible(false);
		gameManager.ui.bgPanel[6].setVisible(false);
		gameManager.ui.bgPanel[7].setVisible(false);
		gameManager.ui.bgPanel[8].setVisible(true);
		gameManager.ui.bgPanel[9].setVisible(false);
		gameManager.ui.bgPanel[10].setVisible(false);
		gameManager.ui.bgPanel[11].setVisible(false);
		gameManager.ui.bgPanel[12].setVisible(false);
		gameManager.ui.bgPanel[13].setVisible(false);
		gameManager.ui.bgPanel[14].setVisible(false);
		gameManager.ui.bgPanel[15].setVisible(false);
		gameManager.ui.bgPanel[16].setVisible(false);
		gameManager.ui.bgPanel[17].setVisible(false);
		gameManager.ui.bgPanel[18].setVisible(false);
		gameManager.ui.bgPanel[19].setVisible(false);
		gameManager.ui.bgPanel[20].setVisible(false);
		gameManager.ui.bgPanel[21].setVisible(false);
		gameManager.ui.messageText.setText("How strange! Another chest!");
		
	}
	
	public void showHouse_WithoutCow_WithCowLeft(){
		gameManager.ui.bgPanel[1].setVisible(false);
		gameManager.ui.bgPanel[2].setVisible(false);
		gameManager.ui.bgPanel[3].setVisible(false);
		gameManager.ui.bgPanel[4].setVisible(false);
		gameManager.ui.bgPanel[5].setVisible(false);
		gameManager.ui.bgPanel[6].setVisible(false);
		gameManager.ui.bgPanel[7].setVisible(false);
		gameManager.ui.bgPanel[8].setVisible(false);
		gameManager.ui.bgPanel[9].setVisible(true);
		gameManager.ui.bgPanel[10].setVisible(false);
		gameManager.ui.bgPanel[11].setVisible(false);
		gameManager.ui.bgPanel[12].setVisible(false);
		gameManager.ui.bgPanel[13].setVisible(false);
		gameManager.ui.bgPanel[14].setVisible(false);
		gameManager.ui.bgPanel[15].setVisible(false);
		gameManager.ui.bgPanel[16].setVisible(false);
		gameManager.ui.bgPanel[17].setVisible(false);
		gameManager.ui.bgPanel[18].setVisible(false);
		gameManager.ui.bgPanel[19].setVisible(false);
		gameManager.ui.bgPanel[20].setVisible(false);
		gameManager.ui.bgPanel[21].setVisible(false);
		gameManager.ui.messageText.setText("How strange! Another chest!");		
	}
	public void showHouse_withoutCowEnd() {
		gameManager.ui.bgPanel[1].setVisible(false);
		gameManager.ui.bgPanel[2].setVisible(false);
		gameManager.ui.bgPanel[3].setVisible(false);
		gameManager.ui.bgPanel[4].setVisible(false);
		gameManager.ui.bgPanel[5].setVisible(false);
		gameManager.ui.bgPanel[6].setVisible(false);
		gameManager.ui.bgPanel[7].setVisible(false);
		gameManager.ui.bgPanel[8].setVisible(false);
		gameManager.ui.bgPanel[9].setVisible(false);
		gameManager.ui.bgPanel[10].setVisible(true);
		gameManager.ui.bgPanel[11].setVisible(false);
		gameManager.ui.bgPanel[12].setVisible(false);
		gameManager.ui.bgPanel[13].setVisible(false);
		gameManager.ui.bgPanel[14].setVisible(false);
		gameManager.ui.bgPanel[15].setVisible(false);
		gameManager.ui.bgPanel[16].setVisible(false);
		gameManager.ui.bgPanel[17].setVisible(false);
		gameManager.ui.bgPanel[18].setVisible(false);
		gameManager.ui.bgPanel[19].setVisible(false);
		gameManager.ui.bgPanel[20].setVisible(false);
		gameManager.ui.bgPanel[21].setVisible(false);
		gameManager.ui.messageText.setText("There is no going back, this is your last stop!\n\nHit the reset button only when you're ready.");
	}
	public void showTreeAreaWithoutCow_WithCow() {
		gameManager.ui.bgPanel[1].setVisible(false);
		gameManager.ui.bgPanel[2].setVisible(false);
		gameManager.ui.bgPanel[3].setVisible(false);
		gameManager.ui.bgPanel[4].setVisible(false);
		gameManager.ui.bgPanel[5].setVisible(false);
		gameManager.ui.bgPanel[6].setVisible(false);
		gameManager.ui.bgPanel[7].setVisible(false);
		gameManager.ui.bgPanel[8].setVisible(false);
		gameManager.ui.bgPanel[9].setVisible(false);
		gameManager.ui.bgPanel[10].setVisible(false);
		gameManager.ui.bgPanel[11].setVisible(true);
		gameManager.ui.bgPanel[12].setVisible(false);
		gameManager.ui.bgPanel[13].setVisible(false);
		gameManager.ui.bgPanel[14].setVisible(false);
		gameManager.ui.bgPanel[15].setVisible(false);
		gameManager.ui.bgPanel[16].setVisible(false);
		gameManager.ui.bgPanel[17].setVisible(false);
		gameManager.ui.bgPanel[18].setVisible(false);
		gameManager.ui.bgPanel[19].setVisible(false);
		gameManager.ui.bgPanel[20].setVisible(false);
		gameManager.ui.bgPanel[21].setVisible(false);
		gameManager.ui.messageText.setText("Looking for something??");
	}
	
	
	
	public void showTreeAreaWithoutCow_WithoutCow() {
		gameManager.ui.bgPanel[1].setVisible(false);
		gameManager.ui.bgPanel[2].setVisible(false);
		gameManager.ui.bgPanel[3].setVisible(false);
		gameManager.ui.bgPanel[4].setVisible(false);
		gameManager.ui.bgPanel[5].setVisible(false);
		gameManager.ui.bgPanel[6].setVisible(false);
		gameManager.ui.bgPanel[7].setVisible(false);
		gameManager.ui.bgPanel[8].setVisible(false);
		gameManager.ui.bgPanel[9].setVisible(false);
		gameManager.ui.bgPanel[10].setVisible(false);
		gameManager.ui.bgPanel[11].setVisible(false);
		gameManager.ui.bgPanel[12].setVisible(true);
		gameManager.ui.bgPanel[13].setVisible(false);
		gameManager.ui.bgPanel[14].setVisible(false);
		gameManager.ui.bgPanel[15].setVisible(false);
		gameManager.ui.bgPanel[16].setVisible(false);
		gameManager.ui.bgPanel[17].setVisible(false);
		gameManager.ui.bgPanel[18].setVisible(false);
		gameManager.ui.bgPanel[19].setVisible(false);
		gameManager.ui.bgPanel[20].setVisible(false);
		gameManager.ui.bgPanel[21].setVisible(false);
		gameManager.ui.messageText.setText("Looking for something??");
	}
	
	public void showTreeAreaWithCowRight_WithoutCow() {
		gameManager.ui.bgPanel[1].setVisible(false);
		gameManager.ui.bgPanel[2].setVisible(false);
		gameManager.ui.bgPanel[3].setVisible(false);
		gameManager.ui.bgPanel[4].setVisible(false);
		gameManager.ui.bgPanel[5].setVisible(false);
		gameManager.ui.bgPanel[6].setVisible(false);
		gameManager.ui.bgPanel[7].setVisible(false);
		gameManager.ui.bgPanel[8].setVisible(false);
		gameManager.ui.bgPanel[9].setVisible(false);
		gameManager.ui.bgPanel[10].setVisible(false);
		gameManager.ui.bgPanel[11].setVisible(false);
		gameManager.ui.bgPanel[12].setVisible(false);
		gameManager.ui.bgPanel[13].setVisible(true);
		gameManager.ui.bgPanel[14].setVisible(false);
		gameManager.ui.bgPanel[15].setVisible(false);
		gameManager.ui.bgPanel[16].setVisible(false);
		gameManager.ui.bgPanel[17].setVisible(false);
		gameManager.ui.bgPanel[18].setVisible(false);
		gameManager.ui.bgPanel[19].setVisible(false);
		gameManager.ui.bgPanel[20].setVisible(false);
		gameManager.ui.bgPanel[21].setVisible(false);
		gameManager.ui.messageText.setText("You placed the cow down.");
	}

	public void showTreeAreaWithCowLeft_WithoutCow() {
		gameManager.ui.bgPanel[1].setVisible(false);
		gameManager.ui.bgPanel[2].setVisible(false);
		gameManager.ui.bgPanel[3].setVisible(false);
		gameManager.ui.bgPanel[4].setVisible(false);
		gameManager.ui.bgPanel[5].setVisible(false);
		gameManager.ui.bgPanel[6].setVisible(false);
		gameManager.ui.bgPanel[7].setVisible(false);
		gameManager.ui.bgPanel[8].setVisible(false);
		gameManager.ui.bgPanel[9].setVisible(false);
		gameManager.ui.bgPanel[10].setVisible(false);
		gameManager.ui.bgPanel[11].setVisible(false);
		gameManager.ui.bgPanel[12].setVisible(false);
		gameManager.ui.bgPanel[13].setVisible(false);
		gameManager.ui.bgPanel[14].setVisible(true);
		gameManager.ui.bgPanel[15].setVisible(false);
		gameManager.ui.bgPanel[16].setVisible(false);
		gameManager.ui.bgPanel[17].setVisible(false);
		gameManager.ui.bgPanel[18].setVisible(false);
		gameManager.ui.bgPanel[19].setVisible(false);
		gameManager.ui.bgPanel[20].setVisible(false);
		gameManager.ui.bgPanel[21].setVisible(false);
		gameManager.ui.messageText.setText("You placed the cow down.");
	}
	public void showTreeAreaWithCowRightWithoutKeys_WithoutCow() {
		gameManager.ui.bgPanel[1].setVisible(false);
		gameManager.ui.bgPanel[2].setVisible(false);
		gameManager.ui.bgPanel[3].setVisible(false);
		gameManager.ui.bgPanel[4].setVisible(false);
		gameManager.ui.bgPanel[5].setVisible(false);
		gameManager.ui.bgPanel[6].setVisible(false);
		gameManager.ui.bgPanel[7].setVisible(false);
		gameManager.ui.bgPanel[8].setVisible(false);
		gameManager.ui.bgPanel[9].setVisible(false);
		gameManager.ui.bgPanel[10].setVisible(false);
		gameManager.ui.bgPanel[11].setVisible(false);
		gameManager.ui.bgPanel[12].setVisible(false);
		gameManager.ui.bgPanel[13].setVisible(false);
		gameManager.ui.bgPanel[14].setVisible(false);
		gameManager.ui.bgPanel[14].setVisible(false);
		gameManager.ui.bgPanel[15].setVisible(true);
		gameManager.ui.bgPanel[16].setVisible(false);
		gameManager.ui.bgPanel[17].setVisible(false);
		gameManager.ui.bgPanel[18].setVisible(false);
		gameManager.ui.bgPanel[19].setVisible(false);
		gameManager.ui.bgPanel[20].setVisible(false);
		gameManager.ui.bgPanel[21].setVisible(false);
		
	}
	
	public void showTreeAreaWithoutCowAndKeys_WithoutCow() {
		gameManager.ui.bgPanel[1].setVisible(false);
		gameManager.ui.bgPanel[2].setVisible(false);
		gameManager.ui.bgPanel[3].setVisible(false);
		gameManager.ui.bgPanel[4].setVisible(false);
		gameManager.ui.bgPanel[5].setVisible(false);
		gameManager.ui.bgPanel[6].setVisible(false);
		gameManager.ui.bgPanel[7].setVisible(false);
		gameManager.ui.bgPanel[8].setVisible(false);
		gameManager.ui.bgPanel[9].setVisible(false);
		gameManager.ui.bgPanel[10].setVisible(false);
		gameManager.ui.bgPanel[11].setVisible(false);
		gameManager.ui.bgPanel[12].setVisible(false);
		gameManager.ui.bgPanel[13].setVisible(false);
		gameManager.ui.bgPanel[14].setVisible(false);
		gameManager.ui.bgPanel[14].setVisible(false);
		gameManager.ui.bgPanel[15].setVisible(false);
		gameManager.ui.bgPanel[16].setVisible(true);
		gameManager.ui.bgPanel[17].setVisible(false);
		gameManager.ui.bgPanel[18].setVisible(false);
		gameManager.ui.bgPanel[19].setVisible(false);
		gameManager.ui.bgPanel[20].setVisible(false);
		gameManager.ui.bgPanel[21].setVisible(false);
		gameManager.ui.messageText.setText("Your suspicions were confirmed.\n"
				+ "like lilacs that come and go, so does Mr.MooMoo.\n\n"
				+ "'Goodbye Mr.MooMoo, thank you for\nyour guidance', you tearfully say.");
		
	}

	public void showIntroWithoutCow_noGoingBack() {
		gameManager.ui.bgPanel[1].setVisible(false);
		gameManager.ui.bgPanel[2].setVisible(false);
		gameManager.ui.bgPanel[3].setVisible(false);
		gameManager.ui.bgPanel[4].setVisible(false);
		gameManager.ui.bgPanel[5].setVisible(false);
		gameManager.ui.bgPanel[6].setVisible(false);
		gameManager.ui.bgPanel[7].setVisible(false);
		gameManager.ui.bgPanel[8].setVisible(false);
		gameManager.ui.bgPanel[9].setVisible(false);
		gameManager.ui.bgPanel[10].setVisible(false);
		gameManager.ui.bgPanel[11].setVisible(false);
		gameManager.ui.bgPanel[12].setVisible(false);
		gameManager.ui.bgPanel[13].setVisible(false);
		gameManager.ui.bgPanel[14].setVisible(false);
		gameManager.ui.bgPanel[15].setVisible(false);
		gameManager.ui.bgPanel[16].setVisible(false);
		gameManager.ui.bgPanel[17].setVisible(true);
		gameManager.ui.bgPanel[18].setVisible(false);
		gameManager.ui.bgPanel[19].setVisible(false);
		gameManager.ui.bgPanel[20].setVisible(false);
		gameManager.ui.bgPanel[21].setVisible(false);
		gameManager.ui.messageText.setText("Even though Mr.MooMoo is gone, you still feel his presence.\n\nThere is only one thing left to do.");
		
	}
	
	public void showCowScene() {
		gameManager.ui.bgPanel[1].setVisible(false);
		gameManager.ui.bgPanel[2].setVisible(false);
		gameManager.ui.bgPanel[3].setVisible(false);
		gameManager.ui.bgPanel[4].setVisible(false);
		gameManager.ui.bgPanel[5].setVisible(false);
		gameManager.ui.bgPanel[6].setVisible(false);
		gameManager.ui.bgPanel[7].setVisible(false);
		gameManager.ui.bgPanel[8].setVisible(false);
		gameManager.ui.bgPanel[9].setVisible(false);
		gameManager.ui.bgPanel[10].setVisible(false);
		gameManager.ui.bgPanel[11].setVisible(false);
		gameManager.ui.bgPanel[12].setVisible(false);
		gameManager.ui.bgPanel[13].setVisible(false);
		gameManager.ui.bgPanel[14].setVisible(false);
		gameManager.ui.bgPanel[15].setVisible(false);
		gameManager.ui.bgPanel[16].setVisible(false);
		gameManager.ui.bgPanel[17].setVisible(false);
		gameManager.ui.bgPanel[18].setVisible(true);
		gameManager.ui.bgPanel[19].setVisible(false);
		gameManager.ui.bgPanel[20].setVisible(false);
		gameManager.ui.bgPanel[21].setVisible(false);
		gameManager.ui.messageText.setText("A Truly Majestic Creature.");		
	}
	
	public void showEasterEggDay1() {
		gameManager.ui.bgPanel[1].setVisible(false);
		gameManager.ui.bgPanel[2].setVisible(false);
		gameManager.ui.bgPanel[3].setVisible(false);
		gameManager.ui.bgPanel[4].setVisible(false);
		gameManager.ui.bgPanel[5].setVisible(false);
		gameManager.ui.bgPanel[6].setVisible(false);
		gameManager.ui.bgPanel[7].setVisible(false);
		gameManager.ui.bgPanel[8].setVisible(false);
		gameManager.ui.bgPanel[9].setVisible(false);
		gameManager.ui.bgPanel[10].setVisible(false);
		gameManager.ui.bgPanel[11].setVisible(false);
		gameManager.ui.bgPanel[12].setVisible(false);
		gameManager.ui.bgPanel[13].setVisible(false);
		gameManager.ui.bgPanel[14].setVisible(false);
		gameManager.ui.bgPanel[15].setVisible(false);
		gameManager.ui.bgPanel[16].setVisible(false);
		gameManager.ui.bgPanel[17].setVisible(false);
		gameManager.ui.bgPanel[18].setVisible(false);
		gameManager.ui.bgPanel[19].setVisible(true);	
		gameManager.ui.bgPanel[20].setVisible(false);
		gameManager.ui.bgPanel[21].setVisible(false);
		gameManager.ui.messageText.setText("Day 1 of dating :)");		


	}
	
	public void showEasterEggYear1() {
		gameManager.ui.bgPanel[1].setVisible(false);
		gameManager.ui.bgPanel[2].setVisible(false);
		gameManager.ui.bgPanel[3].setVisible(false);
		gameManager.ui.bgPanel[4].setVisible(false);
		gameManager.ui.bgPanel[5].setVisible(false);
		gameManager.ui.bgPanel[6].setVisible(false);
		gameManager.ui.bgPanel[7].setVisible(false);
		gameManager.ui.bgPanel[8].setVisible(false);
		gameManager.ui.bgPanel[9].setVisible(false);
		gameManager.ui.bgPanel[10].setVisible(false);
		gameManager.ui.bgPanel[11].setVisible(false);
		gameManager.ui.bgPanel[12].setVisible(false);
		gameManager.ui.bgPanel[13].setVisible(false);
		gameManager.ui.bgPanel[14].setVisible(false);
		gameManager.ui.bgPanel[15].setVisible(false);
		gameManager.ui.bgPanel[16].setVisible(false);
		gameManager.ui.bgPanel[17].setVisible(false);
		gameManager.ui.bgPanel[18].setVisible(false);
		gameManager.ui.bgPanel[19].setVisible(false);	
		gameManager.ui.bgPanel[20].setVisible(true);
		gameManager.ui.bgPanel[21].setVisible(false);
		gameManager.ui.messageText.setText("Year one of dating :))");	

	}
	public void showEasterEggYear2() {
		gameManager.ui.bgPanel[1].setVisible(false);
		gameManager.ui.bgPanel[2].setVisible(false);
		gameManager.ui.bgPanel[3].setVisible(false);
		gameManager.ui.bgPanel[4].setVisible(false);
		gameManager.ui.bgPanel[5].setVisible(false);
		gameManager.ui.bgPanel[6].setVisible(false);
		gameManager.ui.bgPanel[7].setVisible(false);
		gameManager.ui.bgPanel[8].setVisible(false);
		gameManager.ui.bgPanel[9].setVisible(false);
		gameManager.ui.bgPanel[10].setVisible(false);
		gameManager.ui.bgPanel[11].setVisible(false);
		gameManager.ui.bgPanel[12].setVisible(false);
		gameManager.ui.bgPanel[13].setVisible(false);
		gameManager.ui.bgPanel[14].setVisible(false);
		gameManager.ui.bgPanel[15].setVisible(false);
		gameManager.ui.bgPanel[16].setVisible(false);
		gameManager.ui.bgPanel[17].setVisible(false);
		gameManager.ui.bgPanel[18].setVisible(false);
		gameManager.ui.bgPanel[19].setVisible(false);	
		gameManager.ui.bgPanel[20].setVisible(false);
		gameManager.ui.bgPanel[21].setVisible(true);
		gameManager.ui.messageText.setText("Year two of dating :)))");
		

	}
	

}

