/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.pkg1.Question;
import spring.pkg1.QuestionA;
import spring.pkg2.QuestionC;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Configuration()
@ComponentScan(basePackages = "spring")
public class Spring {


    public static Question a;

    @Autowired
    public static void setA(Question a) {
        Spring.a = a;
    }

    public Spring() {

    }

    public static void testStatic() {
        a.displayInfo();
    }

    @PostConstruct
    public static void post() {
        System.out.println(">>>>>>>>>" + a);
    }

    public static void main(String[] args) {
        //new Spring().a.displayInfo();
//        Resource r = new ClassPathResource("applicationContext.xml");
//        BeanFactory factory = new XmlBeanFactory(r);

//        Question a = (Question) factory.getBean("a");

        //        Question b = (Question) factory.getBean("b");
//        a.displayInfo();
//        //        b.displayInfo();
//

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Spring.class);
        System.out.println(Arrays.deepToString(context.getBeanDefinitionNames()));
        System.out.println(Arrays.deepToString(annotationConfigApplicationContext.getBeanDefinitionNames()));
        QuestionA a1 = context.getBean("a1", QuestionA.class);
        QuestionA a11 = annotationConfigApplicationContext.getBean(QuestionA.class);
        QuestionA a2 = context.getBean("a2", QuestionA.class);
        QuestionC c = context.getBean("c", QuestionC.class);
        System.out.println(a1.getQuestion().getName() + "a1 name=");
        System.out.println(a2.getQuestion().getName() + "a2 name=");
        System.out.println(a2);
        System.out.println(a1);
        System.out.println(c);


    }


}
