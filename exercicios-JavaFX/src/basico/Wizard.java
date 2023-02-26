package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Wizard extends Application {

	private Stage janela;
	private Scene passo1;
	private Scene passo2;
	private Scene passo3;
	 
	@Override
	public void start(Stage primaryStage) throws Exception {
		janela = primaryStage;
		
		criarPasso1();
		criarPasso2();
		criarPasso3();
		
		janela.setScene(passo1);
		janela.setTitle("Wizard PASSO #01");
		janela.show();
		
	}
	
	private void criarPasso1() {
		Button proximoPasso = new Button("ir p/ passo 2 ->");
		proximoPasso.setOnAction(e -> {
			janela.setScene(passo2);
			janela.setTitle("PASSO #02");
		});
		
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(proximoPasso);
		
		passo1 = new Scene(box, 400,400);
	}
	
	private void criarPasso2() {
		Button passoAnterior = new Button("<- voltar p/ passo 1");
		 Button proximoPassso2 = new Button("Ir p/ passo 3 ->");
		 
		 proximoPassso2.setOnAction(e -> {janela.setScene(passo3);
		 janela.setTitle("PASSO #03");
		 });
		 passoAnterior.setOnAction(e-> {janela.setScene(passo1);
		 janela.setTitle("Wizard PASSO #01");
		 
		 });
		 
		 	HBox box = new HBox();
		
		 	box.setAlignment(Pos.CENTER);
		 	box.getChildren().add(passoAnterior);
		 	box.getChildren().add(proximoPassso2);
		 	
		 	passo2 = new Scene(box,400,400);
	}
	
	private void criarPasso3() {
		 Button passoAnterior = new Button("<- voltar p/ passo 2");
		 Button finalizar = new Button("Finalizar");
		 
		 finalizar.setOnAction(e->System.exit(0));
		 passoAnterior.setOnAction(e->{janela.setScene(passo2);
		 	janela.setTitle("PASSO #02");
		 });
		 
		 HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(passoAnterior);
		box.getChildren().add(finalizar);
		
		passo3 = new Scene(box,400,400);
		
	}
	
	public static void main(String[] args) {
		
		launch(args);
		
		
	}
	
}
