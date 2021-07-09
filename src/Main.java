public class Main {
    public static void main(String[] args) {
        Square square = new Square(2);
        Triangle triangle = new Triangle(3, 4);
        Circle circle = new Circle(5);
        Ellipse ellipse = new Ellipse(3, 2);

        if (square.getArea() < 0){
            System.out.format("Negative parameters entered for %s, please try again.\n", square.getShapeName());
        } else
        System.out.format("%s Area = %s!\n",square.getShapeName(), square.getArea());

        if (triangle.getArea() < 0){
            System.out.format("Negative parameters entered for %s, please try again.\n", triangle.getShapeName());
        } else
        System.out.format("%s Area = %s!\n",triangle.getShapeName(), triangle.getArea());

        if (circle.getArea() < 0){
            System.out.format("Negative parameters entered for %s, please try again.\n", circle.getShapeName());
        } else
        System.out.format("%s Area = %s!\n",circle.getShapeName(), circle.getArea());

        if (ellipse.getArea() < 0){
            System.out.format("Negative parameters entered for %s, please try again.\n", ellipse.getShapeName());
        } else
        System.out.format("%s Area = %s!\n",ellipse.getShapeName(), ellipse.getArea());
    }
}
