import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class Game {

          String[] messageToClients = new String[2];


          private int player1Score, player2Score;
          private int rounds;
          private int questionsPerRound;

          private enum enumState{
              waitingForConnection, waitingForCategory, sendQuestionOne, sendQuestionTwo, waitingForAnswer, showPoints,
              waitingForCategoryFromPlayerTwo
          }

          private enumState state = enumState.waitingForCategory;
 
         Game(){
         }



         public String[] gameController(String answer, String answerFromPlayerTwo){


             if(state == enumState.waitingForCategory){
                 messageToClients[0] = "Djurfrågor, Geografifrågor";
                 messageToClients[1] = "Väntar på kategori från spelare ett";
                 state = enumState.sendQuestionOne;
             }

             else if(state == enumState.sendQuestionOne) {
                 if(answer.equalsIgnoreCase("Djurfrågor")) {
                     messageToClients[0] = "Vilken djurgrupp tillhör örnen?";
                     messageToClients[1] = "Vilken djurgrupp tillhör örnen?";
                     state = enumState.sendQuestionTwo;
                 }
             }

             else if(state == enumState.sendQuestionTwo){
                 messageToClients[0] = "Vilken djurgrupp tillhör älgen ?";
                 messageToClients[1] = "Vilken djurgrupp tillhör älgen ?";
                 state = enumState.waitingForCategoryFromPlayerTwo;

             }
             else if(state == enumState.waitingForCategoryFromPlayerTwo){
                 messageToClients[0] = "Väntar på kategori från spelare ett";
                 messageToClients[1] = "Djurfrågor, Geografifrågor";
             }


             return messageToClients;
         }
          
          
          public void setRounds(int numberOfRounds) {
                    rounds =  numberOfRounds;
          }

          public void setQuestionss(int numberOfQuestions) {
                    questionsPerRound =  numberOfQuestions;
          }

}
