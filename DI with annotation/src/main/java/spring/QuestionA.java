package spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Qualifier("A")
public class QuestionA implements Question {

    private static int id;
    private QuestionA question;
    @Value("AAAA")
    private String name;

    public QuestionA() {
        id++;
        System.out.println(">>> static id (inside QuestionA constructor ) = " + id);
        System.out.println(">>> name (inside QuestionA constructor ) =  " + name);
    }

    public QuestionA getQuestion() {
        return question;
    }

    public void setQuestion(QuestionA question) {
        this.question = question;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        QuestionA.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String displayInfo() {
        return (name + "=" + question);

    }
}
