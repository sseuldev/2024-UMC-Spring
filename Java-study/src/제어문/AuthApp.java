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

// ==가 아닌 equals를 사용하는 이유
// 원시적인 데이터 타입이 아닌 String은 equals를 사용하자!
// 입력값인 문자열과 String 값인 문자열은 값은 같다고 해도 서로 다른 위치에 위치
// 값의 위치를 보는 == 연산자는 적합하지 않음
