package method;

// 메소드의 기본 형식
public class WhyMethod {

    // 메소드 생성
    // 매개변수(parameter) 설정
    public static void printTwoTimes(String text, String delimiter) {
        System.out.println(delimiter);
        System.out.println(text);
        System.out.println(text);
    }

    public static void main(String[] args) {

        // 인자(argument) 설정
        printTwoTimes("a", "-");
        printTwoTimes("b", "*");
        printTwoTimes("c", "!");
    }
}
