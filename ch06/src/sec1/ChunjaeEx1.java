package sec1;


public class ChunjaeEx1 {

    public static void main(String[] args) {

        Chunjae c1 = new Chunjae();

        //오류oo -> private(같은 클래스에서만)
        //c1.no;

        //오류xx -> protected - 같은 패키지에 있거나 상속관계에 있을 때만
        c1.point = 10;


        //오류 -> default 같은 패키지 에서만
        //c1.partno = 200;


        // 오류xx -> public
        c1.name = "김기태";

        System.out.println(Chunjae.PI);

        Sehun s1 = new Sehun();
        Chanwon ch1 = new Chanwon();

        int[] k = new int[100];
        Sehun[] s = new Sehun[10]; // 객체 배열
        //s[0].num ~ s[9].num

//       초기화를 먼저 해줘야 아래 코드를 사용할 수 있다.
//        s[0].setNum(1);
//        s[1].setNum(2);
//        s[0].setData("세훈1");
//        s[1].setData("세훈2");


        for (int i = 0; i < s.length; i++) {
            s[i] = new Sehun(); // 초기화!!!객체의 배열은 원소를 재생성해야함
            s[i].setNum(i + 1);
            s[i].setData("세훈 " + i + 1);

        }

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].getNum());
            System.out.println(s[i].getData());
            System.out.println("------------------------");
        }


    }


}
