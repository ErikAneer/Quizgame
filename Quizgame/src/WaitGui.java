/*
 *  Quiz Game Wait GUI
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class WaitGui extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Label wait= new Label("Wainting for another player to join. . . . ");
        
        StackPane root = new StackPane();
        root.getChildren().add(wait);
        
        Scene scene = new Scene(root, 300, 250);
        //scene.getStylesheets().add(WaitGui.class.getResource("GuiStyle.css").toExternalForm());
        
        primaryStage.setTitle("Quiz Game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

   
    public static void main(String[] args) {
        launch(args);
    }
    
}
