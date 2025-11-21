package Ex61;

public abstract class Shape {
    protected String color = "red";
    protected Boolean filled = true;
    private double side;

    public Shape() {
    }

    public Shape(String color, boolean  filled) {
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();

    public String toString() {
        return "Shape{" + "color=" + color + ", filled=" + filled + '}';
    }

    public double getSide() {
        double side = 0;
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
