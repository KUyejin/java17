package sec1;

import java.util.ArrayList;
import java.util.List;
class Student{
    public int sno;
    public String sname;
    public int point;

    public Student(){};

    public Student(int sno, String sname, int point) {
        this.sno = sno;
        this.sname = sname;
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", sname='" + sname + '\'' +
                ", point=" + point +
                '}';
    }
}
public class ListEx3 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("백준철"); // 요수 추가
        list1.add("오세훈");
        list1.add("신승원");
        list1.add("구예진");

        System.out.println(list1); //[백준철, 오세훈, 신승원, 구예진]

        //특정 인덱스 제거
        list1.remove(1);
        System.out.println("remove: " + list1); //remove: [백준철, 신승원, 구예진]

        //모든 요소 제거
        list1.clear();
        System.out.println("clear: " + list1); //clear: []

        list1.add("오태훈");
        list1.add("김현경");
        list1.add("김보경");
        list1.add("김기태");
        System.out.println(list1);

        list1.add(1,"ㅇㅇㅇ");
        System.out.println(list1);

        //size(): 리스트의 요소수
        System.out.println("리스트의 요소 수: " + list1.size());

        //get(): 특정 인덱스의 데이터
        System.out.println("인덱스가 2인 데이터: " + list1.get(2));

        // contains(): 특정 데이터 있는 지 확인
        if(list1.contains("이기태")){
            System.out.println("이기태가 존재합니다");
        }else {
            System.out.println("존재하지 않습니다");
        }

        //isEmpty() : 현재 리스트가 빈 리스트인지 검증
        if(list1.isEmpty()){
            System.out.println("현재 리스트가 비어 있음");
        }else {
            System.out.println("현재 리스트가 사용중임");
        }


        //리스트 출력
        for(int i = 0; i<list1.size(); i++){
            System.out.println(list1.get(i));
        }
        System.out.println("-------------");
        for(String s:list1){
            System.out.println(s);
        }


        List<Student> slist = new ArrayList<>();

        System.out.println("--------------------------------");
        Student s1 = new Student();
        s1.sno = 1;
        s1.sname ="한선";
        s1.point = 90;

        Student s2 = new Student();
        s2.sno = 2;
        s2.sname ="백준철";
        s2.point = 80;

        Student s3 = new Student();
        s3.sno = 3;
        s3.sname ="이소윤";
        s3.point = 70;

        slist.add(s1);
        slist.add(s2);
        slist.add(s3);

        Student s;
        for(int i=0; i<slist.size();i++){
            s = slist.get(i);
            System.out.println("번호: " + s.sno);
            System.out.println("이름: " + s.sname);
            System.out.println("포인트: " + s.point);
        }
        System.out.println();
        for(Student i: slist){
            System.out.println("번호: " + i.sno);
            System.out.println("이름: " + i.sname);
            System.out.println("포인트: " + i.point);
        }


























    }
}
