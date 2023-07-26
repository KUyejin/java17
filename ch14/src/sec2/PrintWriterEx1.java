package sec2;

import java.io.*;

public class PrintWriterEx1 {
    public static void main(String[] args) {
        try{
            File file = new File("out4.txt");

            if(!file.exists()){
                file.createNewFile();
            }

            //연필
            FileWriter fw = new FileWriter(file);

            // 연필 사용자 (정말 필기를 잘 하는 사람)
            PrintWriter writer = new PrintWriter(fw);

            //연필로 노트에 쓰기
            writer.write("방갑습니다!!!!!!\n");
            writer.println("println 가능"); // println 가능
            writer.print("print 가능"); //print 가능
            writer.print("\nprint 가능");

            writer.close();
            //file은 알아서 닫아짐 -> close해줄 필요 xx

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
