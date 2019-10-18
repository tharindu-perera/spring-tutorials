package spring.pkg1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = {"spring.pkg2"})
public class Config2 {
//    @Bean
//    public Question getMessageServiceA(){
//        return new QuestionA();
//    }
//    @Bean
////    @Primary
//    public Question getMessageServiceB(){
//        return new QuestionB();
//    }
}
