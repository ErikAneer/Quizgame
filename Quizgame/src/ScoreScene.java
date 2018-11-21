
import java.awt.FlowLayout;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

// Scorepage, shows the score after every round
public class ScoreScene extends Application {
    int i = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {
        // i = round-count. Raises once after every round.
        i++;

        //Components
        Label round = new Label("Result after round "+i);
        round.setId("roundId");
        Label player1= new Label("Username1");
        Label player2= new Label("username2");
        Label score1= new Label("point1");
        Label score2= new Label("point2");

        Button bContinue = new Button("Continue");
        bContinue.setId("bContinueId");

        // Creating GridPane. Contains eveything except continuebutton
        GridPane grid = new GridPane();

        GridPane.setConstraints(round, 3, 0);
        GridPane.setConstraints(player1, 0, 3);
        GridPane.setConstraints(player2, 7, 3);
        GridPane.setConstraints(score1, 0, 5);
        GridPane.setConstraints(score2, 7, 5);
        GridPane.setConstraints(bContinue, 5, 7 );

        grid.getChildren().addAll(round,player1,player2,score1,score2);
        grid.setAlignment(Pos.CENTER);

        // FlowPane. Contains flowbutton
        FlowPane flow = new FlowPane();
        flow.getChildren().add(bContinue);
        flow.setAlignment(Pos.CENTER);

        // Creating BorderPane. Contains the other layouts
        BorderPane root = new BorderPane();
        root.setTop(grid);
        root.setCenter(flow);

        // Scene
        Scene scene = new Scene(root, 560, 300);

        // Connect class to css-file
        scene.getStylesheets().add(this.getClass().getResource("Quizstyling.css").toExternalForm());

        // Stage
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}
