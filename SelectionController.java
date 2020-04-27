package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SelectionController {

    @FXML
    private AnchorPane selectionScreen;

    @FXML
    private Button back;

    @FXML
    void backToTitleScreen(ActionEvent event) throws IOException {
    	System.out.println("You clicked back to home");
    	selectionScreen = FXMLLoader.load(getClass().getResource("Main.fxml"));// pane you are GOING TO
        Scene scene = new Scene(selectionScreen);// pane you are GOING TO show
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
        window.setScene(scene);
        window.show();
    }

    @FXML
    void kenoClick(ActionEvent event) {

    }

    @FXML
    void rouletteClick(ActionEvent event) {

    }

    @FXML
    void slotClick(ActionEvent event) throws IOException {
    	System.out.println("You clicked slot");
    	selectionScreen = FXMLLoader.load(getClass().getResource("SlotMachine.fxml"));// pane you are GOING TO
        Scene scene = new Scene(selectionScreen);// pane you are GOING TO show
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
        window.setScene(scene);
        window.show();
    }

}