package spring;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import spring.pkg2.MyComponent;


public class Main {
    static org.slf4j.Logger logger = LoggerFactory.getLogger("Main.class");

    public static void main(String[] args) {


        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        MyComponent app = context.getBean(MyComponent.class);
//        logger.info(">>"+app.question.toString());
        for (String str : context.getBeanDefinitionNames()
        ) {
//            System.out.println(str);
        }
        context.close();
    }
}
