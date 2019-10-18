package spring2;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.pkg1.Config;
import spring.pkg1.MyComponent;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class SpringJUnit4ClassRunnerTest {
    //    @Mock
//    Question questionA;
    @Autowired
    MyComponent myComponent;

    @Test
    public void testMyCompo() {
        Assert.assertEquals("BBB", myComponent.question.getName());
        myComponent.print();
    }
}
