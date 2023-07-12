package sec1;

import java.util.Arrays;

public class Example4_배열초기화 {
    public static void main(String[] args) {

        int[] intArr = new int[3];

        double[] doubleArr =new double[3];

        boolean[] boolArr = new boolean[3];

        String[] strArr = new String[3]; // String은 초기화 해주는 게 좋음 -> nullpoint오류발생


        System.out.println(intArr); // 주소값

        System.out.println("==========[for문 출력]============");
        for(int a : intArr) System.out.println(a); // 1 2 3

        System.out.println("==========[Arrays.toString 출력]==============");
        System.out.println("intArr : " + Arrays.toString(intArr)); // [1, 2, 3]
        System.out.println("doubleArr : " + Arrays.toString(doubleArr)); //[0.0, 0.0, 0.0]
        System.out.println("boolArr : " + Arrays.toString(boolArr));  //[false, false, false]
        System.out.println("strArr : " + Arrays.toString(strArr)); //[null, null, null]
    }

}
