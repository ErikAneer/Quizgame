import java.util.ArrayList;

public class Game {

        String[] messageToClients = new String[2];


        private int player1Score, player2Score;
        private int rounds;
        private int questionsPerRound;
        private QuestionRegister questions;
        QuestionRegister allQuestions = new QuestionRegister();
        ArrayList<Question> artQuestions = new ArrayList<>();
        ArrayList<Question> carQuestions = new ArrayList<>();
        ArrayList<Question> cultureQuestions = new ArrayList<>();
        ArrayList<Question> geographyQuestions = new ArrayList<>();


        private enum enumState{
            waitingForConnection, waitingForCategory, artCategory, carCategory, cultureCategory, geographyCategory,
            sendQuestionOne, sendQuestionTwo, sendQuestionThree, getSendQuestionFour,
            waitingForAnswer, showPoints,
            waitingForCategoryFromPlayerTwo
        }

        private enumState state = enumState.waitingForCategory;

        Game(){

            allQuestions.setUpAllQuestions();
            artQuestions = allQuestions.getAllArtQuestions();
            carQuestions = allQuestions.getAllCarQuestions();
            cultureQuestions = allQuestions.getAllCultureQuestions();
            geographyQuestions = allQuestions.getAllGeographyQuestions();

        }



        public String[] gameController(String answer, String answerFromPlayerTwo){


            if(state == enumState.waitingForCategory){
                messageToClients[0] = allQuestions.listOfAllCategorys().get(0) + ", " + allQuestions.listOfAllCategorys().get(1);
                messageToClients[1] = "Väntar på kategori från motståndare";
                state = enumState.sendQuestionOne;
            }

            else if(state == enumState.sendQuestionOne) {
                if(answer.equalsIgnoreCase(artQuestions.get(0).category.toString())){
                    messageToClients[0] = artQuestions.get(0).getQuestionAndAswers();
                    messageToClients[1] = artQuestions.get(0).getQuestionAndAswers();
                    state = enumState.artCategory;
                }
                else if(answer.equalsIgnoreCase(carQuestions.get(0).category.toString())){
                    messageToClients[0] = carQuestions.get(0).getQuestionAndAswers();
                    messageToClients[1] = carQuestions.get(0).getQuestionAndAswers();
                    state = enumState.carCategory;
                }
            }

            else if(state == enumState.artCategory){
                messageToClients[0] = artQuestions.get(1).getQuestionAndAswers();
                messageToClients[1] = artQuestions.get(1).getQuestionAndAswers();
                state = enumState.waitingForCategoryFromPlayerTwo;
            }
            else if(state == enumState.carCategory){
                messageToClients[0] = carQuestions.get(1).getQuestionAndAswers();
                messageToClients[1] = carQuestions.get(1).getQuestionAndAswers();
                state = enumState.waitingForCategoryFromPlayerTwo;
            }
            else if(state == enumState.waitingForCategoryFromPlayerTwo){
                messageToClients[0] = "Väntar på kategori från motståndare";
                messageToClients[1] = allQuestions.listOfAllCategorys().get(2) + ", " + allQuestions.listOfAllCategorys().get(3);
                state = enumState.sendQuestionThree;
            }
            else if(state == enumState.sendQuestionThree){

                if(answerFromPlayerTwo.equalsIgnoreCase(cultureQuestions.get(0).category.toString())){
                    messageToClients[0] = cultureQuestions.get(0).getQuestionAndAswers();
                    messageToClients[1] = cultureQuestions.get(0).getQuestionAndAswers();
                    state = enumState.cultureCategory;
                }
                else if(answerFromPlayerTwo.equalsIgnoreCase(geographyQuestions.get(0).category.toString())){
                    messageToClients[0] = geographyQuestions.get(0).getQuestionAndAswers();
                    messageToClients[1] = geographyQuestions.get(0).getQuestionAndAswers();
                    state = enumState.geographyCategory;
                }
            }

            else if(state == enumState.cultureCategory){
                messageToClients[0] = cultureQuestions.get(1).getQuestionAndAswers();
                messageToClients[1] = cultureQuestions.get(1).getQuestionAndAswers();
                state = enumState.showPoints;
            }
            else if(state == enumState.geographyCategory){
                messageToClients[0] = geographyQuestions.get(1).getQuestionAndAswers();
                messageToClients[1] = geographyQuestions.get(1).getQuestionAndAswers();
                state = enumState.showPoints;
            }
            else if(state == enumState.showPoints){
                messageToClients[0] = "KLAAART!";
                messageToClients[1] = "KLAAART!";
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

