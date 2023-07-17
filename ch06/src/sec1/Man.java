package sec1;


// 추상화 : 실제 구현내용을 적지 않고, 상속 받는 클래스에서 구현 내용을 기술
public abstract class Man {

    private int item1;
    private String item2;

    public abstract void method1();
    public abstract int method2();
    public abstract void method3(int no);
    public abstract int method4(int no);






    //추상화 아님 - 실행할 내용 작성 해 줘야함
    public void method5(){
        System.out.println("M5");
    };
    public int method6(){
        return 100;
    };
    public void method7(int no){
        System.out.println("매개 값: " + no);
    };
    public int method8(int no){
        return no * 2;
    };
}
