import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void getAreaTestWithPositiveSideAndHeight(){
        Triangle test = new Triangle(6,5);
        double actual = test.getArea();
        double expected = 15.0;
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void getAreaTestWithNegativeSide(){
        Triangle test = new Triangle(-6,5);
        double actual = test.getArea();
        double expected = -1.0;
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void getAreaTestWithNegativeHeight(){
        Triangle test = new Triangle(6,-5);
        double actual = test.getArea();
        double expected = -1.0;
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void getAreaTestWithNegativeSideAndHeight(){
        Triangle test = new Triangle(-6,-5);
        double actual = test.getArea();
        double expected = -1.0;
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void checkParametersForPositiveSideAndHeight(){
        Triangle test = new Triangle(6,5);
        boolean actual = test.checkParametersForNegative();
        Assert.assertFalse(actual);
    }

    @Test
    public void checkParametersForNegativeSide(){
        Triangle test = new Triangle(-6,5);
        boolean actual = test.checkParametersForNegative();
        Assert.assertTrue(actual);
    }

    @Test
    public void checkParametersForNegativeHeight(){
        Triangle test = new Triangle(6,-5);
        boolean actual = test.checkParametersForNegative();
        Assert.assertTrue(actual);
    }
    @Test
    public void checkParametersForNegativeSideAndHeight(){
        Triangle test = new Triangle(-6,-5);
        boolean actual = test.checkParametersForNegative();
        Assert.assertTrue(actual);
    }

}
