


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    
             InetAddress ipAdress = InetAddress.getLocalHost();

        public Client() throws UnknownHostException{
            
       
             try (Socket socket = new Socket(ipAdress, 55555);

            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            ) {

            Scanner scan = new Scanner(System.in);

            String messageFromClient;
            String messageFromServer;

            while(true){

                messageFromServer = reader.readLine();
                System.out.println(messageFromServer);

                messageFromClient = scan.nextLine();
                writer.println(messageFromClient);

            }

        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }




    }
}
