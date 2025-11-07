package Ex51;

public class TestLine {
    public static void main(String[] args) {

        Line l1 = new Line(0, 0, 3, 4);
        System.out.println(l1);
        System.out.printf("Length: %.2f%n", l1.getLength());
        System.out.printf("Gradient (radian): %.2f%n", l1.getGradient());

        Point p1 = new Point(1, 1);
        Point p2 = new Point(5, 6);

        Line l2 = new Line(p1, p2);
        System.out.println(l2);
        System.out.printf("Length: %.2f%n", l2.getLength());
        System.out.printf("Gradient (radian): %.2f%n", l2.getGradient());

        l2.setBeginXY(2, 3);
        l2.setEndXY(7, 8);
        System.out.println("After moving line:");
        System.out.println(l2);

        System.out.println("Begin point: " + l2.getBegin());
        System.out.println("End point: " + l2.getEnd());

        System.out.printf("Length: %.2f%n", l2.getLength());
        System.out.printf("Gradient (radian): %.2f%n", l2.getGradient());
    }
}
