
public class ServerProtocol {


    public enum EnumState {
        waitingForOtherPlayer, otherPlayerFound, chooseQuestionCategory, 
        StartRound, answerQuestion, betweenRounds, gameFinished, askAnotherGame,
        chooseNewOpponent, Quit;
    }
//
    private EnumState state = EnumState.waitingForOtherPlayer;
    private String returnMessage;
    private Player player;
    private ActivePlayers activePlayers;
    
//    private Player threadPlayer;

    public String handleInput(String answer){
        
         

        if(state == EnumState.waitingForOtherPlayer && answer == null){
            state = EnumState.answerQuestion;
            returnMessage = "Varmt välkommen! För att starta, skriv: q!";

        }
        else if(state == EnumState.answerQuestion){
            if(answer.equalsIgnoreCase("q")) {
                returnMessage = "Vilken färg gillar Erik? grön, röd, svart, gul";
            }
            else if(answer.equalsIgnoreCase("grön")){
                state = EnumState.waitingForOtherPlayer;
                returnMessage = "Rätt svar";
            }
            else
                returnMessage = "Fel svar";
        }
            return returnMessage;
    }

    public void searchOpponent (Player player2) {
                   for (Player p : activePlayers.getPlayerList()) {
                                if (p.getAvailability()) {
                                        p.setToNotAvailable();
                                        Game game = new Game(p, player2);
                                        break;
                                }
                                else {
                                        activePlayers.addPlayer(player2); 
                                } 
                   }
        }


}
