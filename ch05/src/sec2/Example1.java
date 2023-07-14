package sec2;
// Shape 클래스는 현재 클래스인 Example1 클래서와 다른 패키지인 sec1이 존재하므로 import가 필요함

import sec1.Shape;

public class Example1 {
    public static void main(String[] args) {

        //String 클래스와 같이 base 클래스인 경우는 사용자 정의 클래스와 다르게
        // java 언어 안에 내장되어 있으므로 별도의 import 필요없음
        String str1 = new String();
        String str2 = new String("김기태");

        // 클래스 명 인스턴스명
        Shape s1 = new Shape();
        s1.setType("square");
        s1.setLength(50);
        double d1 = s1.calcArea();
        System.out.println("현재 도형1의 면적: " + d1);

        Shape s2 = new Shape("triangle");
        s2.setLength(30);
        double d2 = s2.calcArea();
        System.out.println("현재 도형2의 면적: " + d2);

        Shape s3 = new Shape("circle", 20);
        double d3 = s3.calcArea();
        System.out.println("현재 도형3의 면적: " + d3);


    }
}
