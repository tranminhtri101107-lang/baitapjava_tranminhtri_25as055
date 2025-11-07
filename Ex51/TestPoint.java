package Ex51;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20); // Construct a Point
        System.out.println(p1);

        p1.setXY(100, 10);
        System.out.println(p1);

        p1.setX(50);
        p1.setY(75);
        System.out.println("X is: " + p1.getX());
        System.out.println("Y is: " + p1.getY());
        System.out.println(p1);
    }
}
