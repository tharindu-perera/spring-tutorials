package springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
@SpringBootApplication
@RestController
@ImportResource("classpath:spring.xml")

public class Library {

    @Autowired
    MyBean myBean;

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(Library.class);
        String[] beanNames = configurableApplicationContext.getBeanDefinitionNames();
        Arrays.sort(beanNames);

        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }

    @GetMapping("/")
    public String firstMethod() {
        return "Hello Worldfff" + myBean.getName();
    }
}
