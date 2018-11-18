/**
 * Quiz Game Start Gui
 */
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
    //Stage window;
    Scene startScene,waitScene,chooseCategoryScene,questionScene;
//    WaitScene wait = new WaitScene();
//    StartScene start= new StartScene();
    @Override
    public void start(Stage primaryStage) {
    //setStartScene(primaryStage);
      QuestionScene.setQuestionScene(primaryStage);
    //wait.setWaitScene(primaryStage);
        
    } 
    /**
     * A method to set the startScene into the window(stage)
     * @param primaryStage 
     */
//    public void setStartScene(Stage primaryStage){
//        window=primaryStage;
//        // startScene
//        Button okButton = new Button();
//        okButton.setText("Play!");
//        Label userRequest = new Label();
//        userRequest.setText("Username?:");
//        Label title= new Label("Quiz Game");
//        TextField userName = new TextField();
//       
//        //Lambda expression 
//        okButton.setOnAction(e -> setChooseCategoryScene());
//        //creating borderpane
//        BorderPane root = new BorderPane();
//        root.setId("rootcolor");
//        // creating FlowPane
//        FlowPane flowpane = new FlowPane();
//        flowpane.getChildren().add(userRequest);
//        flowpane.getChildren().add(userName);
//        flowpane.getChildren().add(title);
//        root.setTop(flowpane);
//        root.setCenter(okButton);
//        flowpane.setAlignment(Pos.CENTER);
//        
//        startScene = new Scene(root,300,300);
//        startScene.getStylesheets().add(StartGui.class.getResource("GuiStyle.css").toExternalForm());
//        
//        window.setTitle("Quiz Game");
//        window.setScene(startScene);
//        window.show();
//       
//        
//    }
    /**
     * A method to set the waitScene into the window(stage)
     */
//    public  void setWaitScene(){
//        // to add-send a signal to server that a player is waiting
//        
//        Label wait= new Label("Wainting for another player to join. . . . ");
//        StackPane stack = new StackPane();
//        stack.getChildren().add(wait);
//        waitScene = new Scene(stack,300,300);
//        // to add-if a player2 is found then swith to chooseCategoryScene and receive an object with all the categories
//        window.setScene(waitScene);
//        
//        
//    }
    /**
     * A method to set the chooseCategoryScene into the window(stage)
     */
//    public void setChooseCategoryScene(){
//        Label question = new Label("Choose a ategory to begin");
//        Label player1 = new Label("player1Name");
//        Label player2 = new Label("player2Name");
//        Label scorePlayer1 = new Label("00");
//        Label scorePlayer2 = new Label("01");
//        Label round = new Label("Round 1");
//        
//        Button onOff = new Button();
//        Button offOn = new Button();
//        
//        Button alternativ1 = new Button("catogory1");
//        Button alternativ2 = new Button("catogory2");
//        Button alternativ3 = new Button("catogory3");
//        Button alternativ4 = new Button("catogory4");
//        Button alternativ5 = new Button("catogory5");
//        Button alternativ6 = new Button("catogory6");
//        
//        alternativ1.setPrefSize(150, 100);
//        alternativ2.setPrefSize(150, 100);
//        alternativ3.setPrefSize(150, 100);
//        alternativ4.setPrefSize(150, 100);
//        alternativ5.setPrefSize(150, 100);
//        alternativ6.setPrefSize(150, 100);
//        
//        alternativ1.setOnAction(e->System.out.println("A method to send this catogory1 to the server"));//to add-send the chosen category to server
//        alternativ2.setOnAction(e->System.out.println("A method to send this catogory2 to the server"));//to add-send the chosen category to server
//        alternativ3.setOnAction(e->System.out.println("A method to send this catogory3 to the server"));//to add-send the chosen category to server
//        alternativ4.setOnAction(e->System.out.println("A method to send this catogory4 to the server"));//to add-send the chosen category to server
//        alternativ5.setOnAction(e->System.out.println("A method to send this catogory5 to the server"));//to add-send the chosen category to server
//        alternativ6.setOnAction(e->System.out.println("A method to send this catogory6 to the server"));//to add-send the chosen category to server
//        
//        GridPane grid = new GridPane();
//        grid.setPadding(new Insets(10,10,10,10));
//        grid.setHgap(3);
//        grid.setVgap(3);
//        grid.add(alternativ1, 1, 0);
//        grid.add(alternativ2, 2, 0);
//        grid.add(alternativ3, 3, 0);
//        grid.add(alternativ4, 1, 1);
//        grid.add(alternativ5, 2, 1);
//        grid.add(alternativ6, 3, 1);
//        
//        FlowPane flow=new FlowPane();
//        flow.setPadding(new Insets(10,10,10,10));
//        flow.getChildren().add(question);
//        flow.setAlignment(Pos.CENTER);
//        BorderPane border = new BorderPane();
//        border.setTop(flow);
//        
//        border.setCenter(grid);
//        //new GridPane
//        GridPane grid1 = new GridPane();
//       
//        GridPane.setConstraints(player1, 0, 0);
//        GridPane.setConstraints(onOff, 1, 0);
//        GridPane.setConstraints(round, 2, 0);
//        GridPane.setConstraints(player2, 3, 0);
//        GridPane.setConstraints(offOn, 4, 0);
//        GridPane.setConstraints(scorePlayer1, 0, 1);
//        GridPane.setConstraints(scorePlayer2, 3, 1);
//        
//        grid1.getChildren().addAll(player1,onOff,round,player2,offOn,scorePlayer1,scorePlayer2);
//        grid1.setAlignment(Pos.CENTER);
//        grid1.setPadding(new Insets(10,10,10,10));
//        grid1.setHgap(50);
//        border.setBottom(grid1);
//        
//        Scene chooseCategoryScene = new Scene(border, 450, 350);
//        window.setScene(chooseCategoryScene);
     
//    }
   
    public static void main(String[] args) {
        launch(args);
    }
    
}
