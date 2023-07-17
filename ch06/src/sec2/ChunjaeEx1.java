package sec2;

import sec1.*;



public class ChunjaeEx1 {

    public static void main(String[] args) {

        Chunjae c1 = new Chunjae();

        //오류 -> private(같은 클래스에서만)
        //c1.no;

        //오류 -> protected - 같은 패키지에 있거나 상속관계에 있을 때만
        //c1.point = 10;


        //오류 -> default 같은 패키지 에서만
        //c1.partno = 1234;


        //오류xx -> public
        c1.name= "김기태";

        System.out.println(Chunjae.PI);

        // 오류0 -> defalut 같은 패키지에 있는 클래스가 이니므로 사용 불가
        //Sehun s1 = new Sehun();


    }


}
