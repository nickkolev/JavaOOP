package L05Polymorphism.lab.P02Shapes;

public abstract class Shape {

    protected Double perimeter;
    protected Double area;

    public abstract Double calculatePerimeter();
    public abstract Double calculateArea();

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
