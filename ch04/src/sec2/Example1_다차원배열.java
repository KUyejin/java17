package sec2;

public class Example1_다차원배열 {

    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30};

        //2차원 배열
        int[][] arr2 = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90},
                {20, 40, 60}
        };
        System.out.println(arr2.length);

        int[][][] arr3 = {
                {{10, 20}, {40, 50}, {70, 80}, {20, 40}},
                {{100}, {400, 500}, {700, 800, 900}, {200, 400, 500, 600}, {500, 800, 300, 400, 500}}
        };
        System.out.println(arr3.length);

        System.out.println("=======[2차원 배열]========");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();
        }


        System.out.println("=======[3차원 배열]========");
        for (int i = 0; i < arr3.length; i++) { // 면
            for (int j = 0; j < arr3[i].length; j++) { //줄

                for (int k = 0; k < arr3[i][j].length; k++)  { // 칸
                    System.out.print(arr3[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println("-------");
        }


    }
}
