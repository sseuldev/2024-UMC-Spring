package method;

class Print{

    public String delimiter;

    // instance에 속한 메소드는 static이 없다!
    public void a() {
        System.out.println(this.delimiter);
        System.out.println("a");
        System.out.println("a");
    }
    public void b() {
        System.out.println(this.delimiter);
        System.out.println("b");
        System.out.println("b");
    }

    // 클래스에 속한 메소드는 static이 있다!
    public static void c(String delimiter) {
        System.out.println(delimiter);
        System.out.println("c");
        System.out.println("c");
    }
}

public class staticMethod {

    public static void main(String[] args) {
//        Print.a("-");
//        Print.b("-");

        // t1과 t2 를 instance 라고 함 -> 클래스에 소속된 개별적인 객체 의미
        Print t1 = new Print();
        t1.delimiter = "-";

        // instance에 속한 메소드 a, b
        t1.a();
        t1.b();

        // 클래스에 속한 메소드 c
        Print.c("$");

        Print t2 = new Print();
        t2.delimiter = "*";
        t2.a();
        t2.b();
    }
}
