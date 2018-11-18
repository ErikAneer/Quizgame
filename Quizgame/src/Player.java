


import java.io.BufferedReader;
import java.io.PrintWriter;

public class Player {
            
        private String playerName;
        private boolean isAvailable = true;
        private int points;
        private PrintWriter output;
        private BufferedReader in;
        private ServerProtocol playerThread;
        
        Player(String playerName, PrintWriter output, BufferedReader in)  {
                this.playerName = playerName;
                this.output = output;
                this.in = in;
        }
        
        public void setPoints(int pointsToAdd) {
                points = points + pointsToAdd;
        }
        
        public boolean getAvailability() {
                return isAvailable;
        }
        
        public void setToAvailable() {
                isAvailable = true;
        }
        
        public void setToNotAvailable() {
                isAvailable = false;
        }
        
        public PrintWriter getOutputStream() {
                return output;
        }
        
        public BufferedReader getInputStream() {
                return in;
        }
}
