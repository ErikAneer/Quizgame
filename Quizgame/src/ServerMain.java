


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
                                
                                Socket socket2 = serverSocket.accept();
                                System.out.println("Connection2");
                                
                                Server server2 = new Server(socket2);
                                server2.start();
                                
                                Game game = new Game();

                     }catch (IOException e){
                                e.getMessage();
                    }
            }
    }
}
