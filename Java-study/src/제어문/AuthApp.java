package 제어문;

// 조건문 응용 - 로그인
public class AuthApp {

    public static void main(String[] args) {

        // argument 넣는 방법 : edit configurations
        System.out.println(args[0]);
        System.out.println(args[1]);

        String id = "egoing";
        String inputId = args[0];

        String pass = "1111";
        String inputPass = args[1];

        System.out.println("Hi.");

        // if(inputId == id){ 이게 아니라..
        if (inputId.equals(id) && inputPass.equals(pass)){
            System.out.println("Master!");
        } else {
            System.out.println("Who are you?");
        }
    }
}
