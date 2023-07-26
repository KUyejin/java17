package sec3;

import java.io.FileReader;
import java.io.IOException;
// FileLeader : 바이트 단위로 읽어옴
// 파일 읽어오기
public class FileLeaderEx1 {
    public static void main(String[] args) throws IOException, Exception {

        FileReader fr = new FileReader("out3.txt");
        int rd;

        // 데이터가 있으면 계속 출력
        while((rd = fr.read()) != -1){
            System.out.println((char) rd);
        }
    }
}
