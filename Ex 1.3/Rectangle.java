public class Rectangle {
    private double length;
    private double width;

    // Constructor
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getter và Setter
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Tính diện tích
    public double getArea() {
        return length * width;
    }

    // Tính chu vi
    public double getPerimeter() {
        return 2 * (length + width);
    }

    // Hiển thị thông tin
    @Override
    public String toString() {
        return "Rectangle[length=" + length + ",width=" + width + "]";
    }
}
