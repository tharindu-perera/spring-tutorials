package spring.pkg1;


public class QuestionA implements Question {

    private static int id;
    private QuestionB question;
    private String name;

    public QuestionA() {
        id++;
        System.out.println(">>> static id (inside QuestionA constructor ) = " + id);
        System.out.println(">>> name (inside QuestionA constructor ) =  " + name);
        System.out.println(">>> question (inside QuestionA constructor ) =  " + question);
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
