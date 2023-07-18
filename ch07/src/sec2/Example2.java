package sec2;

import sec1.Outer;
import sec1.Outer.*;

public class Example2 {

    public static void main(String[] args) {

        Outer out1 = new Outer();

        out1.setItem1(100);
        out1.setItem2("구예진");
        out1.method1();

        System.out.println("----------------------");

        //외부 클래스, 내부 클래스 인스턴스 명 = 외부 인스턴스, new 내부생성자 함수();
        Outer.Inner in1 = out1.new Inner();
        in1.setItem3(200);
        in1.setItem4("천재");
        in1.method2();

        System.out.println("----------------------");
        
        //Dbl dbl = new Dbl();
        // 오류 -> Dbl클래스는 public이 아니라서 접근 불가

        //Dbl db1 = new Dbl();
        //Dbl ab = out1.getDbl();
        
        //이중 클래스인 Outer.java 안에 있는 Dbl 클래스의 객체를 생성하는 방법
        //out.db1; //Dbl클래스 타입의 멤버필드에 위한 생성
        //out1.getDbl(); //메소드 호출에 의한 생성

    }
}
