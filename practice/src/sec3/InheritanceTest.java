package sec3;

class MyPoint extends Object{ // 컴파일러가 자동으로 생성해줌
    int x;
    int y;
}
//상속
class Circle extends MyPoint{
    int r;
}
//포함
class Circle2{
    MyPoint p = new MyPoint(); //참조변수 초기화
    int r;
}
public class InheritanceTest {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.x = 1;
        c.y = 2;
        c.r = 3;

        Circle2 c2 = new Circle2();
        c2.p.x = 4;
        c2.p.y = 5;
        c2.r = 6;

        System.out.println(c.x);
        System.out.println(c2.p.x);

        System.out.println(c.toString()); //object클래스를 상속받아서 사용 가능
        System.out.println(c);
     }
}
