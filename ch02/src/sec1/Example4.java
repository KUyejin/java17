package sec1;

import java.util.Date;

public class Example4 {
    public static void main(String[] args) {
        Date birth1 = new Date();
        String birth2 = "2023-07-07";

        System.out.println(birth1);

        //instanceof: Date로 부터 만들어진 날짜형식(인스턴스)인지 확인 하는 것
        System.out.println("확인1 : " + (birth1 instanceof Date)); // 맞으면 true 반환
        // System.out.println("확인2 : " + (birth2 instanceof Date)); //에러남

        System.out.println("---------[삼항연산자]---------");
        //삼항 연산자 : 조건? 참 : 거짓

        int point = 84;
        String pan = point >= 80? "합격" : "불합격";
        System.out.println("판정: " + pan);







    }
}
