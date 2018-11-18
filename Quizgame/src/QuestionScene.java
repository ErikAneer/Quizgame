
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/*
 * Java Utveckling 18
 */


public class QuestionScene {
 public static void setQuestionScene(Stage primaryStage){
     Label question = new Label("Question?");
        
        Button alternativ1 = new Button("answer1");
        Button alternativ2 = new Button("answer2");
        Button alternativ3 = new Button("answer3");
        Button alternativ4 = new Button("answer4");
        
        
        
        alternativ1.setPrefSize(250, 100);
        alternativ2.setPrefSize(250, 100);
        alternativ3.setPrefSize(250, 100);
        alternativ4.setPrefSize(250, 100);
        
        
        alternativ1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setHgap(3);
        grid.setVgap(3);
        
        grid.add(alternativ1, 1, 0);
        grid.add(alternativ2, 2, 0);
        grid.add(alternativ3, 1, 1);
        grid.add(alternativ4, 2, 1);
       
        
       
        FlowPane flow=new FlowPane();
        flow.setPadding(new Insets(10,10,10,10));
        flow.getChildren().add(question);
        flow.setAlignment(Pos.CENTER);
        BorderPane border = new BorderPane();
        
        border.setTop(flow);
        
        border.setBottom(grid);
        
        
        Scene scene = new Scene(border, 500, 270);
        
        primaryStage.setTitle("Quiz Game");
        primaryStage.setScene(scene);
        primaryStage.show();
 }
}
