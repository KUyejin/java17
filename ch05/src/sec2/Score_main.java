package sec2;

import sec1.Middle;
import sec1.Score;

public class Score_main {

    public static void main(String[] args) {

        Score el1 = new Score();

        el1.setNum(1001);
        el1.setName("구예진");


        el1.prtNum(3);
        el1.prtNum("김기리");
        
        System.out.println("번호: " + el1.getNum());
        System.out.println("이름: " + el1.getName());

        Middle st1 = new Middle();
        //middel 클래스에 있는   public Middle() 가 호출되고
        // public Middle() 안에 있는 super()가 호출되어
        // 그 위에 클래스인 Score클래스가 호출되며 Score()생성자가 호출된다.

        st1.getEng();





    }
}
