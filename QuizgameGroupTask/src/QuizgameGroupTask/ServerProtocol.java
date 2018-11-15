package QuizgameGroupTask;

public class ServerProtocol {


    public enum EnumState{
        waiting, questionOne
    }
//
    private EnumState state = EnumState.waiting;
    private String returnMessage;

    public String handleInput(String answer){

        if(state == EnumState.waiting && answer == null){
            state = EnumState.questionOne;
            returnMessage = "Varmt välkommen! För att starta, skriv: q!";

        }
        else if(state == EnumState.questionOne){
            if(answer.equalsIgnoreCase("q")) {
                returnMessage = "Vilken färg gillar Erik? grön, röd, svart, gul";
            }
            else if(answer.equalsIgnoreCase("grön")){
                state = EnumState.waiting;
                returnMessage = "Rätt svar";
            }
            else
                returnMessage = "Fel svar";
        }
            return returnMessage;
    }




}
