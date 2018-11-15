import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

    public static void main(String[] args) {


        try{
            ServerSocket serverSocket = new ServerSocket(55555);

            while (true) {

                Socket socket = serverSocket.accept();
                Server server = new Server(socket);
                Thread t = new Thread(server);
                t.run();
                System.out.println(t.getName());




            }
        }catch (IOException e){
            e.getMessage();
        }

    }
}
