import java.awt.Insets;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

// Question page
public class QuestionScene extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Components with id
        Label question = new Label("Här kommer frågorna");
        question.setId("questionId");

        //Creating 4 buttons for answer alternatives
        Button alternative1 = new Button("svar 1");
        Button alternative2 = new Button("svar 2");
        Button alternative3 = new Button("svar 3");
        Button alternative4 = new Button("svar 4");

        //Setting size for buttons
        alternative1.setPrefSize(210, 80);
        alternative2.setPrefSize(210, 80);
        alternative3.setPrefSize(210, 80);
        alternative4.setPrefSize(210, 80);

        // Actiontest for one of the buttons
        alternative1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });

        // Creating FlowPane flow, contains the question
        FlowPane flow = new FlowPane();
        //flow.setPadding(new Insets(10, 10, 10, 10));
        flow.getChildren().add(question);
        flow.setAlignment(Pos.CENTER);

        // Creating Gridpane grid, contains the answers
        GridPane grid = new GridPane();
        //grid.setPadding(10, 10, 10, 10);
        grid.setHgap(20);
        grid.setVgap(20);
        grid.setAlignment(Pos.CENTER);

        grid.add(alternative1, 1, 0);
        grid.add(alternative2, 2, 0);
        grid.add(alternative3, 1, 1);
        grid.add(alternative4, 2, 1);

        // Creating BorderPane, contains the other layouts
        BorderPane root = new BorderPane();
        root.setTop(flow);
        root.setCenter(grid);

        // Creating scene
        Scene scene = new Scene(root, 560, 300);

        // Connect class to css-file
        scene.getStylesheets().add(this.getClass().getResource("Quizstyling.css").toExternalForm());

        // Stage
        primaryStage.setTitle("Quiz Game Question");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
