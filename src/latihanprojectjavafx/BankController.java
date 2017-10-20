/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanprojectjavafx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;


/**
 * FXML Controller class
 *
 * @author A456U
 */
public class BankController implements Initializable {
    String pin = "";
    String PIN = "1234";
    int kesempatan = 3;
    int tmp;
    
    @FXML
    private TextField editpin;
    @FXML
    private Button b1;
    @FXML
    private Button b2;
    @FXML
    private Button b3;
    @FXML
    private Button b4;
    @FXML
    private Button b5;
    @FXML
    private Button b6;
    @FXML
    private Button b7;
    @FXML
    private Button b8;
    @FXML
    private Button b9;
    @FXML
    private Button bc;
    @FXML
    private Button b0;
    @FXML
    private Button ok;

    
    @FXML
    private void tekan1(ActionEvent event) {
        pin +="1";
           editpin.setText(pin);
    }

    @FXML
    private void tekan2(ActionEvent event) {
        pin +="2";
           editpin.setText(pin);
    }

    @FXML
    private void tekan3(ActionEvent event) {
         pin +="3";
           editpin.setText(pin);
    }

    @FXML
    private void tekan4(ActionEvent event) {
        pin +="4";
           editpin.setText(pin);
    }

    @FXML
    private void tekan5(ActionEvent event) {
        pin +="5";
           editpin.setText(pin);
    }

    @FXML
    private void tekan6(ActionEvent event) {
        pin +="6";
           editpin.setText(pin);
    }

    @FXML
    private void tekan7(ActionEvent event) {
        pin +="7";
           editpin.setText(pin);
    }

    @FXML
    private void tekan8(ActionEvent event) {
        pin +="8";
           editpin.setText(pin);
    }

    @FXML
    private void tekan9(ActionEvent event) {
        pin +="9";
           editpin.setText(pin);
    }

    @FXML
    private void tekanc(ActionEvent event) {
         pin +="";
           editpin.setText(pin);
    }

    @FXML
    private void tekan0(ActionEvent event) {
        pin +="0";
           editpin.setText(pin);
    }

    @FXML
    private void tekanok(ActionEvent event) {
        if (pin.equals(PIN)){
                try {
                    ( (Node)(event.getSource())).getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("Bang2.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 830, 450);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("MenuAwal");
                stage.show();
                } catch(IOException e){
                    System.out.println("Failed to create new Window."+e);
                }
            }else{
                kesempatan -=1;
                JOptionPane.showMessageDialog(null, "PIN Salah \nTersisa" + kesempatan + "kesempatan lagi!");
                editpin.setText("");
                pin ="";
                if(kesempatan == 0){
                    System.exit(0);
                }
                }
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    

}