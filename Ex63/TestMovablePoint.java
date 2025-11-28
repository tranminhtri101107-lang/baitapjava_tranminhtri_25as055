package Ex63;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 2, 3);
        System.out.println(point); // In thông tin ban đầu

        point.moveUp();
        System.out.println("Move up: " + point);

        point.moveRight();
        System.out.println("Move right: " + point);

        point.moveDown();
        System.out.println("Move down: " + point);

        point.moveLeft();
        System.out.println("Move left: " + point);
    }
}
