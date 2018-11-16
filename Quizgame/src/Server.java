



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server extends Thread {
            
          private ActivePlayers activePlayers;
          private ServerProtocol serverProtocol = new ServerProtocol(activePlayers);
          private Socket socket;
          private Player currentPlayer;
          
       
          public Server(Socket socket, ActivePlayers activePlayers){
                    this.socket = socket;
                    this.activePlayers = activePlayers;
                    
                    }
                    @Override
                    public void run() {

                    try (PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
                              BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));) 
                    {
                              Scanner scan = new Scanner(System.in);
                              
                              
                              String messageFromClient = null;
                              String messageFromServer = null;

                              while(true){

                                       messageFromServer = serverProtocol.handleInput(messageFromClient);
                                       writer.println(messageFromServer);

                                       messageFromClient = reader.readLine();
                                       messageFromServer = serverProtocol.handleInput(messageFromClient);
                              }
                    } catch(IOException e){
                              System.out.println("Errormessage: " + e.getMessage());
                   }
         }
}
