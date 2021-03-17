package it.polito.tdp.lab0;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtUsername;

    @FXML
    private TextField txtPassword;

    @FXML
    private Button btnAccedi;
    
    @FXML
    private Label txtMessaggio;
    
    @FXML
    void Accesso(ActionEvent event) {
    	String s= txtUsername.getText();
    	String p= txtPassword.getText(); 
    	boolean numero=false;
    	boolean maiuscolo=false;
    	char arrayP [] = p.toCharArray();
    	
    	for(char pp : arrayP) {
    		if(Character.isDigit(pp))
    			numero=true; 
    	if(Character.isUpperCase(pp))
    		maiuscolo=true;
       
    	}
    	
    	if(s==null || p==null || numero==false ||maiuscolo==false || !p.contains("?")|| !p.contains("!") ||  !p.contains("#")|| ! p.contains("@") || p.length()<6) {
    		txtMessaggio.setText("ACCESSO FALLITO ");
    	
    	}
    	else
    		txtMessaggio.setText("ACCESSO ESEGUITO ");
    	
    	
    }
    	
    

    @FXML
    void initialize() {
        assert txtUsername != null : "fx:id=\"txtUsername\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtPassword != null : "fx:id=\"txtPassword\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnAccedi != null : "fx:id=\"btnAccedi\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtMessaggio != null : "fx:id=\"txtMessaggio\" was not injected: check your FXML file 'Scene.fxml'.";
    }
}
