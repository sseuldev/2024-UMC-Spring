package 제어문;

// 반복문
public class LoopApp {

    public static void main(String[] args) {

        System.out.println("=== while 반복문 ===");
        int i = 0;
        while(i < 3) {
            System.out.println(2);
            System.out.println(3);
            i++;
        }

        System.out.println("=== for 반복문 ===");
        for(int j = 0; j < 3; j++){
            System.out.println(2);
            System.out.println(3);
        }
    }
}
