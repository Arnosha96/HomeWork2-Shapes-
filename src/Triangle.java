public class Triangle implements Shape {
    private double side;
    private double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double getArea() {
        if (checkParametersForNegative()){
            return -1.0;
        }else
            return (side * height) / 2;
    }

    @Override
    public boolean checkParametersForNegative() {
        return side < 0 && height < 0 || side < 0 || height < 0;
    }

    @Override
    public String getShapeName() {
        return this.getClass().getName();
    }
}
