package spring;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan public class QuestionA implements Question {

    private static int id;
    private QuestionA question;
    private String name;

    public QuestionA() {
        id++;
        System.out.println(">>> static id (inside constructor ) = " + id);
        System.out.println(">>> name (inside constructor ) =  " + name);
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

    public void displayInfo() {
        System.out.println(name + question);
        System.out.println("question=" + (question != null ? question.getName() : ""));

    }
}
