package sec5;

import java.util.Arrays;

public class StringEx1 {
    public static void main(String[] args) {

        String str1 = new String("kuyejin");
        String str2 = "KUYEJIN";
        System.out.println("name: "+ str1);
        System.out.println("네 번째 글자: "+str1.charAt(3));
        System.out.println("문자열 비교: " + str1.equals(str2));

        //문자열을 바이트 배열로 분리
        byte[] bArr = str1.getBytes();
        System.out.println("byte[]의 출력: " );


        //주소값나옴
        System.out.println(bArr);
        //첫번째 방법 : 별도의 메소드를 호출하여 반복문으로 출력
        printArr(bArr);
        //두번째방법
        char[] cArr = new char[bArr.length];
        for(int i = 0; i < bArr.length; i++){
            cArr[i] = (char) bArr[i];
        }
        System.out.println(Arrays.toString(cArr));

        System.out.println("i는 몇 번째? :" + (str1.indexOf("i"))); // 5
        System.out.println("인덱스가 3부터 6전까지 출력 :" + str1.substring(3,6));
        System.out.println("소문자 : " +str1.toLowerCase());
        System.out.println("대문자 : " +str1.toUpperCase());
        String data1 = str1.replace("k","W");
        System.out.println("k를 W로 변경: " + data1);

        String str3 = "                   My name is Yejin, Ku          ";
        System.out.println("str3의 글자 수 : " +(str3.length()));
        System.out.println("공백 제거 전 : " + str3);
        System.out.println("공백 제거 후 : " + str3.trim());
        System.out.println("str3 공백 제거 후 글자 수: " + (str3.trim().length()));

        //int -> String 변경
        int k = 1004;

        String t1 = k + ""; // 비추천
        String t2 = String.valueOf(k);
        System.out.println(t1);
        System.out.println("int -> String 변경: "+t2);
        System.out.println("t1이 문자? : " + (t1 instanceof String));
        System.out.println("t2이 문자? : " + (t2 instanceof String));





    }
    static void printArr(byte[] arr){
        for(int i = 0; i< arr.length; i++){
            char a = (char)arr[i];
            System.out.println(a);
        }
    }
}
