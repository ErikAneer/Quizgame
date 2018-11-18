


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
