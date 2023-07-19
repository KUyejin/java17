package sec1;
//싱글 스레드
public class Thread1 {
    public static void main(String[] args) {
        int[] arr= {90,60,85,70,90,80};
        String[] str = {"김기태", "이슬비","박나연","박진원","오태훈","신승원"};
        for(int i = 0; i < arr.length; i++){
            System.out.println("이름 : " + str[i] ); // 전체 single 쓰레드 6개
            
            //스레드도 예외처리 해줘야함
            try {
                Thread.sleep(1000);
                //대기시간 부여하고, 지정한 밀리초 만큼 wait이 되며, 그 시간이 지나면 자동으로 wakeup한다
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }







}
