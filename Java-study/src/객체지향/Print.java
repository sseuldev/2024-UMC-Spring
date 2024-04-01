package 객체지향;

// 클래스 파일 생성 - public class 가 아닌 class 로 시작함을 유의
class Print {
        // 클래스 Print의 멤버 : 변수 delimiter와 메소드 A, B
        public static String delimiter = "";

        public static void A() {
            System.out.println(delimiter);
            System.out.println("A");
            System.out.println("A");
        }

        public static void B() {
            System.out.println(delimiter);
            System.out.println("B");
            System.out.println("B");
        }
}

// public class 는 main이 되는 곳에 쓴다고 생각하면 이해가 편함
// 이처럼 클래스를 한 패키지 안에 파일 따로 생성해서 부품처럼 활용하자

