package 객체지향;

import java.io.FileWriter;
import java.io.IOException;

// 클래스와 인스턴스
// class : System, Math, FileWriter
// instance : f1
public class OthersOOP {

    public static void main(String[] args) throws IOException {

        // Math 클래스 안에는 변수, 메소드도 존재
        System.out.println(Math.PI);    // 원주율
        System.out.println(Math.floor(1.8));    // 내림 => 1.0
        System.out.println(Math.ceil(1.8));     // 올림 => 2.0

        // 파일에 기록할때 사용하는 클래스 : FileWriter
        // 인스턴스 f1 : 클래스 FileWriter의 복제본
        FileWriter f1 = new FileWriter("data.txt");
        f1.write("Hello");
        f1.write(" Java");
        f1.close();
    }
}

// method : 서로 연관된 코드를 그룹핑해서 이름 붙인 정리 정돈 상자
// class : 서로 연관된 변수와 method를 모아서 이름 붙인 것
// instance : 하나의 클래스를 복제하여 해당 클래스의 기능을 기반으로 작동하는 객체
