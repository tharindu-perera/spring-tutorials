package spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Qualifier("B")

//@Primary
 public class QuestionB implements Question {

    private static int id;
    private QuestionB question;

    @Value("BBB")
    private String name;

    public QuestionB() {
        id++;
        System.out.println(">>> inside QuestionB constructor ");
//        System.out.println(">>> name (inside QuestionB constructor ) =  " + name);
    }

    public QuestionB getQuestion() {
        return question;
    }

    public void setQuestion(QuestionB question) {
        this.question = question;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        QuestionB.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String displayInfo() {
        return ("name ="+name +" , question = "+ question);

    }
}
