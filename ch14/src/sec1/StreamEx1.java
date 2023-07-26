package sec1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamEx1 {
    public static void main(String[] args) {
       // 파일 만들기
        try {
            FileOutputStream fos = new FileOutputStream("out1.txt");
            fos.write(65);
            fos.write(66);
            fos.write(67);
            fos.write(115);
            fos.write(127);
            fos.write(65);
            fos.write(66);
            fos.close(); // 반드시 닫아줘야함
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("파일이 존재하지 않거나 경로가 틀렸습니다");
        }
        
        // 파일 가져오기
        try {
            FileInputStream fis =new FileInputStream("out1.txt");
            //파일 읽기
            int i;
            while ((i = fis.read()) != -1){
                System.out.print((char)i);
            }
            System.out.println();
            fis.close();
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("파일이 존재하지 않거나 경로가 틀렸습니다");
        }
            
    }
}
