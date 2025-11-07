package Ex61;

public class Circle {
    protected double radius = 1;

    public Circle() {
        this.radius = 1;
    }
    public Circle (double radius) {
        this.radius = radius;
    }
    public Circle (double radius, String color, boolean filled) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius * radius;
    }
    public double getPerimeter() {
        return 2 * radius;
    }
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
}
