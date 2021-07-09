import org.junit.Assert;
import org.junit.Test;

public class CircleTest {
    @Test
    public void getAreaTestWithPositiveRadius(){
        Circle test = new Circle(4);
        double actual = test.getArea();
        double expected = 50.26;
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void getAreaTestWithNegativeRadius(){
        Circle test = new Circle(-4);
        double actual = test.getArea();
        double expected = -1.0;
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void checkParametersForPositiveRadius(){
        Circle test = new Circle(4);
        boolean actual = test.checkParametersForNegative();
        Assert.assertFalse(actual);
    }

    @Test
    public void checkParametersForNegativeRadius(){
        Circle test = new Circle(-4);
        boolean actual = test.checkParametersForNegative();
        Assert.assertTrue(actual);
    }
}
