
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


public class ChooseCategoryScene {
    
 public static void setChooseCategoryScene(Stage primaryStage){
     Label question = new Label("Choose a ategory to begin");
        Label player1 = new Label("player1Name");
        Label player2 = new Label("player2Name");
        Label scorePlayer1 = new Label("00");
        Label scorePlayer2 = new Label("01");
        Label round = new Label("Round 1");
        
        Button onOff = new Button();
        Button offOn = new Button();
        
        Button alternativ1 = new Button("catogory1");
        Button alternativ2 = new Button("catogory2");
        Button alternativ3 = new Button("catogory3");
        Button alternativ4 = new Button("catogory4");
        Button alternativ5 = new Button("catogory5");
        Button alternativ6 = new Button("catogory6");
        
        alternativ1.setPrefSize(150, 100);
        alternativ2.setPrefSize(150, 100);
        alternativ3.setPrefSize(150, 100);
        alternativ4.setPrefSize(150, 100);
        alternativ5.setPrefSize(150, 100);
        alternativ6.setPrefSize(150, 100);
        
        alternativ1.setOnAction(e->System.out.println("A method to send this catogory1 to the server"));//to add-send the chosen category to server
        alternativ2.setOnAction(e->System.out.println("A method to send this catogory2 to the server"));//to add-send the chosen category to server
        alternativ3.setOnAction(e->System.out.println("A method to send this catogory3 to the server"));//to add-send the chosen category to server
        alternativ4.setOnAction(e->System.out.println("A method to send this catogory4 to the server"));//to add-send the chosen category to server
        alternativ5.setOnAction(e->System.out.println("A method to send this catogory5 to the server"));//to add-send the chosen category to server
        alternativ6.setOnAction(e->System.out.println("A method to send this catogory6 to the server"));//to add-send the chosen category to server
        
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setHgap(3);
        grid.setVgap(3);
        grid.add(alternativ1, 1, 0);
        grid.add(alternativ2, 2, 0);
        grid.add(alternativ3, 3, 0);
        grid.add(alternativ4, 1, 1);
        grid.add(alternativ5, 2, 1);
        grid.add(alternativ6, 3, 1);
        
        FlowPane flow=new FlowPane();
        flow.setPadding(new Insets(10,10,10,10));
        flow.getChildren().add(question);
        flow.setAlignment(Pos.CENTER);
        BorderPane border = new BorderPane();
        border.setTop(flow);
        
        border.setCenter(grid);
        //new GridPane
        GridPane grid1 = new GridPane();
       
        GridPane.setConstraints(player1, 0, 0);
        GridPane.setConstraints(onOff, 1, 0);
        GridPane.setConstraints(round, 2, 0);
        GridPane.setConstraints(player2, 3, 0);
        GridPane.setConstraints(offOn, 4, 0);
        GridPane.setConstraints(scorePlayer1, 0, 1);
        GridPane.setConstraints(scorePlayer2, 3, 1);
        
        grid1.getChildren().addAll(player1,onOff,round,player2,offOn,scorePlayer1,scorePlayer2);
        grid1.setAlignment(Pos.CENTER);
        grid1.setPadding(new Insets(10,10,10,10));
        grid1.setHgap(50);
        border.setBottom(grid1);
        
        Scene scene = new Scene(border, 450, 350);
        primaryStage.setScene(scene);
        primaryStage.show();
 }
}
