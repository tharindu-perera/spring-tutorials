package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import spring.pkg2.Question;
import spring.pkg2.QuestionA;
import spring.pkg2.QuestionB;


@Configuration
@ComponentScan(basePackages = "spring.pkg2")
public class Config {
    //    @Bean
//    @Qualifier("xxxxx")
    public Question getMessageServiceA() {
        System.out.println(">>>>>>>>>>>>getMessageServiceA");
        return new QuestionA();
    }

    @Autowired
    public void getMessageServiceA(Question a) {
        System.out.println("?????>>>>>>>>>>>>" + a);

    }

    @Bean
    @Primary
    public Question getMessageServiceB() {
        System.out.println(">>>>>>>>>>>>getMessageServiceB");
        return new QuestionB();
    }
}
