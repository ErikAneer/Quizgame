
import java.util.LinkedList;
import java.util.List;


public class ActivePlayers {
        
        private List<Player> activePlayersList = new LinkedList();
        
        public void addPlayer(Player playerToAdd) {
                activePlayersList.add(playerToAdd);
        }
        
        public void removePlayer(Player playerToRemove) {
                activePlayersList.remove(playerToRemove);
        }
        
        public List<Player> getPlayerList() {
                   return activePlayersList;
        }
}
