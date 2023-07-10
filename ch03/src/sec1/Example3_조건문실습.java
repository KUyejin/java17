package sec1;

import java.util.Scanner;

public class Example3_조건문실습 {
    public static void main(String[] args) {
        //키보드로 학번과 세 과목 점수를 입력받아 총점(tot), 평균(avg), 학점(hak), 판정(pan),등급(grd) 등을 출력
        // 총점(total): 전산 + PG + OA
        // 평균 : 세 과목의 점수의 총점을 3으로 나눈 실수

        // 학점
        // 96이상 A+, 93이상 A0, 90이상 A-
        // 86이상 B+, 83이상 B0, 80이상 B-
        // 76이상 C+, 73이상 C0, 70이상 C-
        // 66이상 D+, 63이상 D0, 60이상 D-
        // 나머지는 F

        // 판정: 평균이 80이상이면서, 세 과목 모두 70이상이면 "합격" , 아니면 "불합격"

        // 등급: 평균을 20으로 나눈 값으로 하되, 5이면 5등급. 4이면 4등급, 3이면 3등급, 2이면 2등급, 1이면 1등급

        // 출력형식
        // 학번  전산   PG  OA  총점  평균  학점  판정  등급
        // xxx  xxx   xxx xxx xx.xx  xx   xx   xx   x등급


        Scanner sc = new Scanner(System.in);

        int hakbun; // 학번
        int com, pg, oa; // 점수
        int tot; // 총점
        double avg; // 평균
        String hak; //학점
        String pan; //판정
        int grd = 0; // 등급


        System.out.println("학번 입력");
        hakbun = sc.nextInt();

        System.out.println("전산 점수 입력 > ");
        com = sc.nextInt();

        System.out.println("PG 점수 입력 >");
        pg = sc.nextInt();

        System.out.println("OA 점수 입력 >");
        oa = sc.nextInt();

        //총점
        tot = com + pg + oa;

        //평균
        avg = tot / 3.0;

        //학점
        if (avg >= 90) {

            if (avg >= 96) hak = "A+";
            else if (avg >= 93) hak = "A0";
            else hak = "A-";

        } else if (avg >= 80) {

            if (avg >= 86) hak = "B+";
            else if (avg >= 83) hak = "B0";
            else hak = "B-";

        } else if (avg >= 70) {

            if (avg >= 76) hak = "C+";
            else if (avg >= 73) hak = "C0";
            else hak = "C-";

        } else if (avg >= 60) {

            if (avg >= 66) hak = "D+";
            else if (avg >= 63) hak = "D0";
            else hak = "D-";

        } else {
            hak = "F";
        }

        // 판정
        if (avg >= 80 && com >= 70 && pg >= 70 && oa >= 70) pan = "합격";
        else pan = "불합격";

        // 등급
        int x = (int) avg / 20;

        switch (x) {
            case 1:
                grd = 1;
                break;
            case 2:
                grd = 2;
                break;
            case 3:
                grd = 3;
                break;
            case 4:
                grd = 4;
                break;
            case 5:
                grd = 5;
                break;
        }

        System.out.println("학번\t\t전산\t\tPG\t\tOA\t\t총점\t\t평균\t\t학점\t\t판정\t\t등급");
        System.out.println("-------------------------------------------------------------------------");
        //System.out.println(hakbun+"\t\t"+com+"\t\t"+pg+"\t\t"+oa+"\t\t"+tot+"\t\t"+avg+"\t\t"+hak+"\t\t"+pan+"\t\t"+ grd +"등급");
        //System.out.printf("%4s\t%4s\t%4s\t%4s\t%4s\t%4s\t%4s\t%4s\t%4s" , "학번","전산","PG","OA","총점","평균","학점","판정","등급" + "\n");
        System.out.printf("%4d\t%4d\t%4d\t%4d\t%4d\t%4.2f\t%4s\t%4s\t%2d등급", hakbun, com, pg, oa, tot, avg, hak, pan, grd);


        System.out.println();
        System.out.println();
        System.out.println();


    }
}
