package sec2;

import java.io.*;

//DataOutputStream : 한글과 같은 캐릭터 셋을 지정하여 출력할 수 있음 => 기본셋 : UTF-8
public class DataOutputStreamEx1 {
    public static void main(String[] args) {

        try {
            File file = new File("out7.txt");

            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            DataOutputStream dos = new DataOutputStream(bos);

            dos.writeUTF("데이터아웃풋스트림");
            dos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
