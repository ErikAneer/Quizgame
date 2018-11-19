

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server extends Thread {

    private Socket socketPlayerOne;
    private Socket socketPlayerTwo;
    private Game game;
    private String[] messageToClients = new String[2];
    private String[] messageFromClients = new String[2];


    public Server(Socket socketPlayerOne, Game game, Socket socketPlayerTwo){
        this.socketPlayerOne = socketPlayerOne;
        this.game = game;
        this.socketPlayerTwo = socketPlayerTwo;
    }
    @Override
    public void run() {


        try(ObjectInputStream objectInputPlayerOne = new ObjectInputStream(socketPlayerOne.getInputStream());
            ObjectInputStream objectInputPlayerTwo = new ObjectInputStream(socketPlayerTwo.getInputStream());

            ObjectOutputStream objectOutputPlayerOne = new ObjectOutputStream(socketPlayerOne.getOutputStream());
            ObjectOutputStream objectOutputPlayerTwo = new ObjectOutputStream(socketPlayerTwo.getOutputStream());){

            System.out.println("test");

            messageToClients = game.gameController(null, null);
            System.out.println(messageToClients[0]);
            System.out.println(messageToClients[1]);
            objectOutputPlayerOne.writeObject(messageToClients[0]);
            objectOutputPlayerTwo.writeObject(messageToClients[1]);
            while(true){

                messageFromClients[0] = (String) objectInputPlayerOne.readObject();
                messageFromClients[1] = (String) objectInputPlayerTwo.readObject();

                messageToClients = game.gameController(messageFromClients[0], messageFromClients[1]);
                objectOutputPlayerOne.writeObject(messageToClients[0]);
                objectOutputPlayerTwo.writeObject(messageToClients[1]);


            }
        } catch(IOException e){
            System.out.println("Errormessage: " + e.getMessage());
        }catch(ClassNotFoundException e){
            e.getMessage();
        }
    }
}