import javafx.application.Application;
import static javafx.application.Application.launch;
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
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class CategoryScene extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Components with id
        Label categories = new Label("Choose category: ");
        categories.setId("categoriesId");

        //Creating 4 buttons for category alternatives
        Button category1 = new Button("category 1");
        Button category2 = new Button("category 2");
        Button category3 = new Button("category 3");
        Button category4 = new Button("category 4");
        Button category5 = new Button("category 5");
        Button category6 = new Button("category 6");

        //Setting size for buttons
        category1.setPrefSize(210, 80);
        category2.setPrefSize(210, 80);
        category3.setPrefSize(210, 80);
        category4.setPrefSize(210, 80);
        category5.setPrefSize(210, 80);
        category6.setPrefSize(210, 80);

        // Actiontest for one of the buttons
        category1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });

        // Creating FlowPane flow, contains categories-label
        FlowPane flow = new FlowPane();
        //flow.setPadding(new Insets(10, 10, 10, 10));
        flow.getChildren().add(categories);
        flow.setAlignment(Pos.CENTER);

        // Creating Gridpane grid, contains the categories
        GridPane grid = new GridPane();
        //grid.setPadding(10, 10, 10, 10);
        grid.setHgap(20);
        grid.setVgap(20);
        grid.setAlignment(Pos.CENTER);

        grid.add(category1, 1, 0);
        grid.add(category2, 2, 0);
        grid.add(category3, 1, 1);
        grid.add(category4, 2, 1);
        grid.add(category5, 1, 2);
        grid.add(category6, 2, 2);

        // Creating BorderPane, contains the other layouts
        BorderPane root = new BorderPane();
        root.setTop(flow);
        root.setCenter(grid);

        // Layoutsolution to get a gap at the bottom
        FlowPane flow2 = new FlowPane();
        Label empty = new Label(" ");
        empty.setId("emptyId");
        flow2.getChildren().add(empty);
        root.setBottom(flow2);

        // Creating scene
        Scene scene = new Scene(root, 560, 300);

        // Connect class to css-file
        scene.getStylesheets().add(this.getClass().getResource("Quizstyling.css").toExternalForm());

        // Stage
        primaryStage.setTitle("Quiz Game Categories");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
