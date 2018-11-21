import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

// Loadingpage while waiting for another player to connect
public class WaitScene extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Labelcomponent with waiting message and id
        Label wait = new Label("Waiting for another player to join...");
        wait.setId("waitId");

        // Creating Stackpane and adding label
        StackPane root = new StackPane();
        root.getChildren().add(wait);

        // Creating scene
        Scene scene = new Scene(root, 560, 300);

        // Connect class to css-file
        scene.getStylesheets().add(this.getClass().getResource("Quizstyling.css").toExternalForm());

        // Stage
        primaryStage.setTitle("Quiz Game Loading");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}
