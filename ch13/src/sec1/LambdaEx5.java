package sec1;
@FunctionalInterface
interface MyLambda5{
    int print(String a);
}
public class LambdaEx5 {
    public static void main(String[] args) {
        MyLambda5 lam5 = (str) ->{
            return Integer.parseInt(str); //리턴타입 int
        };
        String s1 = "100";
        String s2 = "10";
        System.out.println(lam5.print(s1) + lam5.print(s2));
    }
}
