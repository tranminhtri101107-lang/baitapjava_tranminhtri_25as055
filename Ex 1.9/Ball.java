public class Ball {
    private double x;       // hoành độ tâm bóng
    private double y;       // tung độ tâm bóng
    private int radius;     // bán kính
    private double xDelta;  // vận tốc theo trục X
    private double yDelta;  // vận tốc theo trục Y

    // Constructor
    public Ball(double x, double y, int radius, double xDelta, double yDelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    // Getter
    public double getX() { return x; }
    public double getY() { return y; }
    public int getRadius() { return radius; }
    public double getxDelta() { return xDelta; }
    public double getyDelta() { return yDelta; }

    // Setter
    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
    public void setRadius(int radius) { this.radius = radius; }
    public void setxDelta(double xDelta) { this.xDelta = xDelta; }
    public void setyDelta(double yDelta) { this.yDelta = yDelta; }

    // Di chuyển bóng
    public void move() {
        x += xDelta;
        y += yDelta;
    }

    // Khi bóng chạm tường dọc → đảo hướng theo X
    public void reflectHorizontal() {
        xDelta = -xDelta;
    }

    // Khi bóng chạm tường ngang → đảo hướng theo Y
    public void reflectVertical() {
        yDelta = -yDelta;
    }

    @Override
    public String toString() {
        return String.format("Ball[(%.1f,%.1f),speed=(%.1f,%.1f)]", x, y, xDelta, yDelta);
    }
}
