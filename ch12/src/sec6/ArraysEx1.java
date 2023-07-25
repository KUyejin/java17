package sec6;

import java.util.Arrays;

public class ArraysEx1 {
    public static void main(String[] args) {
        char[] arr1 = {'k', 'i', 'm', 'j', 'a', 'v', 'a'};
        System.out.println(arr1);

        // 얕은 복제
        char[] arr2 = arr1;

        System.out.println(arr2);
        System.out.println(arr1.hashCode()); // 주소 출력
        System.out.println(arr2.hashCode());
        System.out.println(arr1 == arr2); //true -> 주소값 같음

        System.out.println("-------------------------------------");

        //깊은 복제
        char[] arr3 = Arrays.copyOf(arr1, arr1.length); // 모든 요소 복사
        System.out.println(arr3);
        System.out.println(arr3.hashCode());
        System.out.println(arr1 == arr3); // false -> 주소값 다름
        System.out.println(Arrays.equals(arr1,arr3)); // 배열의 값을 비고

        //arr1 == arr3 ->배열은 주소로 비교하게 됨
        //Arrays.equals(arr1,arr2) -> 배열의 값을 비교


        System.out.println("----------[sort]---------------------------");
        int[] points = {90,80,10,100,60,75};
        System.out.println("정렬 전 => ");
        for(int p : points){
            System.out.print(+p+"\t");
        }
        System.out.println();

        System.out.println("정렬 후 => ");
        Arrays.sort(points);
        for(int p : points){
            System.out.print(+p+"\t");
        }
        System.out.println();

        System.out.println("---------[binarySearch]----------------------------");
        //배열 위치 알고 싶은때
        System.out.println("80은 어디에? " + Arrays.binarySearch(points,80));
        
    }
}
