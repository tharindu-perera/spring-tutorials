package spring;


 import org.apache.log4j.Logger;
 import org.apache.log4j.spi.LoggerFactory;
 import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

 import java.util.Arrays;
 import java.util.Collections;


public class Main {
    static Logger logger= Logger.getLogger("Main.class");
    public static void main(String[] args) {


        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        MyComponent app = context.getBean(MyComponent.class);
//        MyComponent app2 = context.getBean(MyComponent.class);
        System.out.println(app);
        logger.info( Arrays.toString(context.getBeanDefinitionNames())   );
//        System.out.println(app2);
        System.out.println(app.question.displayInfo());
        context.close();
    }
}
