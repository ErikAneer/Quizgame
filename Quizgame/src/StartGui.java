/**
 * Quiz Game Start Gui
 */
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class StartGui extends Application {
    Scene scene1,scene2;
    
    @Override
    public void start(Stage primaryStage) {
        //tillhör scene1
        Button okButton = new Button();
        okButton.setText("Play!");
        Label userRequest = new Label();
        userRequest.setText("Username?: ");
        Label title= new Label("Quiz Game");
        TextField userName = new TextField();
        userName.setPromptText("Username ");
        
        
        
        
        //Lambda expression
        okButton.setOnAction(e -> primaryStage.setScene(scene2));
        
        BorderPane root = new BorderPane();
        
        root.setId("rootcolor");
        
        FlowPane flowpane = new FlowPane();
        
        flowpane.getChildren().add(userRequest);
        
        flowpane.getChildren().add(userName);
        flowpane.getChildren().add(title);
        root.setTop(flowpane);
        root.setCenter(okButton);
        flowpane.setAlignment(Pos.CENTER);
        
        scene1 = new Scene(root, 300, 300);
        scene1.getStylesheets().add(StartGui.class.getResource("GuiStyle.css").toExternalForm());
        //tillhör scene2
        Label wait= new Label("Wainting for another player to join. . . . ");
        StackPane stack = new StackPane();
        stack.getChildren().add(wait);
        scene2 = new Scene(stack,300,300);
        //scene3
        
        
        
        primaryStage.setTitle("Quiz Game");
        primaryStage.setScene(scene1);
        primaryStage.show();
       
    }
   
    public static void main(String[] args) {
        launch(args);
    }
    
}
