package sec1;

@FunctionalInterface
interface MyLambda2{
    void print(int x);
}
// 매개변수o, 리턴x
public class LambdaEx2 {
    public static void main(String[] args) {
        MyLambda1 lam1 = () -> System.out.println("람다식");

        lam1.print();

        MyLambda2 lam2 = (x) -> {System.out.println("제곱결과: " + x*x);};
        lam2.print(12);
    }
}
