// Author: Aaron Brown, pvt707
package application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.beans.EventHandler;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;

import application.controller.UserController;



public class SlotMachineController {
	static boolean bCanPull = false;
	static boolean bHasPulled = false;
	static int money = 150;            //EDIT THIS OUT
	static int wagerAmnt = 0;
	static int winAmnt = 0;
    @FXML
    private Button wager1;	// Wager 1 buck (or coin)

    @FXML
    private Text resultLeft;

    @FXML
    private Button wagerButton;

    @FXML
    private Button quitButton;

    @FXML
    private Button pullButton;

    @FXML
    private Button wager15;	//Wager 15 bucks (or coins)

    @FXML
    private Text resultMiddle;

    @FXML
    private Button wager5;	// Wager 5 bucks (or coins)

    @FXML
    private Text moneyLeft;

    @FXML
    private Text resultRight;
    
    @FXML
    private Text winningText;
    
    @FXML
    private Text warningText;
    
    @FXML
    private ImageView imgSlot1;

    @FXML
    private ImageView imgSlot2;
    
    @FXML
    private ImageView imgSlot3;

    @FXML
    private TextArea custWagerTextArea;
    
    @FXML
    private Button custWagerButton;
    
    @FXML
    private Text earningsLosses;
    
    
    // Potential Slot Icons
    /*	Water melon = 0
    	Bell 	    = 1
    	7 Icon      = 2
    	Pear        = 3
    	Cherry      = 4
    	Pineapple   = 5
    	Grape       = 6
    	Orange      = 7
    	Bar			= 8   */
    
    // HashMap that stores all of our potential keys and values
    static HashMap<Integer, String> iconVal = new HashMap<Integer, String>() {{ put(0, "Water melon");
    																			put(1, "Bell"); 
    																			put(2, "7 Icon"); 
    																			put(3, "Pear"); 
    																			put(4, "Cherry"); 
    																			put(5, "Pineapple"); 
    																			put(6, "Grape"); 
    																			put(7, "Orange"); 
    																			put(8, "Bar");}};

    
    
    
    // To Do:
    //   Show earnings/losses as well as total money
    //   Make the quit screen go back to selection.fxml
    //  
    //  
    //    																			
    																			
    
    // We call this function whenever the user presses wager1, wager5, or wager15 buttons
    
    // use bHasPulled to make sure the user cannot accidentally put in a shit ton of money
    
    // Each corresponding wager'x' function will decrement user's money by 'x' and allow the user to pull the lever (play the game)
    public void wager1()
    {
    	moneyLeft.setText("$" + money);
    	if(money == 0)
    	{
    		bCanPull = false;
    		warningText.setText("Warning: You do not have enough money to wager $1");
    	}
    	else if(bHasPulled == false)
    	{	
    		money -= 1;
    		moneyLeft.setText("$" + money);
    		bCanPull = true;
    		bHasPulled = true;
    		wagerAmnt = 1;
    	}
    }
    
    public void wager5()
    {
    	moneyLeft.setText("$" + money);
    	if(money <= 4)
    	{
    		bCanPull = false;
    		warningText.setText("Warning: You do not have enough money to wager $5");
    	}
    	else if(bHasPulled == false)
    	{	
    		money -= 5;
    		moneyLeft.setText("$" + money);
    		bCanPull = true;
    		bHasPulled = true;
    		wagerAmnt = 5;
    	}
    }
    
    public void wager15()
    {
    	moneyLeft.setText("$" + money);
    	if(money < 15)
    	{
    		bCanPull = false;
    		warningText.setText("Warning: You do not have enough money to wager $15");
    	}
    	else if(bHasPulled == false)
    	{	
    		money -= 15;
    		moneyLeft.setText("$" + money);
    		bCanPull = true;
    		bHasPulled = true;
    		wagerAmnt = 15;
    	}
    }
    
    public void wagerCustom()
    {
    	moneyLeft.setText("$" + money);
    	int customWager = Integer.parseInt(custWagerTextArea.getText());
    	if(money < customWager)
    	{
    		bCanPull = false;
    		warningText.setText("Warning you do not have enough money for your custom wager");
    	}
    	else if(bHasPulled == false)
    	{
    		money -= customWager;
    		moneyLeft.setText("$" +money);
    		bCanPull = true;
    		bHasPulled = true;
    		wagerAmnt = customWager;
    	}
    }
    
    
    
    
    public void pull() throws FileNotFoundException 
    {
    	// We get bCanPull as true once the user has wagered some amount of coins/money
    	if(bCanPull == true)
    	{
    		spin();
    	}
    	
    	if(bCanPull = false)
    	{
    		System.out.println("bCanPull is false");
    	}
    	
    	
    }
    
    
    // This is the spin function where the value for each slot is assigned randomly
    public void spin() throws FileNotFoundException 
    {
    	// Used for deciding what the slot result will be
    	Random random = new Random();
    	
    	/*	Water melon = 0
    		Bell 	    = 1
    		7 Icon      = 2
    		Pear        = 3
    		Cherry      = 4
    		Pineapple   = 5
    		Grape       = 6
    		Orange      = 7
    		Bar			= 8   */ 
    	
    	// USE A HASHTABLE / HASHMAP FOR STORAGE OF ICONS AND THEIR NUMERICAL VALUES
    	
    	
    	// spinOutcome will be a number between 0 - 8, each number will correspond to a result
    	int spinOutcome = random.nextInt(9);
    	int spinOutcome2 = random.nextInt(9);
    	int spinOutcome3 = random.nextInt(9);
    	
    	
    	// This sets the 'slots' text equal to the matching value in the hashmap
    	/*resultLeft.setText(iconVal.get(spinOutcome));
    	resultMiddle.setText(iconVal.get(spinOutcome2));
    	resultRight.setText(iconVal.get(spinOutcome3));*/
    	
    	setSlots(spinOutcome, spinOutcome2, spinOutcome3);
    	
    	// Calculate if the user wins, and sets the reward equal to what is returned from calculateReward
    	int reward = calculateReward(spinOutcome, spinOutcome2, spinOutcome3);
    	wagerAmnt = 0;
    	
    	// Sets winning text to how much money you have won.
    	winningText.setText("Winnings: $" + reward);
    	earningsLosses.setText("" +winAmnt);
    	
    	// reward is added to the users current money
    	money += reward;
    	
    	// set the money left text to the current money amount
    	moneyLeft.setText("$" + money);
    	
    	
    	// set bCanPull and bHasPulled to false. These are used so the user doesn't do too many actions basically...
    	bCanPull = false;
    	bHasPulled = false;
    }
    
    
    
    // This function calculates whether the user has won or not
    public int calculateReward(int left, int middle, int right)
    {
    	int reward = 0;
    	
    	
    	// Loser, no matches at all
    	if(left != middle && middle != right && left != right) {
    		winAmnt -= wagerAmnt;
    		return reward += 0;
    	}
    	else if((left == middle && left != right) || ((left == right) && (left != middle)) || ((middle == right) && (middle != left))) {
    		winAmnt += reward + (2 * wagerAmnt);
    		return reward += (2 * wagerAmnt);
    	}
    	
    	// Jackpot, triple 7's
    	if(left == 2 && middle == 2 && right == 2) {
    		winAmnt += reward + ((7 * wagerAmnt) + 77);
    		return reward += ((7 * wagerAmnt) + 77);    		
    	}
    	
    	// Bar reward, triple bar's
    	if(left == 8 && middle == 8 && right == 8) {
    		winAmnt += reward + ((3 * wagerAmnt) + 45);
    		return reward += ((3 * wagerAmnt) + 45);
    	}
    	
    	// Bell reward, triple bells
    	if(left == 1 && middle == 1 && right == 1)
    	{
    		winAmnt += reward + ((3 * wagerAmnt) + 15);
    		return reward += ((3 * wagerAmnt) + 15);
    	}
    	
    	// This is for any set of triple that wasn't already caught above.
    	if(left == middle && left == right) {
    		winAmnt += reward + (3 * wagerAmnt);
    		return reward += (3 * wagerAmnt);
    	}
    	
    	
    	return reward;
    	
    }
     
    
    // This will be used to set the slot images
    public void setSlots(int slot1, int slot2, int slot3) throws FileNotFoundException
    {
    	// imgSlot1  imgSlot2   imgSlot3
    	
    	/*	Water melon = 0
		Bell 	    = 1
		7 Icon      = 2
		Pear        = 3
		Cherry      = 4
		Pineapple   = 5
		Grape       = 6
		Orange      = 7
		Bar			= 8   */ 
    	
    	// Yes I know this is really dog shit programming work, but I'm trying to get it working
    	// before I try to optimize its usage.
    	
    	
    	switch(slot1) {
    		case 0:
    			FileInputStream input = new FileInputStream("src/resources/watermelon.png");
    	    	Image image = new Image(input);
    			imgSlot1.setImage(image);
    			break;
    		case 1:
    			input = new FileInputStream("src/resources/bell.png");
    			image = new Image(input);
    			imgSlot1.setImage(image);
    			break;
    		case 2:
    			input = new FileInputStream("src/resources/7 icon.png");
    	    	image = new Image(input);
    			imgSlot1.setImage(image);
    			break;
    		case 3:
    			input = new FileInputStream("src/resources/pear.png");
    	    	image = new Image(input);
    			imgSlot1.setImage(image);
    			break;
    		case 4:
    			input = new FileInputStream("src/resources/cherry.png");
    	    	image = new Image(input);
    			imgSlot1.setImage(image);
    			break;
    		case 5:
    			input = new FileInputStream("src/resources/pineapple.png");
    	    	image = new Image(input);
    			imgSlot1.setImage(image);
    			break;
    		case 6:
    			input = new FileInputStream("src/resources/grape.png");
    	    	image = new Image(input);
    			imgSlot1.setImage(image);
    			break;
    		case 7:
    			input = new FileInputStream("src/resources/orange.png");
    	    	image = new Image(input);
    			imgSlot1.setImage(image);
    			break;
    		case 8:
    			input = new FileInputStream("src/resources/bar.png");
    	    	image = new Image(input);
    			imgSlot1.setImage(image);
    			break;
    	}
    	
    	
    	switch(slot2) {
			case 0:
				FileInputStream input = new FileInputStream("src/resources/watermelon.png");
				Image image = new Image(input);
				imgSlot2.setImage(image);
				break;
			case 1:
				input = new FileInputStream("src/resources/bell.png");
				image = new Image(input);
				imgSlot2.setImage(image);
				break;
			case 2:
				input = new FileInputStream("src/resources/7 icon.png");
				image = new Image(input);
				imgSlot2.setImage(image);
				break;
			case 3:
				input = new FileInputStream("src/resources/pear.png");
				image = new Image(input);
				imgSlot2.setImage(image);
				break;
			case 4:
				input = new FileInputStream("src/resources/cherry.png");
				image = new Image(input);
				imgSlot2.setImage(image);
				break;
			case 5:
				input = new FileInputStream("src/resources/pineapple.png");
				image = new Image(input);
				imgSlot2.setImage(image);
				break;
			case 6:
				input = new FileInputStream("src/resources/grape.png");
				image = new Image(input);
				imgSlot2.setImage(image);
				break;
			case 7:
				input = new FileInputStream("src/resources/orange.png");
				image = new Image(input);
				imgSlot2.setImage(image);
				break;
			case 8:
				input = new FileInputStream("src/resources/bar.png");
				image = new Image(input);
				imgSlot2.setImage(image);
				break;
    	}
    	
    	
    	switch(slot3) {
			case 0:
				FileInputStream input = new FileInputStream("src/resources/watermelon.png");
				Image image = new Image(input);
				imgSlot3.setImage(image);
				break;
			case 1:
				input = new FileInputStream("src/resources/bell.png");
				image = new Image(input);
				imgSlot3.setImage(image);
				break;
			case 2:
				input = new FileInputStream("src/resources/7 icon.png");
				image = new Image(input);
				imgSlot3.setImage(image);
				break;
			case 3:
				input = new FileInputStream("src/resources/pear.png");
				image = new Image(input);
				imgSlot3.setImage(image);
				break;
			case 4:
				input = new FileInputStream("src/resources/cherry.png");
				image = new Image(input);
				imgSlot3.setImage(image);
				break;
			case 5:
				input = new FileInputStream("src/resources/pineapple.png");
				image = new Image(input);
				imgSlot3.setImage(image);
				break;
			case 6:
				input = new FileInputStream("src/resources/grape.png");
				image = new Image(input);
				imgSlot3.setImage(image);
				break;
			case 7:
				input = new FileInputStream("src/resources/orange.png");
				image = new Image(input);
				imgSlot3.setImage(image);
				break;
			case 8:
				input = new FileInputStream("src/resources/bar.png");
				image = new Image(input);
				imgSlot3.setImage(image);
				break;
    	}
    	
    	
    }
    
    public void changeScreenButtonPushedSelection(ActionEvent event) throws IOException
    {
    	
    	
    	// The actual screen changing methods
    	Parent userView = FXMLLoader.load(getClass().getResource("Selection.fxml"));
    	Scene userViewScene = new Scene(userView);
    	Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	window.setScene(userViewScene);
    	
    	window.show();
    	
    }
    
    
}