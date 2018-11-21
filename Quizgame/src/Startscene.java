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
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// Startpage
// Register username and connect to server

public class Startscene extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Components and ids
        Button okButton = new Button("Play!");
        okButton.setId("okButtonId");
        Label userRequest = new Label("Username?:");
        userRequest.setId("userRequestId");
        Label title = new Label("Quiz Game");
        title.setId("titleId");
        TextField userName = new TextField();
        userName.setId("userNameId");

        // Lambda expression to add and send the username to the server
        okButton.setOnAction(e->    System.out.println("") );

        // Creating borderpane with id
        BorderPane root = new BorderPane();
        root.setId("rootcolor");

        // Creating HBox and adding components
        HBox hbox = new HBox();
        hbox.setSpacing(30);
        hbox.setPadding(new Insets(15, 12, 15, 12));
        hbox.setAlignment(Pos.CENTER);
        hbox.getChildren().add(userRequest);
        hbox.getChildren().add(userName);
        hbox.getChildren().add(title);

        // Creating VBox and adding components
        VBox vbox = new VBox();
        vbox.getChildren().add(title);
        vbox.getChildren().add(okButton);
        vbox.setAlignment(Pos.CENTER);

        // Adding HBox and VBox to BorderPane
        root.setTop(hbox);
        root.setCenter(vbox);

        // Creating scene
        Scene scene = new Scene(root, 560, 300);

        // Connect class to css-file
        scene.getStylesheets().add(this.getClass().getResource("Quizstyling.css").toExternalForm());

        // Stage
        primaryStage.setTitle("Quiz Game!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}
