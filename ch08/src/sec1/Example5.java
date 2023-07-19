package sec1;

public class Example5 {

    static class Animal {
    }

    static class Tiger extends Animal {
    }

    static class Lion extends Animal {
    }

    public static void main(String[] args) {
        Animal ani;
        ani = new Tiger();
        ani = new Lion();

        Tiger tiger;
        tiger = new Tiger();
        changeObject1(tiger); //오류
        changeObject2(tiger); //오류x


        Lion lion;
        lion = new Lion();
        changeObject1(lion); //오류x
        changeObject2(lion); //오류


    }

    //예외처리 루틴을 별도의 함수로 진행
    private static void changeObject1(Animal a) {
        try {
            Lion l = (Lion) a;
        } catch (ClassCastException e) {
            System.out.println("형제나 다른 패키지에 있는 클래스의객체로 형 변환 할 수 없다");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void changeObject2(Animal a) {
        try {
            Tiger l = (Tiger) a;
        } catch (ClassCastException e) {
            System.out.println("형제나 다른 패키지에 있는 클래스의객체로 형 변환 할 수 없다");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
