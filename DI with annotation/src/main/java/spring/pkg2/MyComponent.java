/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.pkg2;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class MyComponent {

    public Question question;


    public MyComponent() {
        System.out.println("Inside MyComponent default constructor");
    }

    //    @Autowired
//    @Qualifier("A")
    public MyComponent(Question questionB) {
        this.question = questionB;
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
