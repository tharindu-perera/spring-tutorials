/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class MyComponent {

    Question question;


    public MyComponent() {
        System.out.println("Inside MyComponent default constructor");
    }

    @Autowired
//    @Qualifier("B")
    public MyComponent(Question questionA) {
        this.question = questionA;
        System.out.println("Inside MyComponent constructor");
    }

    @PostConstruct
    public void post() {
        System.out.println("@PostConstruct");
    }

    @PreDestroy
    public void predestroy() {
        System.out.println("@PreDestroy");
    }
}
