package sec1;

//람다의 추상체는 기능적 인터페이스로 람다를 구현하려면, 이와 같은 추상체 필요
@FunctionalInterface
interface MyLambda1 { //추상체
    void print();
}

public class LambdaEx1 {

    public static void method1() {
        System.out.println("메소드1");
    }
    public static void main(String[] args) {
        method1();
        MyLambda1 lam1 = () -> {
            System.out.println("람다식1 : 매개변수x, 리턴x");
        };
        lam1.print();
    }


}



