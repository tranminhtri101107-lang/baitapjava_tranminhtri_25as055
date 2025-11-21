package Ex62;

public class Rectangle implements GeometricObject {
    private double width;
    private double length;

    public Rectangle(double width) {
        this.width = width;
        this.length = length;
    }
    public String  toString() {
        return "Rectangle[" + super.toString() + ",width=" + width + ", length=" + length + "]";
    }
    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
