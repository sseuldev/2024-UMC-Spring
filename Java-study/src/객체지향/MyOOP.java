package 객체지향;

// 변수와 메소드

//class Print {
//
//    public static String delimiter = "";
//
//    public static void A() {
//        System.out.println(delimiter);
//        System.out.println("A");
//        System.out.println("A");
//    }
//
//    public static void B() {
//        System.out.println(delimiter);
//        System.out.println("B");
//        System.out.println("B");
//    }
//}

public class MyOOP {

    public static void main(String[] args) {
        Print.delimiter = "----";
        Print.A();
        Print.B();

        Print.delimiter ="****";
        Print.A();
        Print.B();
    }
}
