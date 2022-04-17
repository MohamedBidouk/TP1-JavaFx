package tp_interface;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class rectangle extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception{
		Rectangle rect = new Rectangle();
		rect.setX(10);
		rect.setY(20);
		rect.setWidth(100);
		rect.setHeight(100);
		
		Line ligne = new Line();
		ligne.setEndX(90);
		ligne.setEndY(-100);
		ligne.setLayoutX(130);
		ligne.setLayoutY(120);
		
		Circle cercle = new Circle();
		cercle.setCenterX(15);
		cercle.setCenterY(50);
		cercle.setLayoutX(280);
		cercle.setLayoutY(10);
		cercle.setRadius(15);
		cercle.setFill(javafx.scene.paint.Color.ORANGERED);
		
		Group root = new Group();
		root.getChildren().add(rect);
		root.getChildren().add(ligne);
		root.getChildren().add(cercle);
		
		Scene scene = new Scene(root, 400,300);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Exercice 1");
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
