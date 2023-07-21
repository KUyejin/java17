package sec1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Course {
    public int cno;
    public String cname;
    public int cprice;
    public double ctime;
}

public class ListEx4 {
    static List<Course> cList = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean ck = true; // 과정 작업 상태 (true:진행 / false:종료)
        int i = 0; //과정 수

        while(ck){
            System.out.println("[1.과정등록 2.과정검색 3.과정삭제 4.과정목록 6.종료] 입력>>");
            int num = sc.nextInt();

            switch (num){
                case 1:
                    i++;
                    System.out.println(" [과정 등록]\n");
                    Course c = new Course();
                    c.cno = i;
                    System.out.println("과정 이름 입력 >>");
                    c.cname = sc.next();
                    System.out.println("단가 입력 >>");
                    c.cprice = sc.nextInt();
                    System.out.println("소요시간 입력 >>");
                    c.ctime = sc.nextDouble();

                    cList.add(c);
                    break;
                case 2:
                    System.out.println(" [과정 검색]\n");
                    System.out.println("검색할 과정 번호 입력 >>");
                    int sel = sc.nextInt();
                    if(sel <= num){
                        Course c2 = cList.get(sel-1);
                        System.out.println("과정 번호 : " + c2.cno);
                        System.out.println("과정명: " + c2.cname);
                        System.out.println("과정 단가: " + c2.cprice);
                        System.out.println("소요시간: "+ c2.ctime);
                    }else {
                        System.out.println(" ** 해당 과정이 존재하지 않습니다 **");
                    }
                    break;
                case 3:
                    System.out.println(" [과정 삭제]\n");
                    System.out.println("삭제할 과정 번호 입력 >>");
                    sel = sc.nextInt();
                    if(sel < num){
                        cList.remove(sel-1);
                        System.out.println("삭제완제");
                    }else {
                        System.out.println("해당 과정이 없습니다.");
                    }
                    break;
                case 4:
                    System.out.println(" [과정 목록]\n");
                    System.out.println("과정번호\t과정이름\t수강료\t수강시간");
                    for(Course cr : cList){
                        System.out.printf("%d%s%d%f" , cr.cno,cr.cname,cr.cprice,cr.ctime );
                        System.out.println();
                    }
                    break;
                case 5:
                case 6:
                    System.out.println(" ** 작업 종료 **");
                    ck = false;
                    break;
                default:
                    System.out.println(" ** 작업 번호는 1-6 입니다");

            }














        }





    }
}
