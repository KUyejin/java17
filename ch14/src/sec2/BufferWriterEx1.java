package sec2;

import java.io.*;

//BufferWriter
public class BufferWriterEx1 {
    public static void main(String[] args) {
        //String path = "D:\\kuyejin\\java\\out3.txt"
        //File file = new File(path);
        try {
            //노트
            File file = new File("out3.txt");

            // 파일이 없는 경우만 새로 만들어라
            if (!file.exists()) {
                file.createNewFile();
            }

            //연필
            FileWriter fw = new FileWriter(file);

            // 연필 사용자
            BufferedWriter writer = new BufferedWriter(fw);

            //연필로 노트에 쓰기
            writer.write("점심시간 10분 전");

            writer.close();
            //file은 알아서 닫아짐 -> close해줄 필요 xx

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
