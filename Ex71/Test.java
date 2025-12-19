//package Ex71;
//
//public class Test {
//    public static void main(String[] args) {
//        // 1. Tạo một Visit cho khách hàng Premium
//        Visit v1 = new Visit("Alice (Premium)", new Date());
//        // Thiết lập thông tin thành viên cho khách hàng này
//        v1.getCustomer().setMember(true);
//        v1.getCustomer().setMemberType("Premium");
//        // Thiết lập chi tiêu
//        v1.setServiceExpense(100.0); // Giảm 20% -> còn 80
//        v1.setProductExpense(100.0); // Giảm 10% -> còn 90
//        // Kỳ vọng tổng: 170
//        System.out.println(v1);
//        System.out.println("--------------------------------------------------");
//
//        // 2. Tạo một Visit cho khách hàng Gold
//        Visit v2 = new Visit("Bob (Gold)", new Date());
//        v2.getCustomer().setMember(true);
//        v2.getCustomer().setMemberType("Gold");
//        v2.setServiceExpense(100.0); // Giảm 15% -> còn 85
//        v2.setProductExpense(100.0); // Giảm 10% -> còn 90
//        // Kỳ vọng tổng: 175
//        System.out.println(v2);
//        System.out.println("--------------------------------------------------");
//
//        // 3. Tạo một Visit cho khách hàng Silver
//        Visit v3 = new Visit("Charlie (Silver)", new Date());
//        v3.getCustomer().setMember(true);
//        v3.getCustomer().setMemberType("Silver");
//        v3.setServiceExpense(100.0); // Giảm 10% -> còn 90
//        v3.setProductExpense(100.0); // Giảm 10% -> còn 90
//        // Kỳ vọng tổng: 180
//        System.out.println(v3);
//        System.out.println("--------------------------------------------------");
//
//        // 4. Tạo một Visit cho khách hàng KHÔNG phải thành viên
//        Visit v4 = new Visit("David (No Member)", new Date());
//        v4.getCustomer().setMember(false);
//        v4.setServiceExpense(100.0); // Không giảm -> 100
//        v4.setProductExpense(100.0); // Không giảm -> 100
//        // Kỳ vọng tổng: 200
//        System.out.println(v4);
//    }
//}
