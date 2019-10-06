package spring;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class Main {
    static org.slf4j.Logger logger = LoggerFactory.getLogger("Main.class");

    public static void main(String[] args) {


        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        MyComponent app = context.getBean(MyComponent.class);
//        MyComponent app2 = context.getBean(MyComponent.class);
        System.out.println(app);
        logger.info("-->{}", (Object) context.getBeanDefinitionNames());
//        System.out.println(app2);
//        System.out.println(app.question.displayInfo());
        context.close();
    }
}
