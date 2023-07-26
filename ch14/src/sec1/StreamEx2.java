package sec1;

// 키보드로 문자를 입력받아 out2.txt로 저장하고, 그 내용을 불러와 콘솔창에 다시 출력하는 프로그램

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class StreamEx2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        byte[] bArr = new byte[5];
        boolean run = true;

        /*for(int i = 0; i<bArr.length;i++){
            byte[i] = sc.nextByte();
        }*/

            System.out.println("문자 입력 >>");
            byte i = sc.nextByte();
//            if(bArr[i] == 48){
//                run = false;
//                run = false;
//            }
            try{
                FileOutputStream fos = new FileOutputStream("out2.txt");
                //byte[] k = indata();

                fos.write(i);

            }catch (IOException e){
                e.printStackTrace();
                System.out.println("파일이 존재하지 않거나 경로가 틀렸습니다.");
            }


    }



}
