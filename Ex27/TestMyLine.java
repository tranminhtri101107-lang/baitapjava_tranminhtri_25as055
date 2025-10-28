package Ex27;

import java.io.PrintStream;

public class TestMyLine {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(5, 6);
        MyLine line1 = new MyLine(p1, p2);

        System.out.println(line1);

        // Kiểm tra getter & setter
        line1.setBeginXY(2, 3);
        line1.setEndXY(6, 8);
        System.out.println("Begin: " + line1.getBegin());
        System.out.println("End: " + line1.getEnd());

        // Kiểm tra độ dài và góc nghiêng
        PrintStream printf = System.out.printf("Length: %.2f%n", line1.getLength());
        System.out.printf("Gradient (radians): %.2f%n", line1.getGradient());
    }
}
