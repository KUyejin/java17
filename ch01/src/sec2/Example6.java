package sec2;

public class Example6 {

    public static void main(String[] args) {

        int a = 100;
        int b = 0b100; // 0b -> 2진수 100(4 0 0) -> 실제 연산과 논리 연산 등을 수행
        int c = 0100;  // 0 -> 8진수 100 (64 0 0) -> 권한 부여 및 수행, 회수
        int d = 0x100; // ox -> 16진수 100(256 0 0) -> 실제 주소
        System.out.println("a= " + a); // 100
        System.out.println("b= " + b); // 4
        System.out.println("c= " + c); // 64
        System.out.println("d= " + d); // 256
    }
}
