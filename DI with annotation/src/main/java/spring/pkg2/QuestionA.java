package spring.pkg2;

import org.springframework.beans.factory.annotation.Value;

//@Service
//@Qualifier("A")
public class QuestionA implements Question {

    private static int id;

    @Value("AAAA")
    String name;

    public QuestionA() {
        id++;
        System.out.println(">>> static id (inside QuestionA constructor ) = " + id);
        System.out.println(">>> name (inside QuestionA constructor ) =  " + name);
    }


    @Override
    public String toString() {
        return "QuestionA{" +
                "name='" + name + '\'' +
                '}';
    }
}
