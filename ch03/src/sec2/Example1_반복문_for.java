package sec2;

public class Example1_반복문_for {

    public static void main(String[] args) {

        //반복문
        //일부의 문장을 반복하여 처리해야 하는 경우 활용
        // 종류 : for문 , while문,
        //for(카운트 변수 선언 및 초기화; 조건; 증감식 {문장;})
        // 무한루프
//        for(;;){
//
//        }

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

        //배열 for문--------------------------------------------
        int arr[] = {90,80,85,75,95};
        //          arr[0],arr[1],arr[2],arr[3],arr[4] => 인덱스(순번)

        int tot1 = arr[0] + arr[1] + arr[2] + arr[3] + arr[4];
        System.out.println("tot1 : " + tot1);

        int tot2 = 0;
        for(int i = 0; i < arr.length; i++){
            tot2 += arr[i];
        }
        System.out.println("tot2 : " + tot2);

        //---------------------------------------------------



        System.out.println();
        System.out.println("방법 1 ------");
        int hap = 0;
        for(int a =1; a <=100; a+=2){
            hap += a;
        }
        System.out.println("홀수의 합: " + hap);

        System.out.println();
        System.out.println("방법 1 ------");
        int b =1;
        hap = 0;
        for(;;){
            hap += b;
            b += 2;
            if(b<=100)break;
        }
        System.out.println("홀수의 합2:" + hap);



        System.out.println();
        System.out.println("방법 1 ------");
        hap = 0;
        for(int c =1; c <=100; c++){
            if(c%2==1){
                hap +=c;
            }else{
                continue;
            }
        }
        System.out.println("홀수의 합3:" + hap);


        //----------
        int num = 12345, sum4 = 0;

        System.out.println(num%10);

        for(num = 12345; num > 0;  num = num/10){
            System.out.println(num % 10);
            sum4 += num % 10;
        }
        System.out.println("각 자리수의 합: " + sum4);










    }
}
