package sec1;

public class Example2_배열2 {

    public static void main(String[] args) {

        //배열 선언 + 생성 + 초기화 함께
        int[] a = {80,85,90,95};

        int b[] = {60,65,70,75};

        int [] c = new int[4];
        c[0] = 100;
        c[1] = 100;
        c[2] = 100;
        c[3] = 100;
        //c[4] = 100;

        int[] d; // 선언만
        d = new int[]{90,80,85,60}; // 할당과 초기화
        //d[4] = 100; //추가할 당시에는 오류가 없으나 실제 할당이 되지 못해서 출력할 수 없음

        for(int i =0; i < a.length; i++){
            System.out.println(i + "번째 데이터 : " + a[i]);
        }

        System.out.println("=======================================");
        for(int i = 0; i < b.length; i++){
            System.out.println(i + "번째 데이터 : " + b[i]);
        }

        System.out.println("=======================================");
        for(int p : c){
            System.out.println(p);
        }

        for(int p : d) System.out.println(p);


















    }
}
