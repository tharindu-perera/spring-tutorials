package spring2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import spring.pkg1.MyComponent;
import spring.pkg1.Question;

@RunWith(MockitoJUnitRunner.class)
//@ContextConfiguration(classes = Config.class)
public class MockitoJunitRunnerTest {
    @Mock
    public Question question;
    //    @Mock
//    Question questionA;
    @InjectMocks
    MyComponent myComponent;

    @Test
    public void testMyCompo() {
//        Question questionA =Mockito.mock(Question.class);
//        MyComponent my=new MyComponent(questionA);
//        Mockito.when(questionA.displayInfo()).thenReturn("xxxddxxxx");

        BDDMockito
                .given(
                        question.displayInfo())
                .willReturn("XXXXX");
        myComponent.print();
    }
}
