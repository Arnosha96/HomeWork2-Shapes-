public class Ellipse implements Shape{
    private double x;
    private double y;

    public Ellipse(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double getArea() {
        if (checkParametersForNegative())
            return -1.0;
        else
            return (x * y) * Math.PI;
    }

    @Override
    public boolean checkParametersForNegative() {
        return x < 0 && y < 0 || x < 0 || y < 0;
    }

    @Override
    public String getShapeName() {
        return this.getClass().getName();
    }
}
