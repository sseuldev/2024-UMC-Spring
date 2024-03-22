package 제어문;

// 배열
public class ArrayApp {

    public static void main(String[] args) {

        // 배열 생성 방법
        String[] users = new String[3];
        users[0] = "egoing";
        users[1] = "jinhuck";
        users[2] = "youbin";

        System.out.println(users.length);   // 3

        // 배열 생성과 동시에 값 초기화 방법
        int[] scores = {10, 100, 200};
    }
}
