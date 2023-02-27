package layout;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;

public class TesteFlowPane extends FlowPane {

	public TesteFlowPane() {
		
		Quadrado q1 = new Quadrado();
		Quadrado q2 = new Quadrado();
		Quadrado q3 = new Quadrado();
		Quadrado q4 = new Quadrado();
		Quadrado q5 = new Quadrado();
		
		setHgap(10);//da espaço na horizontal entre as caixas
		setVgap(10);//da espaco na vertical entre as caixas
		setPadding(new Insets(10));//esta dando espaço da borda da aplicacao. (é setado como no css)
		
		setOrientation(Orientation.VERTICAL);//vai colocar os elementos na vertical
		setAlignment(Pos.CENTER_RIGHT);
		
		
		
		getChildren().addAll(q1,q2,q3,q4,q5);
		
		
		 
		
	}
	
	
	
}
