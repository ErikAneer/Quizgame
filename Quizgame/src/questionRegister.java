import java.util.ArrayList;

public class questionRegister {


    private ArrayList<Question> listOfAllQuestions = new ArrayList<>();


    public questionRegister(){

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


}
