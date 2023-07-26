package sec1;
@FunctionalInterface
interface MyLambda4{
    String print(int a);
}
public class LambdaEx4 {
    public static void main(String[] args) {
        MyLambda4 lam4 = (a) -> {
          return "매개변수 값은" + a + "/ 람다식4: 매개변수o, 리턴o";
        };
        System.out.println(lam4.print(4));
    }
}
