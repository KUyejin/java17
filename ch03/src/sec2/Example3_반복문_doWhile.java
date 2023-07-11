package sec2;

public class Example3_반복문_doWhile {

    public static void main(String[] args) {

        //do while

        int i = 0;
        int tot = 0;
        do {
            i += 3;
            tot += i;
        } while (i >= 100);
        // 조건문에 적합하지 않지만 일단 한번 실행됨

        System.out.println("tot = " + tot); // 3


        i = 0;
        tot = 0;
        while (i >= 100) {
            i += 3;
            tot += i;
        }
        // 조건식에 부합하지 않기 때문에 실행xxxxxxxxxxx
        System.out.println("tot2 = " + tot); // 0


    }
}
