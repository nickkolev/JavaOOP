package L05Polymorphism.lab.P02Shapes;

public class Rectangle extends Shape{

    private final double height;
    private final double width;

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public Double calculatePerimeter() {
        if (perimeter == null) {
            perimeter = 2 * height + 2 * width;
        }

        return perimeter;
    }

    @Override
    public Double calculateArea() {
        if (area == null) {
            area = height * width;
        }

        return area;
    }
}
