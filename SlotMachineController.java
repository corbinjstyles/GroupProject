package application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.text.Text;

import java.beans.EventHandler;
import java.util.HashMap;
import java.util.Random;



public class SlotMachineController {
	static boolean bCanPull = false;
	static boolean bHasPulled = false;
	static int money = 15;
	static int wagerAmnt = 0;
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
    //   Improve the UI
    //   Instead of showing the spin result on text, show it via image
    //   Allow the user to set their own wager
    //   Depending on the spin outcome, display that given image in the 'slot'	
    //   Consider Bidimaps instead of using typical hashmaps    																			
    																			
    
    // We call this function whenever the user presses wager1, wager5, or wager15 buttons
    
    // use bHasPulled to make sure the user cannot accidentally put in a shit ton of money
    
    // Each corresponding wager'x' function will decrement user's money by 'x' and allow the user to pull the lever (play the game)
    public void wager1()
    {
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
    
    
    
    
    
    public void pull() 
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
    public void spin() 
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
    	resultLeft.setText(iconVal.get(spinOutcome));
    	resultMiddle.setText(iconVal.get(spinOutcome2));
    	resultRight.setText(iconVal.get(spinOutcome3));
    	
    	
    	
    	// Calculate if the user wins, and sets the reward equal to what is returned from calculateReward
    	int reward = calculateReward(spinOutcome, spinOutcome2, spinOutcome3);
    	wagerAmnt = 0;
    	
    	// Sets winning text to how much money you have won.
    	winningText.setText("Winnings: $" + reward);
    	
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
    	if(left != middle && middle != right && left != right)
    		return reward += 0;
    	else if((left == middle && left != right) || ((left == right) && (left != middle)) || ((middle == right) && (middle != left)))
    		return reward += (2 * wagerAmnt);
    	
    	// Jackpot, triple 7's
    	if(left == 2 && middle == 2 && right == 2) {
    		return reward += ((7 * wagerAmnt) + 77);    		
    	}
    	
    	// Bar reward, triple bar's
    	if(left == 8 && middle == 8 && right == 8) {
    		return reward += ((3 * wagerAmnt) + 45);
    	}
    	
    	// Bell reward, triple bells
    	if(left == 1 && middle == 1 && right == 1)
    	{
    		return reward += ((3 * wagerAmnt) + 15);
    	}
    	
    	// This is for any set of triple that wasn't already caught above.
    	if(left == middle && left == right) {
    		return reward += (3 * wagerAmnt);
    	}
    	
    	
    	return reward;
    	
    }
     
}