package spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class Config {
    @Bean
    public Question getMessageServiceA() {
        return new QuestionA();
    }

    @Bean
//    @Primary
    public Question getMessageServiceB() {
        return new QuestionB();
    }
}
