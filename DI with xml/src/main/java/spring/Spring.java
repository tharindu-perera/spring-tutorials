/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring {
    Question a;

    public Spring() {

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
        QuestionA a = context.getBean("a", QuestionA.class);
        System.out.println(a.getQuestion().getName() + "???a");
        QuestionA aa = context.getBean("aa", QuestionA.class);
        System.out.println(aa.getQuestion().getName() + "???aa");
        a.getQuestion().setName("from AAA");
        System.out.println(a.getQuestion().getName() + "???a");
        System.out.println(aa.getQuestion().getName() + "???aa");


    }


}
