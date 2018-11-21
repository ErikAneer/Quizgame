import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import javafx.application.Application;
import javafx.stage.Stage;

public class Client extends Application{

    InetAddress ipAdress = InetAddress.getLocalHost();
    
    Stage window;

    public Client() throws UnknownHostException {
    }

    public static void Main(String[] args){
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {

        
        Startscene startscene = new Startscene(primaryStage);


        try (Socket socket = new Socket(ipAdress, 55555);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
             ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
        ) {
            Scanner scan = new Scanner(System.in);
            String messageFromClient;
            String messageFromServer;

            //        window.setScene(new StartScene); // denna scen ska fråga efter spelar namn och skicka svaret till servern.


            while(true){
                messageFromServer = (String) objectInputStream.readObject();

                if(messageFromServer.equalsIgnoreCase("Väntar på kategori från motståndare")){
                    //                    new WaitGui(messageFromServer);
                    messageFromClient = "";
                    objectOutputStream.writeObject(messageFromClient);

                }
                if (messageFromServer.substring(0, 1).trim().equalsIgnoreCase("1")) { // Skapa välja kategori.
                                    /*
                                    new ChooseCategoryGui(objectOutputStream, messageFromServer); // OBS! Splitta inkommande sträng i GUI på underscore!
                                    primaryStage.setScene(ChooseCategoryGUI);
                                    primaryStage.show();
                                    */
                }
                if (messageFromServer.substring(0, 1).trim().equalsIgnoreCase("2")) { // Skapa fråga
                                    /*
                                    new Questiongui(objectOutputStream, messageFromServer);
                                    primaryStage.setScene(Questiongui);
                                    primaryStage.show();
                                    */
                }

                if (messageFromServer.substring(0, 1).trim().equalsIgnoreCase("3")) { // Skapa scen mellan ronder
                                    /*
                                    new WaitBetweenRoundsGui(messageFromServer);
                                    primaryStage.setScene(WaitBetweenRoundsGui);
                                    primaryStage.show();
                                    */
                }
                if (messageFromServer.substring(0, 1).trim().equalsIgnoreCase("4")) { // Skapa scen spel klart.
                                    /*
                                    new ResultGui(objectOutputStream, messageFromServer);
                                    primaryStage.setScene(ResultGui);
                                    primaryStage.show();
                                    */
                }

                messageFromClient = scan.nextLine();
                objectOutputStream.writeObject(messageFromClient);
            }

        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }catch (ClassNotFoundException e){
            e.getMessage();
        }
    }
}