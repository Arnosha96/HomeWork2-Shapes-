import org.junit.Assert;
import org.junit.Test;

public class SquareTest {

    @Test
    public void getAreaTestWithPositiveSideLength(){
        Square test = new Square(7);
        double actual = test.getArea();
        double expected = 9.0;
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void getAreaTestWithNegativeSideLength(){
        Square test = new Square(-7);
        double actual = test.getArea();
        double expected = -1.0;
        Assert.assertEquals(actual, expected, 0);
    }

    @Test
    public void checkParametersForPositiveSideLength(){
        Square test = new Square(7);
        boolean actual = test.checkParametersForNegative();
        Assert.assertFalse(actual);
    }

    @Test
    public void checkParametersForNegativeSideLength(){
        Square test = new Square(-7);
        boolean actual = test.checkParametersForNegative();
        Assert.assertTrue(actual);
    }
}
