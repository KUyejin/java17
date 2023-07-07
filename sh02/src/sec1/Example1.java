package sec1;

public class Example1 {
    public static void main(String[] args) {

        // 연산(Operation) : OPcode(명령코드), Opreand(데이터가 있는 메모리 주소)
        // 연산의 종류: 산술연산, 대입연산, 증감연산 => 결과 = 수치
        //             관계연산, 논리연산 => 결과 = true, false
        //             비트연산 , 기타연산자(삼항연산자)


        // 산술 연산 : +, -, *, /, %
        int a = 20;
        int b = 30;
        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = b / a;
        int g = b % a;

        System.out.println(c); //50
        System.out.println(d); //-10
        System.out.printf("a * b = %d\n", a*b); //600
        System.out.printf("b / a = %d\n", b/a); //1
        System.out.println(g); //10

        System.out.println("============================================");

        // 대입 연산 : =, +=, -=, *=, /=
        int su = 0;
        float num = 0;

        su += 10; // su = su + 10;
        System.out.println("su += 10 => " + su); //10

        su -= 5; // su = su - 5;
        System.out.println("su -= 5 => " + su); // 5

        su *= 10; // su = su * 10;
        System.out.println("su *= 10 => " + su); // 50


        int su2 = su;
        su /= 4; // su = su /4 ;
        num = su2 / 4.0f; // num = (float) su / 4;
        System.out.println("su /= 4 (int) => " + su); //12
        System.out.println("su /= 4 (float) => " + num); // 12.5

        System.out.println("============================================");

        // 증감 연산 : ++, --

        int x = 10 , y = 10;
        System.out.printf("x++의 결과: %d\n" , x++); //10 후위 연산 ( 나중에 증가)
        System.out.println("나중 출력: " + x); //11

        System.out.printf("++y의 결과: %d\n", ++y); //11 전위 연산 ( 처음부터 증가)
        System.out.println("나중 출력: " + y); //11


        System.out.printf("--x의 결과: %d\n" , --x); // 10
        System.out.println("나중 출력: " + x); // 10

        System.out.printf("y--의 결과: %d\n",  y--); // 11
        System.out.println("나중 출력: " + y); //10




    }
}
