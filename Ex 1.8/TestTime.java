public class TestTime {
    public static void main(String[] args) {
        Time t1 = new Time(1, 2, 3);
        System.out.println(t1);

        Time t2 = new Time(4, 5, 6);
        System.out.println(t2);

        System.out.println("Hour: " + t2.getHour());
        System.out.println("Minute: " + t2.getMinute());
        System.out.println("Second: " + t2.getSecond());

        Time t3 = new Time(23, 59, 58);
        System.out.println(t3);
        System.out.println(t3.nextSecond()); // 23:59:59
        System.out.println(t3.nextSecond()); // 00:00:00

        // Tạo lại để ra đúng 00:00:01
        t3 = new Time(0, 0, 0);
        System.out.println(t3.nextSecond()); // 00:00:01

        System.out.println(t3.previousSecond()); // 00:00:00
        System.out.println(t3.previousSecond()); // 23:59:58
    }
}
