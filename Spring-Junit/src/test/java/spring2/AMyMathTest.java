package spring2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import spring.MyMath;

import static org.junit.Assert.*;

public class AMyMathTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void addA() {
        MyMath m=new MyMath();
        assertEquals(4,m.add(3,1));
    }
}