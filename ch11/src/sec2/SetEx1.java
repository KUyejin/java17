package sec2;

import java.util.*;

public class SetEx1 {
    public static void main(String[] args) {
        Set set1 = new HashSet();
        set1 = new TreeSet();

        //순서유지x, 데이터중복x -> 인덱스가 없다
        Set<String> set2 = new HashSet();
        set2.add("이은영");
        set2.add("최상민");
        set2.add("김이호");
        set2.add("이슬비");
        set2.add("김이호");
        set2.add("이은명");

        System.out.println("set결과");
        Iterator it =set2.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("--------------");
        //순서유지o, 데이터중복o
        List<String> list2= new ArrayList<>();
        list2.add("이은영");
        list2.add("최상민");
        list2.add("김이호");
        list2.add("이슬비");
        list2.add("김이호");
        list2.add("이은명");

        System.out.println("리스트 결과");
        for(String d:list2){
            System.out.println(d);
        }
    }
}
