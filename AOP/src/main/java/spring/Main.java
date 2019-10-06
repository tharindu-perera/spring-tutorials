package spring;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class Main {
    public static void main(String[] args) {


        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        MyComponent app = context.getBean(MyComponent.class);
//        app.print();
        app.getValue();
//        app.setndgetValue(2);
//        System.out.println(app.getQuestion());
//        System.out.println(app.question.displayInfo());

        context.close();
    }
}
