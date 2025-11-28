package Ex64;

public class Test {
    public static void main(String[] args) {
        System.out.println("=== Test MovablePoint ===");
        MovablePoint p = new MovablePoint(6, 3, 2, 3); // x=0,y=0, xSpeed=2,ySpeed=3
        System.out.println("Initial: " + p);
        p.moveRight();
        System.out.println("After moveRight(): " + p);
        p.moveUp();
        System.out.println("After moveUp(): " + p);
        p.moveLeft();
        System.out.println("After moveLeft(): " + p);
        p.moveDown();
        System.out.println("After moveDown(): " + p);


        System.out.println();
        System.out.println("=== Test MovableCircle ===");
        MovableCircle c = new MovableCircle(5, 5, 1, 1, 10); // center at (5,5), speed (1,1), radius 10
        System.out.println("Initial: " + c);
        c.moveLeft();
        System.out.println("After moveLeft(): " + c);
        c.moveUp();
        System.out.println("After moveUp(): " + c);
        c.moveRight();
        c.moveRight();
        System.out.println("After moveRight() twice: " + c);
        c.moveDown();
        System.out.println("After moveDown(): " + c);


        System.out.println();
        System.out.println("=== Combined test: move point and circle together ===");
        Movable[] movables = {p, c};
        for (Movable m : movables) {
            m.moveRight();
            m.moveUp();
            System.out.println(m);
        }
    }
}
