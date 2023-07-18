package sec1;
//예외처리
public class Example1 {
    public static void main(String[] args) {

        int no1 = 100;
        int no2 = 0;
        int res = 0;

        String num = "1003구예진";
        int parNum;

//        if(no1 != 0 && no2 !=0){
//            res = no1 / no2;
//        } else {
//            System.out.println("둘 중의 하나의 수가 0입니다");
//        }

        try{ //예외 처리 대책이 필요한 문장을 try구절로 묶는다
            //res = no1 / no2;
            parNum = Integer.parseInt(num);
        }catch (ArithmeticException e){
            //예외 사항이 발생하였을 경우 실행할 문장을 catch
            //세개중에 하나 선택하면 됨

            System.out.println("no2가 0으로 나누려고 시도하였음");
            //no2가 0으로 나누려고 시도하였음

            System.out.println(e.getMessage());
            // by zero

            e.printStackTrace();
            //java.lang.ArithmeticException: / by zero
            //	at sec1.Example1.main(Example1.java:17)
        } catch(Exception e){ // 모든 예외 다 받을 수 있음
            e.printStackTrace();
        }finally {
            System.out.println("연결 종료");
            System.out.println("닫기");
        }
        System.out.println("출력 완료");


//        String b;
//        int c = 500 / 0;
//        int[] arr = new int[100];



    }
}
