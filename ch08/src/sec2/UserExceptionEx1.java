package sec2;

public class UserExceptionEx1 {
    public static void main(String[] args) {
        try {
            method1();
        }catch (RunException e){
            //e.getMessage(); //웹에서만 메시지를 볼 수 있음
            System.out.println(e.getMessage()); //콘솔창에서 보려면 sout해야함
            e.printStackTrace(); //IDE의 콘솔창에서 확인 간으
        }catch (Exception e){
            
        }
    }

    private static void method1() throws RunException {
        throw new RunException("실행");
    }
}
