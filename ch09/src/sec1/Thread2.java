package sec1;

class SMThread extends Thread {

    //스레드 생성함수
    //synchronized : 동기화 블록
    @Override
    public synchronized void start() {
        this.method1(); //동기화 블록에 기재된 쓰레드들은 병행 수행 된다.
        super.start();
    }

    // 스레드로 실행할 내용을 기술
    @Override
    public void run() {
        int[] arr = {90, 60, 85, 70, 90, 80};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("점수 : " + arr[i]); // 전체 single 쓰레드 6개

            //스레드도 예외처리 해줘야함
            try {
                Thread.sleep(1000);
                //대기시간 부여하고, 지정한 밀리초 만큼 wait이 되며, 그 시간이 지나면 자동으로 wakeup한다
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void method1() {
        for (int i = 0; i < 7; i++) {
            System.out.println(i);

            try {
                Thread.sleep(1000);
                //대기시간 부여하고, 지정한 밀리초 만큼 wait이 되며, 그 시간이 지나면 자동으로 wakeup한다
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}

public class Thread2 {
    public static void main(String[] args) {
        Thread th1 = new SMThread();
        th1.start(); //쓰레드 생성 후 자동 실행


    }
}
