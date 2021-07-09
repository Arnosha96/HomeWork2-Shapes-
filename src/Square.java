public class Square implements Shape{
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        if (checkParametersForNegative())
            return -1.0;
        else
            return Math.pow(sideLength, 2);
    }

    @Override
    public boolean checkParametersForNegative() {
        return sideLength < 0;
    }

    @Override
    public String getShapeName() {
        return this.getClass().getName();
    }
}
