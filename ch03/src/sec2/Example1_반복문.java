package sec2;

public class Example1_반복문 {

    public static void main(String[] args) {

        //반복문
        //일부의 문장을 반복하여 처리해야 하는 경우 활용
        // 종류 : for문 , while문,
        //for(카운트 변수 선언 및 초기화; 조건; 증감식 {문장;})

        //해당 지정된 값 부터 조건이 만족하는 동안만 증가되면서 실행
        int sum = 0;
        for(int i = 0; i <= 10; i++){
            sum += i; // sum = sum + i;
        }
        // sum = 0+1+2+3+4+5+6+7+8+9+10
        System.out.println("1~10 합산 결과: " + sum); // 55

        int sum2 =0;
        for(int i = 0; i <= 100; i++){
            sum2 += i;
        }
        System.out.println("1부터 100까지의 합 : "+sum2);

        //배열
        int arr[] = {90,80,85,75,95};
        //          arr[0],arr[1],arr[2],arr[3],arr[4] => 인덱스(순번)

        int tot1 = arr[0] + arr[1] + arr[2] + arr[3] + arr[4];
        System.out.println("tot1 : " + tot1);

        int tot2 = 0;
        for(int i = 0; i < arr.length; i++){
            tot2 += arr[i];
        }
        System.out.println("tot2 : " + tot2);



        // 무한루프
//        for(;;){
//
//        }





    }
}
