package sec2;

//Runnable 인터페이스 구현하여 thread 생성하기
class SBRunnable implements Runnable {
    @Override
    public void run() {
        String[] str = {"오세훈", "신예은", "이은영", "서광", "신승원", "백준철"};

        try {
            Thread.sleep(1000); //처음 시작되기 까지 대기 시간
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //출석 부르기
        for (String name : str) {
            System.out.println("출석 체크: " + name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class SCRunnable implements Runnable {
    @Override
    public void run() {
        String[] str = {"1", "2", "3", "4", "5", "6"};

        try {
            Thread.sleep(500); //처음 시작되기 까지 대기 시간
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //출석 부르기
        for (String name : str) {
            System.out.println("퇴실 체크: " + name);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Run1 {
    public static void main(String[] args) {

        Runnable sbRun1; //선언부
        sbRun1 = new SBRunnable(); //생성부
        Thread t1 = new Thread(sbRun1);
        t1.start();

        Runnable scRun2;
        scRun2 = new SCRunnable();
        Thread t2 = new Thread(scRun2);
        t2.start();
    }
}
