package fxml;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControlador {

	@FXML
	private TextField campoEmail;
	
	@FXML
	private PasswordField campoSenha;
	
	
	
	public void entrar() {
		
		System.out.println("Entrar...");
		System.out.println(campoEmail.getText());
		System.out.println(campoSenha.getText());
		
	}
	
	
	
}
