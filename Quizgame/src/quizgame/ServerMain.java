package quizgame;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

    public static void main(String[] args) throws IOException {
        
            System.out.println("Server up and running.");
            ServerSocket serverSocket = new ServerSocket(55555);
            
            while (true) {
                
                      try {
                                Socket socket = serverSocket.accept();
                                System.out.println("Connection1");
                                
                                Server server = new Server(socket);
                                server.start();
                                
                                System.out.println("Connection 2");
                                
                                

                     }catch (IOException e){
                                e.getMessage();
                    }
            }
    }
}
