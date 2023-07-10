public class Example2 {

    public static void main(String[] args) {

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




    }
}
