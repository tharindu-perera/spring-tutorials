package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
@SpringBootApplication
@RestController
public class Library {
    public static void main(String[] args) {
        SpringApplication.run(Library.class);
    }

    @GetMapping()
    public String firstMethod() {
        return "Hello Worldfff";
    }
}
