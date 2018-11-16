public class Question {


    public enum enumCategory{
        carQuestions, cultureQuestions, artQuestions, geographyQuestions
    }

    enumCategory category;



    private String questionOne;

    private String answerOne;
    private String answerTwo;
    private String answerThree;
    private String answerFour;

    private final String CORRECT_ANSWER;

    public Question(enumCategory category, String questionOne, String answerOne, String answerTwo, String answerThree, String answerFour, String correct_answer) {
        this.questionOne = questionOne;
        this.answerOne = answerOne;
        this.answerTwo = answerTwo;
        this.answerThree = answerThree;
        this.answerFour = answerFour;
        this.CORRECT_ANSWER = correct_answer;
        this.category = category;
    }

    public boolean checkIfAnsweIsCorrect(String answer){
        if(answer.equalsIgnoreCase(this.CORRECT_ANSWER))
            return true;
        else
            return false;
    }

}
