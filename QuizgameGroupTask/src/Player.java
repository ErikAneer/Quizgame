



public class Player {
            
        private String playerName;
        private boolean isAvailable = true;
        private int points;
        
        Player(String playerName)  {
                this.playerName = playerName;
        }
        
        public void setPoints(int pointsToAdd) {
                points = points + pointsToAdd;
        }
        
        public void setToAvailable() {
                isAvailable = true;
        }
        
        public void setToNotAvailable() {
                isAvailable = false;
        }
}
