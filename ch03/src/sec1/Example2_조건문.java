package sec1;

public class Example2_조건문 {

    public static void main(String[] args) {

        //조건문

        int js1 = 85, js2 = 90, js3 = 95;
        float py = (js1 + js2 + js3) / 3.0f;

        System.out.println("평균: " + py);

        //평균이 80점 이상이면, 합격, 아니면 탈락
        if (py >= 80) {
            System.out.println("합격");
        } else {
            System.out.println("탈락");
        }

        //
        if (js1 >= 80 && js2 >= 80 && js3 >= 80) System.out.println("장학생 대상");
        else System.out.println("장학생 대상자 아님");

        //
        if (js1 >= 90 || js2 >= 90 || js3 >= 90) System.out.println("과목 우수자");
        else System.out.println("과목 우수자 아님");
        
        if(py >= 90){
            System.out.println("수");
        } else if (py >= 80) {
            System.out.println("우");
        } else if (py >= 70) {
            System.out.println("미");
        } else if (py >= 60) {
            System.out.println("양");
        }else {
            System.out.println("가");
        }

        if(py >= 90) System.out.println("A");
        if(py < 90 && py >=80) System.out.println("B");
        if(py < 80 && py >=70) System.out.println("C");
        if(py < 70 && py >=60) System.out.println("D");
        if(py < 60 ) System.out.println("제적");

        int pt = (int)py / 10;
        String grade ="";


        //============================================================================================
        //swich문

        switch (pt){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                grade = "5등급";
                break;
            case 6:
                grade = "4등급";
                break;
            case 7:
                grade= "3등급";
                break;
            case 8:
                grade = "2등급";
                break;
            case 9:
                grade = "1등급";
                break;
            default:
                grade = "판정 불가";
        }

        System.out.println(grade);




        


















    }
}
