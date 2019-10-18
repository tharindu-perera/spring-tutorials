package spring.pkg1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("C")
@Scope("prototype")
public class QuestionC implements Question {

    private static int id;
    private QuestionA question;
    private String name;
    private List<Object> lists;

    public QuestionC() {
//        id++;
        System.out.println(">>> static id (inside constructor ,QuestionC) = " + id);
//        System.out.println(">>> name (inside constructor ) =  " + name);
    }

    public QuestionA getQuestion() {
        return question;
    }

    public void setQuestion(QuestionA question) {
        this.question = question;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        QuestionC.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println(name + question);
        System.out.println("question=" + (question != null ? question.getName() : ""));

    }
}
