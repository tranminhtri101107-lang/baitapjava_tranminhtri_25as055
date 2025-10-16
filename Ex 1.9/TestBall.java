public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(1.1, 2.2, 10, 3.3, 4.4);
        System.out.println(b1);

        Ball b2 = new Ball(80.0, 35.0, 5, 4.0, 6.0);
        System.out.println(b2);

        System.out.println("x is: " + b2.getX());
        System.out.println("y is: " + b2.getY());
        System.out.println("radius is: " + b2.getRadius());
        System.out.println("xDelta is: " + b2.getxDelta());
        System.out.println("yDelta is: " + b2.getyDelta());

        b2.move();
        System.out.println(b2);
        b2.move();
        System.out.println(b2);

        // Giả lập bóng chạm tường trên
        b2.reflectVertical();
        b2.move();
        System.out.println(b2);
        b2.move();
        System.out.println(b2);

        // Giả lập bóng chạm tường bên phải
        b2.reflectHorizontal();
        b2.move();
        System.out.println(b2);
        b2.move();
        System.out.println(b2);
        b2.move();
        System.out.println(b2);
        b2.move();
        System.out.println(b2);
        b2.move();
        System.out.println(b2);
        b2.move();
        System.out.println(b2);

        // Giả lập bóng chạm tường dưới
        b2.reflectVertical();
        b2.move();
        System.out.println(b2);
        b2.move();
        System.out.println(b2);
        b2.move();
        System.out.println(b2);
        b2.move();
        System.out.println(b2);
        b2.move();
        System.out.println(b2);
    }
}
