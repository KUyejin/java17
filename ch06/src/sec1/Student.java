package sec1;

public class Student {


    private  int no;
    private String name;
    private int kor;
    private int eng;
    private int mat;

    public Student(){};

    //사용자 정의 메소드
    //1. 리턴x ,  매개변수x
    public void  method1(){
        System.out.println("메서드1");
    }

    //2. 리턴o,매개변수x
    // 접근제한자    반환 타입    메서드명([타입 매개변수]){return 해당반환타입의 데이터값}
    public int method2(){
        int a = 1004;
        return a;
    }

    //3. 리턴x, 매개변수o
    public void method3(int a){
        System.out.println("당신은 " + a);
    }

    //4. 리턴o, 매개변수o
    public int method4(int b){
        return b*b;
    }










}
