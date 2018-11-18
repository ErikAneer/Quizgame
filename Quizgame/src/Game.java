
public class Game {
   
          private Player player1, player2;
          private int player1Score, player2Score;
          private int rounds;
          private int questionsPerRound;
 
         Game(Player player1, Player player2) {
                    this.player1 = player1;
                    this.player2 = player2;
         }
          
          
          public void setRounds(int numberOfRounds) {
                    rounds =  numberOfRounds;
          }

          public void setQuestionss(int numberOfQuestions) {
                    questionsPerRound =  numberOfQuestions;
          }

          public void addScore(Player playerWhoScored, int scoreToAdd) {
                  if (playerWhoScored == player1) {
                            player1Score = player1Score + scoreToAdd;
                  }
                  else { 
                        player2Score = player2Score + scoreToAdd;
                  }     
          }
}
