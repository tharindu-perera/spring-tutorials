package spring;


import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.pkg1.MyComponent;


public class Main {
    static Logger logger= Logger.getLogger("Main.class");
    public static void main(String[] args) {


//        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//        MyComponent app = context.getBean(MyComponent.class);
//          app.print();
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MyComponent app = context.getBean(MyComponent.class);
        app.print();
        ((ClassPathXmlApplicationContext) context).close();

    }
}
