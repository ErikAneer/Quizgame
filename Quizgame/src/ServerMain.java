


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

    public static void main(String[] args) throws IOException {
        
            System.out.println("Server up and running.");
            ServerSocket serverSocket = new ServerSocket(55555);
            
            while (true) {

                Game game = new Game();
                      try {

                                Socket socketToPlayerOne = serverSocket.accept();
                                Socket socketToPlayerTwo = serverSocket.accept();
                                Server server = new Server(socketToPlayerOne, game, socketToPlayerTwo);
                                server.start();
                          System.out.println("Server started");

                     }catch (IOException e){
                                e.getMessage();
                    }
            }
    }
}
