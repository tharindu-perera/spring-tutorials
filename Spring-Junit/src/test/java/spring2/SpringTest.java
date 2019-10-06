package spring2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.Config;
import spring.MyComponent;
import spring.Question;

@RunWith(MockitoJUnitRunner.class)
//@ContextConfiguration(classes = Config.class)
public class SpringTest {
    @Mock
    Question questionA;
    @InjectMocks
    MyComponent myComponent;

    @Test
    public void testMyCompo(){
//        Question questionA =Mockito.mock(Question.class);
//        MyComponent my=new MyComponent(questionA);
        Mockito.when(questionA.displayInfo()).thenReturn("xxxddxxxx");
        myComponent.print();
     }
}
