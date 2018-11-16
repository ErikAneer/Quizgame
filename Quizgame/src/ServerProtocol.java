/*
*BEFORE_INIT,
*WAITING_FOR_OTHER_PLAYER, 
*OTHER_PLAYER_FOUND, 
*CHOOSE_QUESTION_CATEGORY, *START_ROUND, 
*-INTERMISSION, 
*GAME_FINISHED, 
*ANOTHER_GAME, 
*QUIT, 
*CHOOSE_NEW_OPPONENT.
*/

public class ServerProtocol {


    public enum EnumState {
        waitingForOtherPlayer, otherPlayerFound, chooseQuestionCategory, 
        StartRound, answerQuestion, betweenRounds, gameFinished, askAnotherGame,
        chooseNewOpponent, Quit;
    }
//
    private EnumState state = EnumState.waitingForOtherPlayer;
    private String returnMessage;

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




}
