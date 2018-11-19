import java.util.ArrayList;

public class QuestionRegister {


    private ArrayList<Question> listOfAllQuestions = new ArrayList<>();


    public QuestionRegister(){

    }

    public void setUpAllQuestions(){

        Question question = new Question(Question.enumCategory.artQuestions, "Under vilket årtioende dog Picasso?",
                "1910", "1930","1960","1970","1970");
        listOfAllQuestions.add(question);
        Question questionTwo = new Question(Question.enumCategory.artQuestions, "Vilket år föddes den svenska konstnären Lars-Göran Abrahamsson?",
                "1720", "1950","1860","1970","1950");
        listOfAllQuestions.add(questionTwo);

        Question questionThree = new Question(Question.enumCategory.carQuestions, "Vilket land skapade bilmärket Mazda?",
                "Japan", "China","Syd-Korea","Tyskland","Japan");
        listOfAllQuestions.add(questionThree);
        Question questionFour = new Question(Question.enumCategory.carQuestions, "Vilket land skapade bilmärket Mercedes?",
                "Tjeckien", "Polen","Tyskland","Grekland","Tyskland");
        listOfAllQuestions.add(questionFour);

        Question questionFive = new Question(Question.enumCategory.cultureQuestions, "Vilket år bröt den ryska revolutionen ut?",
                "1560", "1730","1860","1910","1910");
        listOfAllQuestions.add(questionFive);
        Question questionSix = new Question(Question.enumCategory.cultureQuestions, "Vilket år avslutades det Amerikanska inbördeskriget?",
                "1925", "1968","1865","1970","1865");
        listOfAllQuestions.add(questionSix);


        Question questionSeven = new Question(Question.enumCategory.geographyQuestions, "I vilket land ligger staden Istanbull i?",
                "Grekland", "Frankrike","USA","Turkiet","Turkiet");
        listOfAllQuestions.add(questionSeven);
        Question questionEight = new Question(Question.enumCategory.geographyQuestions, "Vilket land är världens minsta land?",
                "Vatikanstaten", "Nord-Korea","Malta","Maldiverna","Vatikanstaten");
        listOfAllQuestions.add(questionEight);
    }

    public ArrayList<Question> getListOfAllQuestions(){
        return this.listOfAllQuestions;
    }

    public ArrayList<Question> getAllArtQuestions(){

        ArrayList<Question> artQuestions = new ArrayList<>();
        for (Question q: listOfAllQuestions) {
            if(q.category == Question.enumCategory.artQuestions){
                artQuestions.add(q);
            }
        }
        return artQuestions;
    }

    public ArrayList<Question> getAllCarQuestions(){

        ArrayList<Question> artQuestions = new ArrayList<>();
        for (Question q: listOfAllQuestions) {
            if(q.category == Question.enumCategory.carQuestions){
                artQuestions.add(q);
            }
        }
        return artQuestions;
    }

    public ArrayList<Question> getAllCultureQuestions(){

        ArrayList<Question> artQuestions = new ArrayList<>();
        for (Question q: listOfAllQuestions) {
            if(q.category == Question.enumCategory.cultureQuestions){
                artQuestions.add(q);
            }
        }
        return artQuestions;
    }

    public ArrayList<Question> getAllGeographyQuestions(){

        ArrayList<Question> artQuestions = new ArrayList<>();
        for (Question q: listOfAllQuestions) {
            if(q.category == Question.enumCategory.geographyQuestions){
                artQuestions.add(q);
            }
        }
        return artQuestions;
    }

    public ArrayList<String> listOfAllCategorys(){
        ArrayList<String> allCategorys = new ArrayList<>();
        allCategorys.add(Question.enumCategory.artQuestions.toString());
        allCategorys.add(Question.enumCategory.carQuestions.toString());
        allCategorys.add(Question.enumCategory.cultureQuestions.toString());
        allCategorys.add(Question.enumCategory.geographyQuestions.toString());
        return allCategorys;
    }

    public String getArtQuestion(Question questions){
       return questions.getQuestionAndAswers();
    }
    public String getCarQuestion(Question questions){
        return questions.getQuestionAndAswers();
    }
    public String getCultureQuestion(Question questions){
        return questions.getQuestionAndAswers();
    }
    public String getGeographyQuestion(Question questions){
        return questions.getQuestionAndAswers();
    }


}