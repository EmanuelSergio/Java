package fxml;

import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControlador {

	@FXML
	private TextField campoEmail;
	
	@FXML
	private PasswordField campoSenha;
	
	
	
	public void entrar() {
	
		boolean emailValido = campoEmail.getText().equals("emanuel@gmail.com");
		boolean senhaValida = campoSenha.getText().equals("20142015");
		String arquivoCSS = getClass().getResource("/fxml/Login.css").toExternalForm();
		
		if(emailValido && senhaValida) {
			Notifications.create()
			.position(Pos.TOP_LEFT)
			.title("LOGIN FXML")
			.text("Login efetuado com sucesso")
			.showInformation();
			
		}else {
			Notifications.create()
			.position(Pos.TOP_LEFT)
			.title("LOGIN FXML")
			.text("Login nao cadastrado")
			.showError();
		}

		
		
		
	}
	
	
	
	
	
}
