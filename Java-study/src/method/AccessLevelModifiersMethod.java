package method;

// access level modifier(접근 제어자) : public, protected, default, private
// 클래스 생성
class Greeting {
    // public, protected, default, private
    public static void hi() {
        System.out.println("Hi");
    }
}
public class AccessLevelModifiersMethod {

    private static void hello() {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        Greeting.hi();
        hello();
    }
}

// public : 다른 클래스에서도 접근 가능한 접근제어자
// private : 같은 클래스에서만 접근 가능한 접근제어자 -> 다른 클래스일 경우 에러 발생

