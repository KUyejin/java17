package sec2;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
//Files클래스의 write()메소드는 static이므로 별도의 파일 객체를 만들지 않는다
public class FilesEx1 {
    public static void main(String[] args) {
        Path path = Paths.get("c:\\Users\\db400tea\\IdeaProjects\\ch14\\out6.txt");

        try {
            Files.write(path, "I\'m dying of hunger".getBytes());
        }catch (IOException e){
            e.printStackTrace();
        }

        //파일 읽기
        try {
            FileInputStream fis =new FileInputStream("out3.txt");
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
