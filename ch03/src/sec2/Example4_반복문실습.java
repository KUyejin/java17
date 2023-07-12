package sec2;

public class Example4_반복문실습 {


    public static void main(String[] args) {

        for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= 4; b++) {
                System.out.print(b + "\t");
            }
            System.out.println();
        }


        System.out.println("--------------------------------------------------------");
        /*
        1	2	3	4	5	6	7
        8	9	10	11	12	13	14
        15	16	17	18	19	20	21
        22	23	24	25	26	27	28
        29	30	31

        */

        for (int i = 1; i <= 31; i++) {
            if (i % 7 == 1) {
                System.out.println();
            }
            System.out.print(i + "\t");
        }
        System.out.println();

        System.out.println();

        int cnt = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 7; j++) {
                if (cnt == 32) break;
                System.out.print(cnt++ + "\t");
            }
            System.out.println();

        }


        System.out.println("--------------------------------------------------------");
        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("--------------------------------------------------------");
        /*
         * * * * *
         * * * *
         * * *
         * *
         *
         */

        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 6-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("--------------------------------------------------------");
        // 구구단
        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.print(j + " x " + i + " = " + i * j + "\t");
            }
            System.out.println();
        }


        System.out.println("--------------------------------------------------------");
        //0 0 , 0 1 , 0 2 , 1 0 ,1 1, 1 2, 2 0, 2 1, 2 2, 3 0, 3 1, 3 2, 4 0, 4 1, 4 2 , 5 0, 5 1, 5 2
        //0 0 , 0 1 , 0 2 , 1 0 ,1 1, 1 2, 2 0, 2 1, 2 2, 3 0, 3 1, 3 2, 4 0, 4 1, 4 2 , 5 0, 5 1, 5 2
        for(int i = 0; i < 5; i++){
            for(int j = 0; j <3; j++){
                if(i==2){
                    continue;
                }
                if(j==1){
                    break;
                }
                System.out.println("A");
            }
        }


    }


    
}
