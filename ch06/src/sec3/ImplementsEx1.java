package sec3;

public class ImplementsEx1 {

    public static void main(String[] args) {
        Flying f1;
        f1 = new Flying() {
            //익명내부객체
            @Override
            public void fry() {
                System.out.println("비행체가 날아갑니다");
            }
        };
        f1.fry();

        Flying f2;
        f2 = new Birds();
        f2.fry();

        Flying f3;
        f3 = new Dragonfly();
        f3.fry();

        Flying f4 = new Airplane();
        f4.fry();


    }


}
