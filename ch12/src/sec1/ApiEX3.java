package sec1;

import java.util.*;

public class ApiEX3 {
    public static void main(String[] args) {
        //Math.random() : 0~1 까지의 실수
//        int su = (int) (Math.random() * 44 + 1); // 1~45까지 나옴
//        System.out.println("임의의 수: " + su);
//
//        System.out.println("==============================");
//        //로또 추첨기를 만드세요(랜덤 안되게)
//        for (int i = 0; i < 6; i++) {
//            int num = (int) (Math.random() * 44 + 1);
//            System.out.println(num);
//        }
//
//        System.out.println("==============================");
//
//        int[] num2 = new int[6];
//        for (int i = 0; i < 6; i++) {
//            num2[i] = (int) (Math.random() * 44 + 1);
//
//            for(int j = 0; j < 6; j++){
//                num2[j] = (int) (Math.random() * 44 + 1);
//                if(num2[i] == num2[j]){
//                    break;
//                }
//            }
//            System.out.println(num2[i]);
//        }

        //중복 oo
        System.out.println("==============================");
        Integer[] lotto = new Integer[6];
        for (int i = 0; i < 6; i++) {
            lotto[i] = (int) (Math.random() * 44 + 1);
            System.out.println(lotto[i]);
        }

        System.out.println("===========================");
        //hashset -> 중복x, 순서x
        Set<Integer> gen = new HashSet<>(Arrays.asList(lotto));
        //중복된 번호가 잇으면, 개수가 8개 미만이므로 6개 미만인 경우
        //중복 없이 요소가 6개 될 때 까지 반복
        while(gen.size() < 6){
            gen.add((int)(Math.random()*44+1));
        }
        System.out.println(gen.toString());

        //set을 Array(배열로 변환)
        lotto = gen.toArray(new Integer[6]);
        Arrays.sort(lotto); //오름차순 정렬
        //Arrays.sort(lotto, Collections.reverseOrder()); //내림차순
        System.out.println("정렬 후: "+ Arrays.toString(lotto));


    }
}
