package application;

import java.util.Random;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.*;

public class KenoController {
	 @FXML
	    private TextField tf1;

	    @FXML
	    private TextField tf2;

	    @FXML
	    private TextField tf3;

	    @FXML
	    private TextField tf4;

	    @FXML
	    private TextField tf5;

	    @FXML
	    private TextField tf6;

	    @FXML
	    private TextField tf7;

	    @FXML
	    private TextField tf8;
	    
	    @FXML
	    private TextField tf9;
	    
	    @FXML
	    private TextField tf10;
	    
    @FXML
    private CheckBox cb29;

    @FXML
    private CheckBox cb27;

    @FXML
    private CheckBox cb28;

    @FXML
    private CheckBox cb25;

    @FXML
    private CheckBox cb26;

    @FXML
    private CheckBox cb23;

    @FXML
    private CheckBox cb24;

    @FXML
    private CheckBox cb10;

    @FXML
    private CheckBox cb32;

    @FXML
    private CheckBox cb11;

    @FXML
    private CheckBox cb33;

    @FXML
    private CheckBox cb30;

    @FXML
    private CheckBox cb31;

    @FXML
    private CheckBox cb18;

    @FXML
    private CheckBox cb19;

    @FXML
    private CheckBox cb16;

    @FXML
    private CheckBox cb38;

    @FXML
    private CheckBox cb17;

    @FXML
    private CheckBox cb39;

    @FXML
    private CheckBox cb14;

    @FXML
    private CheckBox cb36;

    @FXML
    private CheckBox cb15;

    @FXML
    private CheckBox cb37;

    @FXML
    private CheckBox cb12;

    @FXML
    private CheckBox cb34;

    @FXML
    private CheckBox cb13;

    @FXML
    private CheckBox cb35;

    @FXML
    private CheckBox cb21;

    @FXML
    private CheckBox cb22;

    @FXML
    private CheckBox cb2;

    @FXML
    private CheckBox cb1;

    @FXML
    private CheckBox cb20;

    @FXML
    private CheckBox cb4;

    @FXML
    private CheckBox cb3;

    @FXML
    private CheckBox cb40;

    @FXML
    private CheckBox cb6;

    @FXML
    private CheckBox cb5;

    @FXML
    private CheckBox cb8;

    @FXML
    private CheckBox cb7;

    @FXML
    private CheckBox cb9;
    
    @FXML
    private Label lblcount;
    
    @FXML
    private Label lblist;
    
    @FXML
    private Label lblist1;
    
    @FXML
    private Button play;
    
    @FXML
    private Label lbmatches;
    
    @FXML
    private TextField betMoney;
    
    @FXML
    private Label moneyAmount;
   
    @FXML
    private TextField win;
    
    @FXML
    private TextField totalWinAmount;
   
    @FXML
    private Text multiplier;

    
    static String message = "";
    @FXML
    static int countNumber = 0;
    
    @FXML
    static Integer finalMoneyAmount = 0;
    
    int data[]= new int[41];
    public void checkEvent(ActionEvent event){
    	int count = 0;
    	
    	
    	if (cb1.isSelected()){
    		count++;
			message += cb1.getText() + "\n";
			data[1]=1;
    	}
    	if (cb2.isSelected()){
    		count++;
    		message += cb2.getText() + "\n";
    		data[2]=2;
    	}
    	if (cb3.isSelected()){
    		count++;
    		message += cb3.getText() + "\n";
    		data[3]=3;
    	}
    	if (cb4.isSelected()){
    		count++;
    		message += cb4.getText() + "\n";
    		data[4]=4;
    	}
    	if (cb5.isSelected()){
    		count++;
    		message += cb5.getText() + "\n";
    		data[5]=5;
    	}
    	if (cb6.isSelected()){
    		count++;
    		message += cb6.getText() + "\n";
    		data[6]=6;
    	}
    	if (cb7.isSelected()){
    		count++;
    		message += cb7.getText() + "\n";
    		data[7]=7;
    	}
    	if (cb8.isSelected()){
    		count++;
    		message += cb8.getText() + "\n";
    		data[8]=8;
    	}
    	if (cb9.isSelected()){
    		count++;
    		message += cb9.getText() + "\n";
    		data[9]=9;
    	}
    	if (cb10.isSelected()){
    		count++;
    		message += cb10.getText() + "\n";
    		data[10]=10;
    	}
    	if (cb11.isSelected()){
    		count++;
    		message += cb11.getText() + "\n";
    		data[11]=11;
    	}
    	if (cb12.isSelected()){
    		count++;
    		message += cb12.getText() + "\n";
    		data[12]=12;
    	}
    	if (cb13.isSelected()){
    		count++;
    		message += cb13.getText() + "\n";
    		data[13]=13;
    	}
    	if (cb14.isSelected()){
    		count++;
    		message += cb14.getText() + "\n";
    		data[14]=14;
    	}
    	if (cb15.isSelected()){
    		count++;
    		message += cb15.getText() + "\n";
    		data[15]=15;
    	}
    	if (cb16.isSelected()){
    		count++;
    		message += cb16.getText() + "\n";
    		data[16]=16;
    	}
    	if (cb17.isSelected()){
    		count++;
    		message += cb17.getText() + "\n";
    		data[17]=17;
    	}
    	if (cb18.isSelected()){
    		count++;
    		message += cb18.getText() + "\n";
    		data[18]=18;
    	}
    	if (cb19.isSelected()){
    		count++;
    		message += cb19.getText() + "\n";
    		data[19]=19;
    	}
    	if (cb20.isSelected()){
    		count++;
    		message += cb20.getText() + "\n";
    		data[20]=20;
    	}
    	if (cb21.isSelected()){
    		count++;
    		message += cb21.getText() + "\n";
    		data[21]=21;
    	}
    	if (cb22.isSelected()){
    		count++;
    		message += cb22.getText() + "\n";
    		data[22]=22;
    	}
    	if (cb23.isSelected()){
    		count++;
    		message += cb23.getText() + "\n";
    		data[23]=23;
    	}
    	if (cb24.isSelected()){
    		count++;
    		message += cb24.getText() + "\n";
    		data[24]=24;
    	}
    	if (cb25.isSelected()){
    		count++;
    		message += cb25.getText() + "\n";
    		data[25]=25;
    	}
    	if (cb26.isSelected()){
    		count++;
    		message += cb26.getText() + "\n";
    		data[26]=26;
    	}
    	if (cb27.isSelected()){
    		count++;
    		message += cb27.getText() + "\n";
    		data[27]=27;
    	}
    	if (cb28.isSelected()){
    		count++;
    		message += cb28.getText() + "\n";
    		data[28]=28;
    	}
    	if (cb29.isSelected()){
    		count++;
    		message += cb29.getText() + "\n";
    		data[29]=29;
    	}
    	if (cb30.isSelected()){
    		count++;
    		message += cb30.getText() + "\n";
    		data[30]=30;
    	}
    	if (cb31.isSelected()){
    		count++;
    		message += cb31.getText() + "\n";
    		data[31]=31;
    	}
    	if (cb32.isSelected()){
    		count++;
    		message += cb32.getText() + "\n";
    		data[32]=32;
    	}
    	if (cb33.isSelected()){
    		count++;
    		message += cb33.getText() + "\n";
    		data[33]=33;
    	}
    	if (cb34.isSelected()){
    		count++;
    		message += cb34.getText() + "\n";
    		data[34]=34;
    	}
    	if (cb35.isSelected()){
    		count++;
    		message += cb35.getText() + "\n";
    		data[35]=35;
    	}
    	if (cb36.isSelected()){
    		count++;
    		message += cb36.getText() + "\n";
    		data[36]=36;
    	}
    	if (cb37.isSelected()){
    		count++;
    		message += cb37.getText() + "\n";
    		data[37]=37;
    	}
    	if (cb38.isSelected()){
    		count++;
    		message += cb38.getText() + "\n";
    		data[38]=38;
    	}
    	if (cb39.isSelected()){
    		count++;
    		message += cb39.getText() + "\n";
    		data[39]=39;
    	}
    	if (cb40.isSelected()){
    		count++;
    		message += cb40.getText() + "\n";
    		data[40]=40;
    	}
    	
    	
    	countNumber= count;
    	
    	lblcount.setText("Items Selected: " + count);
    	
   
    	if(count==1)
    		lblist1.setText("");
    	if(count==2)
    		lblist1.setText("2\t$6\n1\t$2");
    	else if(count==3)
    		lblist1.setText("3\t$12\n2\t$3");
    	else if(count==4)
    		lblist1.setText("4\t$20\n3\t$12\n2\t$4");	
    	else if(count==5)
    		lblist1.setText("5\t$30\n4\t$20\n3\t$5");
    	else if(count==6)
    		lblist1.setText("6\t$42\n5\t$30\n4\t$6");
    	else if(count==7)
    		lblist1.setText("7\t$56\n6\t$42\n5\t$7");
    	else if(count==8)
    		lblist1.setText("8\t$72\n7\t$56\n6\t$8");
    	else if(count==9)
    		lblist1.setText("9\t$90\n8\t$72\n7\t$9");
    	else if(count==10)
    		lblist1.setText("10\t$100\n9\t$90\n8\t$10");
    	else if(count==11)
    		lblist1.setText("No Prize / More than 10 numbers selected");

    }

    
    @FXML
    void playGame(ActionEvent event) {
    	Integer cost = Integer.parseInt(betMoney.getText());
		 Integer money = Integer.parseInt(moneyAmount.getText());
		 cost= money - cost;
		 moneyAmount.setText(cost.toString());
		 finalMoneyAmount = cost;
		 
    	Random ram = new Random();
    	int[] ramList = new int[10];
    	ramList[0] = ram.nextInt(40)+1;
    	ramList[1] = ram.nextInt(40)+1;
    	ramList[2] = ram.nextInt(40)+1;
    	ramList[3] = ram.nextInt(40)+1;
    	ramList[4] = ram.nextInt(40)+1;
    	ramList[5] = ram.nextInt(40)+1;
    	ramList[6] = ram.nextInt(40)+1;
    	ramList[7] = ram.nextInt(40)+1;
    	ramList[8] = ram.nextInt(40)+1;
    	ramList[9] = ram.nextInt(40)+1;
    	
for(int i=0; i<ramList.length; i++){
	int val;
	for(int j=0; j<i; j++){
		if(ramList[i] > ramList[j]){
			val = ramList[j];
			ramList[j] = ramList[i];
			ramList[i] = val;
		}
	}
}
tf1.setText(String.valueOf(ramList[0]));
tf2.setText(String.valueOf(ramList[1]));
tf3.setText(String.valueOf(ramList[2]));
tf4.setText(String.valueOf(ramList[3]));
tf5.setText(String.valueOf(ramList[4]));
tf6.setText(String.valueOf(ramList[5]));
tf7.setText(String.valueOf(ramList[6]));
tf8.setText(String.valueOf(ramList[7]));
tf9.setText(String.valueOf(ramList[8]));
tf10.setText(String.valueOf(ramList[9]));

Integer match = 0;
for(int i=0; i<ramList.length; i++){
	for(int j=1; j<data.length; j++){
		if(ramList[i]==data[j]){
			match++;
		}
			else{
			match = match;
			}
		
	}
}
//match -= 1;
lbmatches.setText(match.toString());
Integer []winAmount = {6, 2, 12, 3, 20, 12, 4, 30, 20, 5, 42, 30, 6, 56, 42, 30, 6, 56, 42, 7, 72, 56, 8, 90, 72, 9, 100, 90, 10};
Integer x = 0;
switch(match){
case 0: 
	win.setText("0");
	break;
case 1:
	if(countNumber==2)
		win.setText(winAmount[2].toString());
	else
		win.setText(x.toString());
	break;
case 2:
	if(countNumber==2)
		win.setText(winAmount[0].toString());
	else if(countNumber==3)
		win.setText(winAmount[3].toString());
	else if(countNumber==4)
		win.setText(winAmount[6].toString());
	else
		win.setText(x.toString());
	break;
case 3:
	if(countNumber==3)
		win.setText(winAmount[2].toString());
	else if(countNumber==4)
		win.setText(winAmount[2].toString());
	else if(countNumber==5)
		win.setText(winAmount[9].toString());
	else
		win.setText(x.toString());
	break;
case 4:
	if(countNumber==4)
		win.setText(winAmount[4].toString());
	else if(countNumber==5)
		win.setText(winAmount[4].toString());
	else if(countNumber==6)
		win.setText(winAmount[0].toString());
	else
		win.setText(x.toString());
	break;
case 5:
	if(countNumber==5)
		win.setText(winAmount[7].toString());
	else if(countNumber==6)
		win.setText(winAmount[7].toString());
	else if(countNumber==7)
		win.setText(winAmount[19].toString());
	else
		win.setText(x.toString());
	break;
case 6:
	if(countNumber==6)
		win.setText(winAmount[10].toString());
	else if(countNumber==7)
		win.setText(winAmount[10].toString());
	else if(countNumber==8)
		win.setText(winAmount[22].toString());
	else
		win.setText(x.toString());
	break;
case 7:
	if(countNumber==7)
		win.setText(winAmount[17].toString());
	else if(countNumber==8)
		win.setText(winAmount[13].toString());
	else if(countNumber==9)
		win.setText(winAmount[25].toString());
	else
		win.setText(x.toString());
	break;
case 8:
	if(countNumber==8)
		win.setText(winAmount[20].toString());
	else if(countNumber==9)
		win.setText(winAmount[20].toString());
	else if(countNumber==10)
		win.setText(winAmount[28].toString());
	else
		win.setText(x.toString());
	break;
case 9:
	if(countNumber==9)
		win.setText(winAmount[23].toString());
	else if(countNumber==10)
		win.setText(winAmount[23].toString());
	else
		win.setText(x.toString());
	break;
case 10:
	if(countNumber==10)
		win.setText(winAmount[26].toString());
	else
		win.setText(x.toString());
	break;
}

Integer bet = Integer.parseInt(betMoney.getText());
Integer winnings = Integer.parseInt(win.getText());
finalMoneyAmount = finalMoneyAmount + winnings * bet;
Integer multiplierMoney = winnings * bet;
multiplier.setText("* " + bet.toString() + "= " + multiplierMoney);
moneyAmount.setText(finalMoneyAmount.toString());	
totalWinAmount.setText(multiplierMoney.toString());
}
    @FXML
    void goToHomeScreen(ActionEvent event) throws IOException{
    	Parent tableViewParent = FXMLLoader.load(getClass().getResource("Selection.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        
Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(tableViewScene);
        window.show();
    }

}