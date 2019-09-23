package Main;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

	private Label ComLabel;
	private Button ComButton;
	private TextField nombreText;

	@Override	
	public void start(Stage primaryStage) throws Exception {
		nombreText = new TextField();
		nombreText.setPromptText("Introduce la palabra: ");
		nombreText.setMaxWidth(150);
		
		ComButton = new Button("Comprobar");
		ComButton.setDefaultButton(true);
		ComButton.setOnAction(e -> onSaludarButtonAction(e));
		
		ComLabel = new Label("Comprobacion");
		ComLabel.setWrapText(true);
		
		VBox root = new VBox();
		root.setSpacing(5);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(nombreText, ComButton, ComLabel);
		
		Scene scene = new Scene(root,320,200);
		primaryStage.setTitle("Palindrome");		
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

	private void onSaludarButtonAction(ActionEvent e) {
		// TODO Auto-generated method stub
		String palabra = nombreText.getText();
		boolean comprobar = palabra.equals(new StringBuilder(palabra).reverse().toString());
		if(comprobar) {
			
			ComLabel.setText("Es palindromo");
			ComLabel.setStyle("-fx-text-fill: green; -fx-font: bold 30 consolas;");
			
		}else{
			ComLabel.setText("No es palindromo");
			ComLabel.setStyle("-fx-text-fill: red; -fx-font: bold 30 consolas;");
		}
		
	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
