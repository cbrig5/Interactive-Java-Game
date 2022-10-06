package Main;

import java.awt.Color;


import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;


public class UI {
	GameManager gameManager;
	
	Player player;
	
	JFrame window;
	
	
	public JTextArea messageText;
	public JPanel bgPanel[] = new JPanel[30];
	public JLabel bgLabel[] = new JLabel[30];
	
	
	// PLAYER UI
	JPanel inventoryPanel;
	public JLabel keyLabel;
	public JLabel cowLabel;
	public JLabel note1Label;
	public JLabel note2Label;
	public int panelNumber;

	public boolean restartGame;
	
	public UI(GameManager gameManager) {
		this.gameManager = gameManager;

		
		createMainField();
		createPlayerField();
		generateScene();
		
		window.setVisible(true);
		
	}
	
	public void createMainField() {
		window = new JFrame();
		window.setSize(800,600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		
		messageText = new JTextArea("Explore!!!");
		messageText.setBounds(50,410,700,200);
		messageText.setBackground(Color.black);
		messageText.setForeground(Color.white);
		messageText.setEditable(false);
		messageText.setLineWrap(true);
		messageText.setWrapStyleWord(false);
		messageText.setFont(new Font("Rockwell", Font.BOLD, 26));
		window.add(messageText);

	}
	
	public void createBackground(int bgNum, String bgFileName) {
		bgPanel[bgNum] = new JPanel();
		bgPanel[bgNum].setBounds(50,50,700,350);
		bgPanel[bgNum].setBackground(null);
		bgPanel[bgNum].setLayout(null);
		window.add(bgPanel[bgNum]);
		
		bgLabel[bgNum] = new JLabel();
		bgLabel[bgNum].setBounds(0,0,700,350);
		
		ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource(bgFileName));
		bgLabel[bgNum].setIcon(bgIcon);
		
	}
	
	public void createObject(int bgNum, int objx, int objy, int objwidth, int objheight, String objFileName,
				String choice0Name, String choice1Name, String choice2Name, String choice0Command, String choice1Command,
				String choice2Command) {
		// CREATE POP MENU
		JPopupMenu popupMenu = new JPopupMenu();
		// CREATE POP MENU ITEMS 
		JMenuItem menuItem[] = new JMenuItem[3];
		menuItem[0] = new JMenuItem(choice0Name);
		menuItem[0].addActionListener(gameManager.actionHandler);
		menuItem[0].setActionCommand(choice0Command);
 		popupMenu.add(menuItem[0]);
	
		
		menuItem[1] = new JMenuItem(choice1Name);
		menuItem[1].addActionListener(gameManager.actionHandler);
		menuItem[1].setActionCommand(choice1Command);
		popupMenu.add(menuItem[1]);
		
		menuItem[2] = new JMenuItem(choice2Name);
		menuItem[2].addActionListener(gameManager.actionHandler);
		menuItem[2].setActionCommand(choice2Command);
		popupMenu.add(menuItem[2]);
		
		
		// CREATE OBJECTS
		JLabel objectLabel = new JLabel();
		objectLabel.setBounds(objx,objy,objwidth,objheight);
		
		
		ImageIcon objecIcon = new ImageIcon(getClass().getClassLoader().getResource(objFileName));
		objectLabel.setIcon(objecIcon);
		
		objectLabel.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent e) {}
			public void mousePressed(MouseEvent e) {
				
				if(SwingUtilities.isRightMouseButton(e)) {
					popupMenu.show(objectLabel, e.getX(), e.getY());
				}
			}
			public void mouseExited(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}

			public void mouseClicked(MouseEvent e) {}
		});
		bgPanel[bgNum].add(objectLabel);
		
		bgPanel[bgNum].add(bgLabel[bgNum]);
	}
	
	
	public void createArrowButton(int bgNum, int x, int y, int width ,int height, String arrowFileName, String command) {
		
		ImageIcon arrowIcon = new ImageIcon(getClass().getClassLoader().getResource(arrowFileName));
		
		JButton arrowButton = new JButton();
		arrowButton.setBounds(x,y,width,height);
		arrowButton.setBackground(null);
		arrowButton.setContentAreaFilled(false);
		arrowButton.setFocusPainted(false);
		arrowButton.setIcon(arrowIcon);
		arrowButton.addActionListener(gameManager.actionHandler);
		arrowButton.setActionCommand(command);
		//arrowButton.setBorderPainted(false);
		
		bgPanel[bgNum].add(arrowButton);
		
	}
	
	public void createRestartButton(int bgNum, boolean status) {
		
		restartGame = status;
		
		if (restartGame){
		
			ImageIcon arrowIcon = new ImageIcon(getClass().getClassLoader().getResource("restart.png"));
			
			JButton arrowButton = new JButton();
			arrowButton.setBounds(550,125,50,50);
			arrowButton.setBackground(null);
			arrowButton.setContentAreaFilled(false);
			arrowButton.setFocusPainted(false);
			arrowButton.setIcon(arrowIcon);
			arrowButton.addActionListener(gameManager.actionHandler);
			arrowButton.setActionCommand("restart");
			//arrowButton.setBorderPainted(false);
			
			bgPanel[bgNum].add(arrowButton);
		}
		
	}
		
	
	public void createPlayerField() {
		inventoryPanel = new JPanel();
		inventoryPanel.setBounds(560,0,200,50);
		inventoryPanel.setBackground(Color.black);
		inventoryPanel.setLayout(new GridLayout(1,5));
		window.add(inventoryPanel);
		
		// CREATE COW ITEM
		cowLabel = new JLabel();
		ImageIcon cowIcon = new ImageIcon(getClass().getClassLoader().getResource("white-cow-icon.png"));
		Image image = cowIcon.getImage().getScaledInstance(48,48,Image.SCALE_DEFAULT);
		cowIcon = new ImageIcon(image);
		cowLabel.setIcon(cowIcon);
		inventoryPanel.add(cowLabel);
		
		// CREATE KEY ITEM
		keyLabel = new JLabel();
		ImageIcon keyIcon = new ImageIcon(getClass().getClassLoader().getResource("key-48.png"));
		image = keyIcon.getImage().getScaledInstance(48,48, Image.SCALE_DEFAULT);
		keyIcon = new ImageIcon(image);
		keyLabel.setIcon(keyIcon);
		inventoryPanel.add(keyLabel);
		
		// CREATE NOTE1 ITEM
		note1Label = new JLabel();
		ImageIcon note1Icon = new ImageIcon(getClass().getClassLoader().getResource("notebook.png"));
		image = note1Icon.getImage().getScaledInstance(48,48, Image.SCALE_DEFAULT);
		note1Icon = new ImageIcon(image);
		note1Label.setIcon(note1Icon);
		inventoryPanel.add(note1Label);
		
		// CREATE NOTE2 ITEM
		note2Label = new JLabel();
		ImageIcon note2Icon = new ImageIcon(getClass().getClassLoader().getResource("notebook.png"));
		image = note2Icon.getImage().getScaledInstance(48,48, Image.SCALE_DEFAULT);
		note2Icon = new ImageIcon(image);
		note2Label.setIcon(note2Icon);
		inventoryPanel.add(note2Label);

		
	}	
	
	public void goIntro(int num, String image, String word1, String word2,String word3,String word4,String word5
			,String word6,String scene) {
		createBackground(num,"introBackGround.png");
		createObject(num,420,180,200,193, "log-cabin.png", "Look","Talk","Enter","lookHut","talkHut","enterHut");
		createObject(num,300,290,70,48, "unlocked-chest.png","Look","Talk","Open","lookChest","talkChest","openChest"); 
		createObject(num,10,200,100,100, image,word1,word2,word3,word4,word5,word6);
		createArrowButton(num, 650, 150, 50, 50, "right-arrow.png", scene);

		bgPanel[num].add(bgLabel[num]);
		
	}
	
	public void goIntroEnd(int panel) {
		createBackground(panel,"introBackGround.png");
		createObject(panel,420,180,200,193, "log-cabin.png", "Look","Talk","Enter","lookHut","talkHut","enterHut");
		createObject(panel,300,290,70,48, "unlocked-chest.png","","","","","","");

		bgPanel[panel].add(bgLabel[panel]);
		
	}
	
	
	public void goInsideHouse(int num,String scene, boolean statusArrow, boolean statusRestart) {
		createBackground(num, "insideHouse.jpg");
		createObject(num,318,180,100,52, "locked-chest 100x52.png", "Look","Talk","Open","lookLockedChest","talkLockedChest","openLockedChest");
		if (statusArrow) {
			createArrowButton(num, 0, 150, 50, 50, "left-arrow.png", scene);	
		}
		else {
			createRestartButton(num, statusRestart);
		}

		bgPanel[num].add(bgLabel[num]);
		
	}
	
		
	
	public void goTreeArea(int panel,int num1, int num2,int num3,int num4,int num5,int num6,
			String imageRight,String right1,String right2,String right3,String right1a,String right2b,String right3c,	
			String imageLeft,String left1,	String left2, String left3,String left1a, String left2b, String left3c, 
			String keyOption,String keyRight1, String keyRight1a, String keyLeft1, String keyLeft1a,
			String scene) {
		
		createBackground(panel,"treeArea.png");
		createArrowButton(panel, 0, 150, 50, 50, "left-arrow.png", scene);
		
		createObject(panel, num1, num2, num3, num3, imageRight, right1,right2,right3,right1a,right2b,right3c);
		createObject(panel , num4, num5, num6, num6, imageLeft,left1,left2,left3,left1a,left2b,left3c );
	
		
		createObject(panel, 600, 100, 20, 20,keyOption,keyRight1, "", "", keyRight1a, "", "");
		createObject(panel, 100, 100, 30, 30,keyOption, keyLeft1, "", "", keyLeft1a, "", "");
		
		
		bgPanel[panel].add(bgLabel[panel]);
		
		
	}
	public void goCowScene(String scene) {
		createBackground(18, "big-cow.jpg");
		createArrowButton(18, 0, 150, 50, 50, "left-arrow.png", scene);
		bgPanel[18].add(bgLabel[18]);
	}
	
	public void goEasterEgg(int panel , int num,String background,String sceneLeft, String sceneRight) {
		
		createBackground(panel, background);
		createArrowButton(panel, 0, 150, 50, 50, "left-arrow.png", sceneLeft);
		createArrowButton(panel, num, 150, 50, 50, "right-arrow.png", sceneRight);
		bgPanel[panel].add(bgLabel[panel]);
		
	}
	
	
	
	public void generateScene() {
		
		
		// INTRO
		goIntro(1, "cow.png","Look", "Talk", "Take", "lookCow", "talkCow", "takeCow","goTreeAreaWithoutCow_WithCow"); // INTRO WITH COW -> TREE AREA WITHOUTCOW
		goIntro(2, "blank-image.png", "Place", "", "", "placeCow", "", "", "goTreeAreaWithoutCow_WithoutCow"); // INTRO WITHOUT COW -> TREE AREA WITHOUT COW
		goIntro(3, "blank-image.png", "Place", "", "", "placeCow", "", "", "goTreeAreaWithCowRight_WithoutCow"); // INTRO WITHOUT COW -> TREE AREA WITH COW RIGHT
		goIntro(4, "blank-image.png", "Place", "", "", "placeCow", "", "", "goTreeAreaWithCowLeft_WithoutCow"); // INTRO WITHOUT COW -> TREE AREA WITH COW LEFT
		goIntro(5, "blank-image.png", "", "", "", "", "", "", "goTreeAreaWithoutCowAndKeys_WithoutCow"); // INTRO WITHOUT COW -> TREE AREA WITH NO COW OR KEYS
		goIntroEnd(17); // INTRO NO COW -> NO GOING BACK


		
		// INSIDE HOUSE
		goInsideHouse(6, "goIntroWithCow_WithoutCow", true, false); // GOES TO INTRO WITH COW -> TREE AREA WITHOUT COW
		goInsideHouse(7, "goIntroWithoutCow_WithoutCow", true, false); // GOES TO INTRO WITHOUT COW -> TREE AREA WITHOUT COW
		goInsideHouse(8, "goIntroWithoutCow_WithCowRight", true, false); // GOES TO INTRO WITHOUT COW -> TREE AREA WITH COW RIGHT
		goInsideHouse(9, "goIntroWithoutCow_WithCowLeft", true, false);  // GOES TO INTRO WITHOUT COW -> TREE AREA WITH COW LEFT
		goInsideHouse(10, "", false,true);  // GOES TO INTRO WITHOUT COW -> COW GONE
		
		
		
		
		// TREE AREA
		goTreeArea(11, 587, 200, 50, 100, 197, 50,"blank-image.png", "Place Object", "", "", "placeCowRight", "", "",
				"blank-image.png","Place Object", "", "", "placeCowLeft", "", "",
				"blank-image.png", "Look", "lookSomethingNoCowRight", "Look", "lookSomethingNoCowLeft"
				,"goIntroWithCow_WithoutCow"); // TREA AREA WITHOUT COW -> INTRO WITH COW
		
		goTreeArea(12, 587, 200, 50, 100, 197, 50,"blank-image.png", "Place Object", "", "", "placeCowRight", "", "",
				"blank-image.png","Place Object", "", "", "placeCowLeft", "", "",
				"blank-image.png", "Look", "lookSomethingNoCowRight", "Look", "lookSomethingNoCowLeft"
				,"goIntroWithoutCow_WithoutCow"); // TREE AREA WITHOUT COW -> INTRO WITHOUT COW
		
		goTreeArea(13, 560, 160, 100, 800, 800, 50, "cow.png","Look", "Talk", "Take", "lookCowRight", "talkCow", "takeCowTreeArea",
				"animal.png","i love you","", "", "easterEgg", "", "",
				"blank-image.png", "Search Tree", "seeSomethingRight", "Look", "lookSomethingWithCowDistance",
				"goIntroWithoutCow_WithCowRight"); // TREE AREA WITH COW RIGHT -> INTRO WITHOUT COW
		
		goTreeArea(14, 300, 250, 65, 60, 160, 100, "lamb.png","i love you", "", "", "easterEggDay1", "", "",
				"cow.png", "Look", "Talk", "Take", "lookCowLeft", "talkCow", "takeCowTreeArea",
				"blank-image.png","Look", "lookSomethingWithCowDistance", "Search Tree", "seeSomethingLeft",
				"goIntroWithoutCow_WithCowLeft"); // TREE AREA WITH COW LEFT -> INTRO WITHOUT COW
		
		goTreeArea(15, 560, 160, 100, 0, 0, 0, "cow.png", "Look", "Talk", "Take", "lookCowRight_withoutKeys", "talkCow", "cantTakeCow",
				"", "", "", "", "", "", "",
				"blank-image.png", "", "", "", "",
				"goIntroWithoutCow_WithCowRightWithoutKeys"); // TREE AREA WITH NO KEYS AND COW RIGHT -> INTRO WITHOUT COW 
		
		goTreeArea(16, 560, 160, 100, 0, 0, 0, "", "", "", "", "", "", "",
				"", "", "", "", "", "", "",
				"blank-image.png", "", "", "", "",
				"goIntroWithoutCow_noGoingBack"); // TREE AREA WITH NO KEYS AND NO COW -> INTRO WITHOUT COW 
		
		
		goCowScene("goIntroWithCow_WithoutCow"); // FUN COW PICTURE
		
		goEasterEgg(19, 355, "dayOne.png", "goTreeAreaWithCowLeft_WithoutCow", "goEasterEggYear1" );
		
		goEasterEgg(20, 325, "yearOne.png", "goEasterEggDay1", "goEasterEggYear2" );
		
		goEasterEgg(21, 900, "yearTwo.png", "goEasterEggYear1", "" );
		

		
		

	}
	
	
}
