package sec1;

@FunctionalInterface
interface MyLambda3{
    String print();
}
//매개변수x, 리턴o
public class LambdaEx3 {
    public static void main(String[] args) {
        MyLambda3 lam3 = () -> { //구현제
          return "람다식3 : 매개변수x , 리턴o";
        };
        System.out.println(lam3.print());
    }
}
