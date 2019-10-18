/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.pkg1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class MyComponent {
    //    @Autowired
//    @Qualifier("B")
    public Question question;


    public MyComponent() {
        System.out.println("Inside MyComponent default constructor");
    }

    @Autowired
    public MyComponent(@Qualifier("B") Question question) {
        this.question = question;
        System.out.println("Inside MyComponent  auro constructor");
    }



//    @Autowired
//    public MyComponent(@Qualifier("B")Question question) {
//        this.question = question;
//        System.out.println("Inside MyComponent constructor");
//    }

    @PostConstruct
    public void post(){
        System.out.println("@PostConstruct   MyComponent");
    }

    @PreDestroy
    public void predestroy(){
        System.out.println("@PreDestroy   MyComponent");
    }

    public void print(){
        System.out.println(question.displayInfo());
    }
}
