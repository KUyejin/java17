package sec2;

import java.util.Date;

public class Example2_String {

    public static void main(String[] args) {

        // new : 객체를 생성할 때 사용
        
        Date today = new Date();
        String data1 = "2023-07-13"; //기본 변수 타입
        String data2 = new String("2023-07-13"); //레퍼런스 타입


        //문자열과 객체타입은 값이같다고 하더라도 등호(==)로 비교할 수 없다.
        //값 비교를 위해서는 equals()를 사용


        if(data1 == data2) System.out.println("서로 같다");
        else System.out.println("서로 다르다");
        // 출력값 : 서로 다르다
        
        if(data1.equals(data2)) System.out.println("서로 같음");
        else System.out.println("서로 다르다");
        //출력값: 서로 같음

        String info = "";
        String name = "구예진";
        int age = 32;
        double ht = 156.0;


        //숫자에 문자 하나라도 더하기가 되면 문자열로 변환된다.
        System.out.println("-----------------------------------------");
        info = name + age + ht; // 문자열(name)을 만났기 때문에 age도 문자열이 된다.
        System.out.println("info = " + info);

































    }
}
