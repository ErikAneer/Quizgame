
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/*
 * Java Utveckling 18
 */


public class StartScene {
 public static void setStartScene(Stage primaryStage){
     // startScene
        Button okButton = new Button();
        okButton.setText("Play!");
        Label userRequest = new Label();
        userRequest.setText("Username?:");
        Label title= new Label("Quiz Game");
        TextField userName = new TextField();
       
        //Lambda expression 
        okButton.setOnAction(e -> WaitScene.setWaitScene(primaryStage));
        //creating borderpane
        BorderPane root = new BorderPane();
        root.setId("rootcolor");
        // creating FlowPane
        FlowPane flowpane = new FlowPane();
        flowpane.getChildren().add(userRequest);
        flowpane.getChildren().add(userName);
        flowpane.getChildren().add(title);
        root.setTop(flowpane);
        root.setCenter(okButton);
        flowpane.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(root,300,300);
        scene.getStylesheets().add(StartGui.class.getResource("GuiStyle.css").toExternalForm());
        
        primaryStage.setTitle("Quiz Game");
        primaryStage.setScene(scene);
        primaryStage.show();
       
 }
}
