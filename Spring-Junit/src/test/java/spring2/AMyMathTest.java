package spring2;

import org.junit.After;
import org.junit.Before;
import spring.pkg1.MyMath;

import static org.junit.Assert.assertEquals;


public class AMyMathTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }


    //    @Test
    public void addA() {
        MyMath m=new MyMath();
        assertEquals(4,m.add(3,1));
    }
}