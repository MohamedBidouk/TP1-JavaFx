package tp_interface;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class premiereFenetre extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Group  root=new Group();
		Scene scene = new Scene(root, 300,250, Color.WHITE);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Ma première fenetre");
		primaryStage.show();
		
		
	}
	public static void main(String[] args) {
		launch(args);
	}
	
}
