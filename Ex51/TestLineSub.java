package Ex51;

public class TestLineSub {
    public static void main(String[] args) {
        LineSub l1 = new LineSub(0, 0, 3, 4);
        System.out.println(l1);
        System.out.printf("Length: %.2f%n", l1.getLength());
        System.out.printf("Gradient (radian): %.2f%n", l1.getGradient());

        Point p1 = new Point(1, 2);
        Point p2 = new Point(5, 6);
        LineSub l2 = new LineSub(p1, p2);
        System.out.println(l2);
        System.out.printf("Length: %.2f%n", l2.getLength());
        System.out.printf("Gradient (radian): %.2f%n", l2.getGradient());

        l2.setBeginXY(2, 3);
        l2.setEndXY(6, 7);
        System.out.println("After changing coordinates:");
        System.out.println(l2);
        System.out.printf("Length: %.2f%n", l2.getLength());
    }
}
