
package spring;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import spring.pkg2.MyComponent;
import spring.pkg2.Question;


@Configuration
@ComponentScan(value = "spring")
public class MyApplicationTest {

    private AnnotationConfigApplicationContext context = null;

    @Bean
    public Question getMessageService() {
        return new Question() {

            public String displayInfo() {
                return "Mock Service";
            }

        };
    }

    @Before
    public void setUp() {
        context = new AnnotationConfigApplicationContext(MyApplicationTest.class);
    }

    @After
    public void tearDown() {
        context.close();
    }

    @Test
    public void test() {
        MyComponent app = context.getBean(MyComponent.class);
//        Assert.assertTrue(app.a.displayInfo().equals("Mock Service"));
    }

}
