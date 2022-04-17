package tp_interface;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class inputExample extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Button btn1=new Button("Exit");
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				System.exit(0);
			}
		});
		Label user_id =  new Label("User ID");
		Label password =  new Label("Password");
		
		TextField us = new TextField();
		TextField ps = new TextField();
		
		
		
		String user = "a";
		String pass = "a";
		
		Button b = new Button("Sign in");
		final Text actiontarget = new Text();
		b.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			 public void handle(ActionEvent e) {
				String userInput = us.getText();
				String passwordInput = ps.getText();
				if(userInput.equals(user) && passwordInput.equals(pass)) {
					actiontarget.setFill(Color.GREEN);
				 	actiontarget.setText("Hello "+userInput+" your signed in Succefully!");
				}
				else {
					actiontarget.setFill(Color.FIREBRICK);
				 	actiontarget.setText("Check your log in info!");
				}
			 }
			});
		
		GridPane root = new GridPane();
		root.add(user_id, 0,0);root.add(us, 1,0);
		root.add(password, 0,1);root.add(ps, 1,1);
		root.add(b, 0,2 );root.add(btn1,1,2 );
		root.setAlignment(Pos.CENTER);
		root.setHgap(10);
		root.setVgap(10);
		root.setPadding(new Insets(25, 25, 25, 25));
		root.add(actiontarget, 1, 6);

		
		Scene scene = new Scene(root, 500,450);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Welcome back");
		primaryStage.show();
		
		
	}
	public static void main(String[] args) {
		launch(args);
	}
	
}
