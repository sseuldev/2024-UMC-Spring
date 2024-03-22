package 제어문;

// 반복문 + 배열
public class LoopArray {

    public static void main(String[] args) {

        // String[] users = {"egoing", "jinhuck", "youbin"};
        String[] users = new String[3];
        users[0] = "egoing";
        users[1] = "jinhuck";
        users[2] = "youbin";

        // 반복문의 경계는 배열의 길이를 나타내는 length 이용해서 유동적으로 실행되게 하기
        for(int i = 0; i < users.length; i++){
            if(i < users.length - 1) {
                System.out.println(users[i] + ",");
            } else {
                System.out.println(users[i]);
            }
        }
    }
}
