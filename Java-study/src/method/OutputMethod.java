package method;

import java.io.FileWriter;
import java.io.IOException;

public class OutputMethod {

    public static void main(String[] args) throws IOException {
        System.out.println(twoTimes("a", "-"));

        // 함수값에 대해 txt 파일로 저장하는 방법
        FileWriter fw = new FileWriter("out.txt");
        fw.write(twoTimes("a", "*"));
        fw.close();
    }

    // return 값에 맞는 타입을 함수명 앞에 적어주어야 함
    // return 을 이용하여 함수를 이용해 값 전달 가능
    public static String twoTimes(String text, String delimiter) {
        String out = "";
        out = out + delimiter + "\n";
        out = out + text + "\n";
        out = out + text + "\n";

        return out;
    }
}
