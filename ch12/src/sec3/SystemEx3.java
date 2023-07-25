package sec3;
//성능 평가 기준 
// 처리 능력(Throughput) , 반환시간(응답시간 Turn Around Time), 사용가능도(Availabilty), 신뢰도(Reliability)
public class SystemEx3 {
    public static void main(String[] args) {
//        long start = System.currentTimeMillis(); // 1000분의 1초

        long tot = 0;
        long start = System.nanoTime();

        for(int i = 0; i<1000000000;i++){
            tot += i;
        }
        long end = System.nanoTime();

        System.out.println("누적 결과 : " + tot);
        System.out.println("걸린 시간 : " + (end - start) + "ns");
    }
}
