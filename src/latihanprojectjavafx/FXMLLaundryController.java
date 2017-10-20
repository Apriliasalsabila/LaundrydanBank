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
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author A456U
 */
public class FXMLLaundryController implements Initializable {

    @FXML
    private RadioButton rdbCK;
    @FXML
    private ToggleGroup PilihanPaket;
    @FXML
    private RadioButton rdbCKS;
    @FXML
    private RadioButton rdbS;
    @FXML
    private TextField Nama;
    @FXML
    private TextField Alamat;
    @FXML
    private TextField Berat;
    @FXML
    private TextField tlpn;
    @FXML
    private TextField tgl;
    @FXML
    private Button oke;
    @FXML
    private Button Hapus;
    @FXML
    private TextArea Hasil;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void proses(ActionEvent event) {
        String paket;
        int harga = 0;
        

        if(rdbCK.isSelected())
        paket = "Cuci Kering";
        else if (rdbCKS.isSelected())
        paket = "Cuci Kering Setrika";
        else if (rdbS.isSelected())
        paket = "Setrika";
        else
        paket = "";
        
        if(!(rdbCK.isSelected() ||  rdbCKS.isSelected() ||  rdbS.isSelected() )){
            JOptionPane.showMessageDialog(null, "Harap Pilih Paket Layanan");
        }else{
        String nama = Nama.getText();
        String alamat = Alamat.getText();
        String berat = Berat.getText();
        String Tgl = tgl.getText();
        
        int hitung = Integer.parseInt(Berat.getText());
        
        if (rdbCK.isSelected())
        harga = hitung*5000;
        if (rdbCKS.isSelected())
        harga = hitung*8000;
        if (rdbS.isSelected())
        harga = hitung*4000;
        String tlp = tlpn.getText(); 
        
        Hasil.setText("Nama : "+nama+"\n"+"Alamat : "
                +alamat+"\n"+"Berat Cucian : "+berat+"\n"+
            "Nomer Telpon : "+tlp+"\n"+"Pilihan Paket : "+paket+"\n"+"Tanggal Pengambilan :"+Tgl+"\n"+"Pembayaran yang harus dibayar : Rp. " +harga);
    }
    
    }
    @FXML
    private void hapus(ActionEvent event) {
    }
    
}
