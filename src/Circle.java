public class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        if (checkParametersForNegative())
            return -1.0;
        else
            return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public boolean checkParametersForNegative() {
        return radius <0;
    }

    @Override
    public String getShapeName() {
        return this.getClass().getName();
    }
}
