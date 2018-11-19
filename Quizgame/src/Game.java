import java.util.ArrayList;

public class Game {

        String[] messageToClients = new String[2];


        private int player1Score, player2Score;
        private int rounds;
        private int questionsPerRound;
        private QuestionRegister questions;
        QuestionRegister allQuestions = new QuestionRegister();
        ArrayList<Question> artQuestions = new ArrayList<>();

        private enum enumState{
            waitingForConnection, waitingForCategory, sendQuestionOne, sendQuestionTwo, waitingForAnswer, showPoints,
            waitingForCategoryFromPlayerTwo
        }

        private enumState state = enumState.waitingForCategory;

        Game(){

            allQuestions.setUpAllQuestions();
            artQuestions = allQuestions.getAllArtQuestions();

        }



        public String[] gameController(String answer, String answerFromPlayerTwo){


            if(state == enumState.waitingForCategory){
                messageToClients[0] = allQuestions.listOfAllCategorys().get(0) + ", " + allQuestions.listOfAllCategorys().get(1) + ", " +
                        allQuestions.listOfAllCategorys().get(2) + ", " + allQuestions.listOfAllCategorys().get(3);
                messageToClients[1] = "Väntar på kategori från motståndare";
                state = enumState.sendQuestionOne;
            }

            else if(state == enumState.sendQuestionOne) {
                if(answer.equalsIgnoreCase(artQuestions.get(0).category.toString())){
                    messageToClients[0] = artQuestions.get(0).getQuestionAndAswers();
                    messageToClients[1] = artQuestions.get(0).getQuestionAndAswers();
                    state = enumState.sendQuestionTwo;
                }
            }

            else if(state == enumState.sendQuestionTwo){
                messageToClients[0] = "Vilken djurgrupp tillhör älgen ?";
                messageToClients[1] = "Vilken djurgrupp tillhör älgen ?";
                state = enumState.waitingForCategoryFromPlayerTwo;

            }
            else if(state == enumState.waitingForCategoryFromPlayerTwo){
                messageToClients[0] = "Väntar på kategori från spelare två";
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

