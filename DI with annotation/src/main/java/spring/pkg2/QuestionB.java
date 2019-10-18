package spring.pkg2;

import org.springframework.beans.factory.annotation.Value;

//@Component
//@Qualifier("B")
//@Primary
public class QuestionB implements Question {

    private static int id;

    @Value("BBB")
    private String name;

    public QuestionB() {
        id++;
        System.out.println(">>> static id (inside QuestionB constructor ) = " + id);
        System.out.println(">>> name (inside QuestionB constructor ) =  " + name);
    }

    @Override
    public String toString() {
        return "QuestionB{" +
                "name='" + name + '\'' +
                '}';
    }
}
