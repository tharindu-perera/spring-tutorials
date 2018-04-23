package spring;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan public class QuestionB implements Question {

    private static int id;
    private QuestionB question;
    private String name;

    public QuestionB() {
        id++;
        System.out.println(">>> static id (inside constructor ) = " + id);
        System.out.println(">>> name (inside constructor ) =  " + name);
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

    public void displayInfo() {
        System.out.println(name + question);
        System.out.println("question=" + (question != null ? question.getName() : ""));

    }
}
