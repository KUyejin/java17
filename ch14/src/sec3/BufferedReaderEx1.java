package sec3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//BufferedReader: 줄 단위로 불러올 경우
public class BufferedReaderEx1 {
    public static void main(String[] args) throws IOException,Exception {

        BufferedReader rd = new BufferedReader(
                new FileReader("out4.txt")
        );

        String data;
        // 데이터가 있으면 계속 출력
        //readLine()  -> 라인단위로 읽어옴 , 빈줄이 있으면 nu;ll
        while((data = rd.readLine()) != null){
            System.out.println(data);
        }
    }
}
