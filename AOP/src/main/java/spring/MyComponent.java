/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class MyComponent {
    @Autowired
    @Qualifier("B")
    Question question;

    public MyComponent() {
//        System.out.println("Inside MyComponent default constructor");
    }

    //    @Autowired
//    @Qualifier("B")
    public MyComponent(Question questionA) {
        this.question = questionA;
        System.out.println("Inside MyComponent constructor" + this.question);
    }

    public Question getQuestion() {
        return question;
    }

    @PostConstruct
    public void post() {
        //  System.out.println("@PostConstruct");
    }

    public void print() {
//    System.out.println(question.displayInfo());
        System.out.println(">>>> print");
    }

    public int getValue() {
        return 123;
    }

    public int setndgetValue(int x) {
        return x * 2;
    }


    @PreDestroy
    public void predestroy() {
        // System.out.println("@PreDestroy");
    }


}
