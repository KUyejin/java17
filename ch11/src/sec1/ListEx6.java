package sec1;

import java.util.LinkedList;
import java.util.List;

public class ListEx6 {
    public static void main(String[] args) {
        List<Student> s = new LinkedList<>();

        s.add(new Student(1,"이름1",100));
        s.add(new Student(2,"이름2",200));
        s.add(new Student(3,"이름3",300));
        s.add(new Student(4,"이름4",400));
        s.add(new Student(5,"이름5",500));

        for(int i = 0; i<s.size();i++){
            Student a = s.get(i);
            //System.out.println(a.toString());
            System.out.println(a.sno+"\t"+a.sname+"\t"+a.point);
        }


    }
}
