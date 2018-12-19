/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring {
    @Autowired
    Question a;

    public Spring() {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new Spring().a.displayInfo();
//                Resource r = new FileSystemResource
//                    ("/Users/tharinduperera/NetBeansProjects/Spring/Chaptor02/src/main/resources/applicationContext.xml");
//                BeanFactory factory = new XmlBeanFactory(r);

//                Question a = (Question) factory.getBean("ss");
//
//                Question b = (Question) factory.getBean("ssf");
//        System.out.println(a);


        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        QuestionA greetingMessageService = (QuestionA) context.getBean( "ss");
//        QuestionA greetingMessageService2 = context.getBean( "ssf", QuestionA.class);
//        QuestionB greetingMessageServiceB = context.getBean( "b", QuestionB.class);
        QuestionB greetingMessageServiceBB = context.getBean("bb", QuestionB.class);
//
//        System.out.println(greetingMessageServiceB.getQuestion().getName());
        System.out.println(greetingMessageServiceBB.getQuestion().getName());


    }

    public Question getA() {
        return a;
    }

    public void setA(Question a) {
        this.a = a;
    }

}
