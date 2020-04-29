package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MainController {

    @FXML
    private ImageView vegasBackground;
	
    @FXML
    private AnchorPane mainScreen;

    @FXML
    private Button playButton;
    
    @FXML
    private TextField amount;
    
    @FXML
    private Text message;

    @FXML
    void playClick(ActionEvent event) throws IOException {
    	System.out.println("You clicked play");
    	mainScreen = FXMLLoader.load(getClass().getResource("Selection.fxml"));// pane you are GOING TO
        Scene scene = new Scene(mainScreen);// pane you are GOING TO show
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
        window.setScene(scene);
        window.show();
    }

}
