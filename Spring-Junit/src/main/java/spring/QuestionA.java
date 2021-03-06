package spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

  @Component
  @Qualifier("A")
  public class QuestionA implements Question {

    private static int id;
    private QuestionA question;

    @Value("AAAA")
    private String name;

    public QuestionA() {
        id++;
        System.out.println(" inside QuestionA constructor ) ");
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
     return  (name + "=" + question);

    }
}
