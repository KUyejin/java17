package sec1;

// 데이터 타입
public class Example2 {
    public static void main(String[] args) {
        // 1byte = 8bit -> 2의 8승 -> -128 ~ -1 , 0 ~ 127 => 256개
        // 표현 범위: -2의 n-1승 ~ 2의 n-1승 -1

        boolean a = true; //논리형 변수 (1byte)
        char b = 'k'; //문자 변수(2byte)


        // ------[정수형 타입]--------------

        // byte b = 129; // 오류 -> 오버플로우
        byte c = 127; // 바이트변수(1byte)

        // short d = 32768; // 오류 -> 오버플로우
        short d = 32767; // 반정도정수 (2byte)

        int e = 785367800; // 단정도정수 (4byte)

        long f = 785367800; //배정도정수 (4byte)
        long f2 = 785367800L; //배정도정수 (8byte)

        // -------[실수형 타입]----------------
        float g = 3.141592f; // 단정도실수(4byte)
        double h = 3.141592; // 배정도실수(8byte)
        double h2 = 3.141592000000000000008d;

        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("c= " + c);
        System.out.println("d= " + d);
        System.out.println("e= " + e);
        System.out.println("f= " + f);
        System.out.println("f2= " + f2);
        System.out.println("g= " + g);
        System.out.println("h= " + h);
        System.out.println("h2= " + h2);


    }
}
