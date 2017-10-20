/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanprojectjavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author A456U
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private TextField Nama;

    @FXML
    private TextField Absen;

    @FXML
    private TextField Alamat;
    
    @FXML
    private TextField Kelas;

    @FXML
    private Button oke;

    @FXML
    private TextArea Hasil;
    
    @FXML
    void proses(ActionEvent event) {
        String nama = Nama.getText();
        String absen = Absen.getText();
        String alamat = Alamat.getText();
        String kelas = Kelas.getText();
        
        Hasil.setText("Nama Siswa  : "+nama+"\n"+"Absen Siswa  : "+absen+"\n"+"Alamat Siswa : "+alamat+"\n"+
            "Kelas Siswa    : "+kelas+"\n");
        
    }
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
