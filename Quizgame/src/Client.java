import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

    InetAddress ipAdress = InetAddress.getLocalHost();

    public Client() throws UnknownHostException{


        try (Socket socket = new Socket(ipAdress, 55555);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
             ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
        ) {
            Scanner scan = new Scanner(System.in);
            String messageFromClient;
            String messageFromServer;


            while(true){
                messageFromServer = (String) objectInputStream.readObject();
                System.out.println(messageFromServer);
                if(messageFromServer.equalsIgnoreCase("Väntar på kategori från motståndare")){
                    messageFromClient = "";
                    objectOutputStream.writeObject(messageFromClient);
                    messageFromServer = (String) objectInputStream.readObject();
                    System.out.println(messageFromServer);
                    //Kalla på metod för att visa "wait-scene".
                }
                if (messageFromServer.substring(0, 1).trim().equalsIgnoreCase("1")) { // Skapa välja kategori.
                String[] input = messageFromServer.split(" ");
                String title = input[0];
                /*
                question.setText(input[0]);
                alternativ1.setText(input[1]);
                alternativ2.setText(input[2]);
                alternativ3.setText(input[3]);
                alternativ4.setText(input[4]);
                alternativ5.setText(input[5]);
                alternativ6.setText(input[6]);
                primaryStage.setScene(???); //in med scen för välja kategori.
                primaryStage.show();
                */
                }
                if (messageFromServer.substring(0, 1).trim().equalsIgnoreCase("2")) { // Skapa fråga
                String[] input = messageFromServer.split(" ");
                String title = input[0];
                /*
                question.setText(input[0]);
                alternativ1.setText(input[1]);
                alternativ2.setText(input[2]);
                alternativ3.setText(input[3]);
                alternativ4.setText(input[4]);
                primaryStage.setScene(???); //in med scen för välja kategori.
                primaryStage.show();
                */
                }
                
                if (messageFromServer.substring(0, 1).trim().equalsIgnoreCase("3")) { // Skapa scen mellan ronder
                String[] input = messageFromServer.split(" ");
                String title = input[0];
                /*
                question.setText(input[0]);
                alternativ1.setText(input[1]); // här ska vi visa poäng för Spelare 1
                alternativ2.setText(input[2]); här ska vi visa poäng för Spelare 2
                primaryStage.setScene(???); //in med scen för visa resultat mellan ronder.
                primaryStage.show();
                */
                }
                if (messageFromServer.substring(0, 1).trim().equalsIgnoreCase("4")) { // Skapa scen spel klart.
                String[] input = messageFromServer.split(" ");
                String title = input[0];
                /*
                question.setText(input[0]);
                alternativ1.setText(input[1]); // här ska vi visa total poäng för Spelare 1
                alternativ2.setText(input[2]); här ska vi visa total poäng för Spelare 2
                alternativ3.setText(input[3]); här ska vi visa vem som vann.
                primaryStage.setScene(???); //in med scen för visa resultat mellan ronder.
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