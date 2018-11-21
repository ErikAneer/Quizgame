import javafx.application.Application;
import static javafx.application.Application.launch;
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

// Last page
public class EndScene extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {

        //Components
        //String winner = " ";
        Label result = new Label("The game is over. Result: ");
        result.setId("resultId");
        Label player1= new Label("Username1");
        Label player2= new Label("username2");
        Label score1= new Label("point1");
        Label score2= new Label("point2");

        Button newGame = new Button("New Game");
        newGame.setId("newGameId");

        Button exit = new Button("End game");
        exit.setId("exitId");

        // Creating GridPane. Contains eveything except continuebutton
        GridPane grid = new GridPane();

        GridPane.setConstraints(result, 3, 0);
        GridPane.setConstraints(player1, 0, 3);
        GridPane.setConstraints(player2, 7, 3);
        GridPane.setConstraints(score1, 0, 5);
        GridPane.setConstraints(score2, 7, 5);
        //GridPane.setConstraints(, 5, 7 );

        grid.getChildren().addAll(result,player1,player2,score1,score2);
        grid.setAlignment(Pos.CENTER);



        FlowPane flow2 = new FlowPane();
        flow2.getChildren().add(newGame);
        flow2.getChildren().add(exit);
        flow2.setAlignment(Pos.CENTER);


        // Creating BorderPane. Contains the other layouts
        BorderPane root = new BorderPane();
        root.setTop(grid);
        root.setCenter(flow2);

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
