package test1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sun.model.Sun;

public class SunTest {
    @Before
    public void setUp(){

    }

    @After
    public void tearDown(){}

    @Test
    public void SunCreateTest(){
        Sun sun = new Sun(10,10,10);
        Assert.assertEquals(10,sun.getXPosition());
        Assert.assertEquals(10,sun.getYPosition());
        Assert.assertEquals(10,sun.getEndYPosition());
    }
}
