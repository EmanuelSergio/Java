package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application{

	private int contador = 0 ;
	
	private void atualizarLabelNumero(Label label) {
		label.setText(Integer.toString(contador));
		
		label.getStyleClass().remove("verde");
		label.getStyleClass().remove("vermelha");
		
		if(contador > 0) {
			label.getStyleClass().add("verde");
		}else if (contador < 0) {
			label.getStyleClass().add("vermelha");
		}
		
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		Label labelTitulo = new Label("Contador");
		labelTitulo.getStyleClass().add("titulo");

		Label labelNumero = new Label("0");
		labelNumero.getStyleClass().add("numero");
		
		Button botaoDecremento = new Button("-");
		botaoDecremento.setOnAction(e -> {
			contador--;
			//labelNumero.getStyleClass().add("vermelha");
			atualizarLabelNumero(labelNumero);
			
		});
		
		
		
		Button botaoIncremento = new Button("+");
		botaoIncremento.setOnAction(e -> {
			contador++;
			//labelNumero.getStyleClass().add("verde");
			atualizarLabelNumero(labelNumero);
			
		});
		
		botaoIncremento.getStyleClass().add("botoes");
		botaoDecremento.getStyleClass().add("botoes");
		
		HBox boxBotoes = new HBox();
		boxBotoes.setAlignment(Pos.CENTER);
		boxBotoes.setSpacing(10);
		boxBotoes.getChildren().add(botaoDecremento);
		boxBotoes.getChildren().add(botaoIncremento);
		 
		
		
		VBox boxConteudo = new VBox();
		boxConteudo.getStyleClass().add("conteudo");
		boxConteudo.setSpacing(10);
		boxConteudo.setAlignment(Pos.CENTER);
		boxConteudo.getChildren().add(labelTitulo);		
		boxConteudo.getChildren().add(labelNumero);
		boxConteudo.getChildren().add(boxBotoes);
		
		String caminhoDoCSS = getClass()
				.getResource("/basico/Contador.css")
				.toExternalForm();
		Scene cenaPrincipal = new Scene(boxConteudo, 400, 400);
		
		cenaPrincipal.getStylesheets().add(caminhoDoCSS);
		cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css2?family=Oswald");
		
		primaryStage.setScene(cenaPrincipal);
		primaryStage.show();
		
		
	}
	

	
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	
}
