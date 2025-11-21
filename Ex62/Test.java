package Ex62;

import Ex61.Rectangle;
import Ex61.Shape;

public class Test {
    public static void main(String[] args) {
        Rectangle s3 = new Rectangle(1.0, 2.0);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());

        GeometricObject s4 = new Circle( 4.0);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getPerimeter());
    }
}
