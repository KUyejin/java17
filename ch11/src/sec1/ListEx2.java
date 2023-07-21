package sec1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListEx2 {
    public static void main(String[] args) {
        //List는 인터페이스 ->ArrayList, Vector, LinkedList 으로 다 받을 수 있음
        List list1;
        list1 = new ArrayList();
        list1 = new Vector();
        list1 = new LinkedList();

        //ArrayList list2 = new ArrayList();
        // list2 = new Vector(); -> 오류 list2 타입을 List로 해줘야함

        Vector list2 = new Vector();

        method1(list1);
        //method2(list2); -> 오류 


    }

    public static void method1(List ls){}
    public static void method2(ArrayList ls){}
}
