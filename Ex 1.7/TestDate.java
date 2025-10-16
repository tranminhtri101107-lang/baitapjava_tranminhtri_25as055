public class TestDate {
    public static void main(String[] args) {
        // Tạo đối tượng Date1 với ngày 1/2/2014
        MyDate date1 = new MyDate(1, 2, 2014);
        System.out.println(date1.displayDate());

        // Tạo đối tượng Date2 với ngày 9/12/2099
        MyDate date2 = new MyDate(9, 12, 2099);
        System.out.println(date2.displayDate());

        // Hiển thị riêng từng phần của date2
        System.out.println("Month: " + date2.getMonth());
        System.out.println("Day: " + date2.getDay());
        System.out.println("Year: " + date2.getYear());

        // Gán lại giá trị cho date2 thành 3/4/2016
        date2.setDay(3);
        date2.setMonth(4);
        date2.setYear(2016);
        System.out.println(date2.displayDate());
    }
}

class MyDate {
    private int day;
    private int month;
    private int year;

    // Constructor
    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Setter
    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Getter
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    // Hàm hiển thị định dạng dd/mm/yyyy
    public String displayDate() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}
