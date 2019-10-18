package spring.pkg2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import spring.pkg1.Question;

@Component
@Qualifier("B")
//@Primary
 public class QuestionB implements Question {

    private static int id;
    @Value("BBB")
    public String name;
    //    @Autowired
//    @Qualifier("A")
    private Question question;


    public QuestionB() {
        id++;
        System.out.println(">>> inside QuestionB constructor ");
//        System.out.println(">>> name (inside QuestionB constructor ) =  " + name);
    }

    public String displayInfo() {
        return ("name =" + name + " , question = " + question);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
