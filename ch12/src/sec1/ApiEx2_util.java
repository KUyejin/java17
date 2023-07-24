package sec1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//java.util 패키지 - java.lang 패키지의 추가 기능판으로 대부분 import가 필요한 클래스
public class ApiEx2_util {
    public static void main(String[] args) {

        Date now = new Date();
        System.out.println(now); // Mon Jul 24 10:30:51 KST 2023

        // ** 날짜를 String으로 변환
        //String strNow = now.toString();
        //String today1 = sdf.format(strNow); //오류 ->(자바8 미만만 가능)
        //System.out.println("문자열의 표시형식 날짜로 표시: " + today1);

        //text에 들어가 있음 -> 형식 나타냄 (날짜, 숫자, 통합)
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 mm분 ss초");

        // 자바 8이상 사용 가능
        String today2 = sdf.format(now); //문자열(String)으로 굳이 바꾸지 않아도 됨
        System.out.println("날짜에 표시형식 날짜로 표시: " + today2);
        //출력값: 날짜에 표시형식 날짜로 표시: 2023년 07월 24일 18분 15초


        //Date 객체 사용
        //getYear()은 1900을 기준으로 하기 때문에 1900더해줘야함
        int y = now.getYear()+ 1900; //년도
        int M = now.getMonth() + 1; //월
        int d = now.getDate(); //일
        int w = now.getDay(); // 요일
        int h = now.getHours(); //시
        int m = now.getMinutes(); //분
        int s = now.getSeconds(); //초
        System.out.println("년도1: " +y); // 년도1: 123 + 1900 = 2023
        System.out.println("월: " + M); // 6+1
        System.out.println("일: " + d); //24
        System.out.println("요일: " + w); //1
        System.out.println("시: " + h); 
        System.out.println("분: " + m);
        System.out.println("초: " + s);

        // Calendar cal = new Calendar();
        // java8이상은 추상체와 정적 구조로 구성되어 있으므로 별도의 객체를 생성하지 않는다
        int yy = Calendar.YEAR;
        System.out.println("년도2: "+ yy); //년도2: 1

        Calendar n = Calendar.getInstance();


        //자바8이상은 LocaleDate을 활용하여 시간대나
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    }
}
