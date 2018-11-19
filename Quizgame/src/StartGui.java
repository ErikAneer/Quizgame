/**
 * Quiz Game Start Gui
 */
import java.net.UnknownHostException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class StartGui extends Application {
    Stage window;
    @Override
    public void start(Stage primaryStage) throws UnknownHostException {
        window=primaryStage;
       setStartScene();
       //setChooseCategoryScene();
       
   } 
    /**
     * A method to create the start scene
     * @param primaryStage 
     */
    public  void setStartScene(){
        
     // startScene
        Button okButton = new Button();
        okButton.setText("Play!");
        Label userRequest = new Label();
        userRequest.setText("Username?:");
        Label title= new Label("Quiz Game");
        TextField userName = new TextField();
       //Lambda expression 
        okButton.setOnAction(e -> setWaitScene());// to add send the username to the server 
        //creating borderpane
        BorderPane root = new BorderPane();
        root.setId("rootcolor");
        // creating FlowPane
        FlowPane flowpane = new FlowPane();
        flowpane.getChildren().add(userRequest);
        flowpane.getChildren().add(userName);
        flowpane.getChildren().add(title);
        root.setTop(flowpane);
        root.setCenter(okButton);
        flowpane.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(root,300,300);
        scene.getStylesheets().add(StartGui.class.getResource("GuiStyle.css").toExternalForm());
        
        window.setTitle("Quiz Game");
        window.setScene(scene);
        window.show();
       
 }
    /**
     * A method to create the wait scene
     * @param primaryStage 
     */
    public void setWaitScene(){
        // to add-send a signal to server that a player is waiting
        
        Label wait= new Label("Wainting for another player to join. . . . ");
        StackPane stack = new StackPane();
        stack.getChildren().add(wait);
        Scene scene = new Scene(stack,300,300);
        // to add-if a player2 is found then swith to chooseCategoryScene and receive an object with all the categories
        window.setScene(scene);
        
    }/**
     * A method to create chooseCategoryScene
     * @param primaryStage 
     */
    public  void setChooseCategoryScene(){
     
     Label question = new Label("Choose a ategory to begin");
        Label player1 = new Label("player1Name");
        Label player2 = new Label("player2Name");
        Label scorePlayer1 = new Label("00");
        Label scorePlayer2 = new Label("01");
        Label round = new Label("Round 1");
        
        Button onOff = new Button();
        Button offOn = new Button();
        //creating category buttons
        Button alternativ1 = new Button("catogory1");
        Button alternativ2 = new Button("catogory2");
        Button alternativ3 = new Button("catogory3");
        Button alternativ4 = new Button("catogory4");
        Button alternativ5 = new Button("catogory5");
        Button alternativ6 = new Button("catogory6");
        //setting size for category buttons
        alternativ1.setPrefSize(166, 100);
        alternativ2.setPrefSize(166, 100);
        alternativ3.setPrefSize(166, 100);
        alternativ4.setPrefSize(166, 100);
        alternativ5.setPrefSize(166, 100);
        alternativ6.setPrefSize(166, 100);
        //adding listeners to category butoons
        alternativ1.setOnAction(e->setQuestionScene()); //to add-send the chosen category to server
        alternativ2.setOnAction(e->setQuestionScene()); //to add-send the chosen category to server
        alternativ3.setOnAction(e->setQuestionScene()); //to add-send the chosen category to server
        alternativ4.setOnAction(e->setQuestionScene()); //to add-send the chosen category to server
        alternativ5.setOnAction(e->setQuestionScene()); //to add-send the chosen category to server
        alternativ6.setOnAction(e->setQuestionScene()); //to add-send the chosen category to server
        //creating a grid pane and adding category buttons to it
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setAlignment(Pos.CENTER);
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
        
        Scene scene = new Scene(border, 500, 260);
        window.setScene(scene);
        window.setTitle("Quiz Game");
        window.show();
       
 }/**
  * A method to create and start a question scene
  * 
  */
    public  void setQuestionScene(){
        Label question = new Label("Question?");
        //creating 4 buttons for answer alternatives
        Button alternativ1 = new Button("answer1");
        Button alternativ2 = new Button("answer2");
        Button alternativ3 = new Button("answer3");
        Button alternativ4 = new Button("answer4");
        //setting size for buttons 
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

        window.setTitle("Quiz Game");
        window.setScene(scene);
        
 }
    
     
   
   
    public static void main(String[] args) throws UnknownHostException {
       
       launch(args);
         
    }
    
}
