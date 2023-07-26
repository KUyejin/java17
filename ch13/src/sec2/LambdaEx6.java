package sec2;

import java.util.Scanner;

@FunctionalInterface
interface MyLambda6<T,Q>{
    Q calc(T x, T y);

}
public class LambdaEx6 {
    public static void main(String[] args) {
        // 더하기 빼기 곱하기 나누기 구현체

        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("첫 번째 숫자 입력 >> ");
            int num1 = sc.nextInt();

            System.out.println("두 번째 숫자 입력 >> ");
            int num2 = sc.nextInt();

            System.out.println("[+], [-], [*], [/], [%]중 선택 (종료: q) ");
            String sel = sc.next();


            if (sel.equals("+")) {
                MyLambda6<Integer, Integer> sub = (x, y) -> {
                    return x + y;
                };
                System.out.println("[더한 결과] => " + sub.calc(num1, num2));

            } else if (sel.equals("-")) {
                MyLambda6<Integer, Integer> min = (x, y) -> {
                    return x - y;
                };
                System.out.println("[뺀 결과] => " + min.calc(num1, num2));

            } else if (sel.equals("*")) {
                MyLambda6<Integer, Long> mul = (x, y) -> {
                    return (long) x * y;
                };
                System.out.println("[곱한 결과] => " + mul.calc(num1, num2));

            } else if (sel.equals("/")) {
                MyLambda6<Integer, Double> div = (x, y) -> {
                    return (double) x / y;
                };
                System.out.println("[나눈 결과] => " + div.calc(num1, num2));
            } else if (sel.equals("%")) {
                MyLambda6<Integer, Integer> mod = (x, y) -> {
                    return x % y;
                };

            } else if (sel.equals("q")) {
                System.out.println("종료");
                break;
            }
        }

/*
        System.out.println("더한 결과 : " + sub.calc(num1,num2));
        System.out.println("뺸 결과 : " + min.calc(num1,num2));
        System.out.println("곱한 결과 : " + mul.calc(num1,num2));
        System.out.println("나눈 결과 : " + div.calc(num1,num2));
*/


    }
}
