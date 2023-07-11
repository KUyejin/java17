package sec2;

public class Example2_반복문_while {

    public static void main(String[] args) {

        int i = 0;
        int tot = 0;
        while(i <= 100){
            i++;
            tot += i;
        }
        System.out.println("tot = " + tot);


        i = 0;
        tot = 0;
        while (i >= 0){
            i++;
            tot += i;
            if(i>=100) break;
        }
        System.out.println("tot2 = " + tot);


        //=============[while]=======================
//        int sum = 0;
//        int i2 = 0;
//
//        while(sum <= 100){
//            System.out.printf("%d - %d%n", i2, sum);
//            sum += ++i;
//
//        }

























    }
}
