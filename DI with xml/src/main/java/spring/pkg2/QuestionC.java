package spring.pkg2;


import org.springframework.stereotype.Component;
import spring.pkg1.Question;
import spring.pkg1.QuestionB;

@Component("c")
public class QuestionC implements Question {

    private static int id;
    private QuestionB question;
    private String name;

    public QuestionC() {
        id++;
        System.out.println(">>> static id (inside QuestionC constructor ) = " + id);
        System.out.println(">>> name (inside QuestionC constructor ) =  " + name);
        System.out.println(">>> question (inside QuestionC constructor ) =  " + question);
    }

    public QuestionB getQuestion() {
        return question;
    }

    //
    public void setQuestion(QuestionB question) {
        this.question = question;
    }

    //
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        QuestionA.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println(name + "=" + question);

    }
}
