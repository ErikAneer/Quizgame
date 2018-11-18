
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/*
 * Java Utveckling 18
 */


public class WaitScene {
    
    public static void setWaitScene(Stage primaryStage){
        // to add-send a signal to server that a player is waiting
        
        Label wait= new Label("Wainting for another player to join. . . . ");
        StackPane stack = new StackPane();
        stack.getChildren().add(wait);
        Scene scene = new Scene(stack,300,300);
        // to add-if a player2 is found then swith to chooseCategoryScene and receive an object with all the categories
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
