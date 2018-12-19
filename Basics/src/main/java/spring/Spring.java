/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Spring {
    Question a;

    public Spring() {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new Spring().a.displayInfo();
        Resource r = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(r);

        Question a = (Question) factory.getBean("a");

        //        Question b = (Question) factory.getBean("b");
//        a.displayInfo();
//        //        b.displayInfo();
//
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Question greetingMessageService = context.getBean("questionB", Question.class);
//        System.out.println(greetingMessageService);

    }

    public Question getA() {
        return a;
    }

    public void setA(Question a) {
        this.a = a;
    }

}
