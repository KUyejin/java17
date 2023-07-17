package sec2;

import sec1.Student;

public class StudentEx1 {
    public static void main(String[] args) {

        Student st1 = new Student();

        //메서드 2 ( 리턴 x, 매개변수 x)
        st1.method1();


        //메서드 2 ( 리턴 o, 매개변수 x)
        int a = st1.method2();
        System.out.println(a);
        System.out.println(st1.method2());


        //메서드 3 ( 리턴 x, 매개변수 o)
        st1.method3(1004);
        System.out.println();


        //메서드 4 ( 리턴 o, 매개변수 o)
        int b = st1.method4(1004);
        System.out.println(b);

        System.out.println(50);





    }





}
