package sec1;

public class Example3 {
    public static void main(String[] args) {

        // 32 16 8 4 2 1
        int a = 20; //010100 ->
        int b = 14; //001110


        System.out.println("==========[비트 연산]===============");
        // 비트연산 = 2진수
        // 0 이면 양수 . 1이면 음수
        System.out.println("a & b : " + (a&b)); // 모든 숫자가 1이거나 0 일때만 1 => 00101 => 4
        System.out.println("a | b : " + (a|b)); // 모든 숫자가 1 또는 0일때 1 => 11110 => 30
        System.out.println("~a : " + (~a)); //-21
        System.out.println("a ^ b : " + (a^b)); //같으면 0, 다르면 1 => 11010 => 26
        System.out.println("a>>2 : " + (a>>2)); // 2번 뒤로 쉬프트 :5 -> 20 / 2 = 10 -> 10 / 2 = 5
        System.out.println("a<<2 : " + (a<<2)); // 2번 앞으로 쉬프트 : 20 * 2 = 40 -> 40 * 2  = 80
        System.out.println("a>>>2 : " + (a>>>2)); // 2번 뒤로 쉬프트 :5 -> 20 / 2 = 10 -> 10 / 2 = 5
        //System.out.println("a<<<2 : " + (a<<<2)); //오류


    }
}
