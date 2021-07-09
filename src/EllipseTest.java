import org.junit.Assert;
import org.junit.Test;

public class EllipseTest {

    @Test
    public void getAreaTestWithPositiveSideAndHeight(){
        Ellipse test = new Ellipse(3,2);
        double actual = test.getArea();
        double expected = 18.84;
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void getAreaTestWithNegativeSide(){
        Ellipse test = new Ellipse(-3,2);
        double actual = test.getArea();
        double expected = -1.0;
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void getAreaTestWithNegativeHeight(){
        Ellipse test = new Ellipse(3,-2);
        double actual = test.getArea();
        double expected = -1.0;
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void getAreaTestWithNegativeSideAndHeight(){
        Ellipse test = new Ellipse(-3,-2);
        double actual = test.getArea();
        double expected = -1.0;
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void checkParametersForPositiveSideAndHeight(){
        Ellipse test = new Ellipse(3,2);
        boolean actual = test.checkParametersForNegative();
        Assert.assertFalse(actual);
    }

    @Test
    public void checkParametersForNegativeSide(){
        Ellipse test = new Ellipse(-3,2);
        boolean actual = test.checkParametersForNegative();
        Assert.assertTrue(actual);
    }

    @Test
    public void checkParametersForNegativeHeight(){
        Ellipse test = new Ellipse(3,-2);
        boolean actual = test.checkParametersForNegative();
        Assert.assertTrue(actual);
    }
    @Test
    public void checkParametersForNegativeSideAndHeight(){
        Ellipse test = new Ellipse(-3,-2);
        boolean actual = test.checkParametersForNegative();
        Assert.assertTrue(actual);
    }
}
