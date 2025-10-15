public class Circle {
    // Thuộc tính
    private double radius = 1.0;

    // Constructor mặc định
    public Circle() {
    }

    // Constructor có tham số
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter
    public double getRadius() {
        return radius;
    }

    // Setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Tính diện tích
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Tính chu vi
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Xuất thông tin
    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}
