package sec2;
@FunctionalInterface
interface MyLambda7<T,Q>{
    boolean compare(T t, Q q);
}
public class LambdaEx7 {
    public static void main(String[] args) {
        MyLambda7<Integer,Integer> com1 = (a,b) -> {
          return (a == b ? true : false);
        };

        MyLambda7<String ,String> com2 = (a,b) -> {
            return (a.equals(b) ? true : false);
        };

        System.out.println("숫자 비교: "+com1.compare(1,2));
        System.out.println("문자 비교: " + com2.compare("안녕","안녕"));

    }

}
