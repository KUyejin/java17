package sec3;

import java.util.*;

public class MapEx1 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, String> map2 = new Hashtable<>();
        Map<String, Integer> map3 = new TreeMap<>();

        //제네릭 타입으로 넣으면 안된다 , 문자로 넣어야 한다.
        Properties map4 = new Properties();

        map1.put("no", 1);
        map1.put("kor", 100);
        map1.put("eng", 70);
        map1.put("mat", 90);
        System.out.println(map1);
        System.out.println("국어점수: " + map1.get("kor"));

        //키 값 있는지 없는 지 확인할 때 사용
        if (map1.containsKey("soc")) {
            System.out.println("해당 키가 존재합니다");
        } else {
            map1.put("sco", 50);
        }

        //밸류 값 있는지 없는 지 확인할 때 사용
        if (map1.containsValue(100)) {
            System.out.println("만점 과목이 있습니다");
        } else {
            System.out.println("만점 과목이 없습니다");
        }

        //해쉬맵의 순회
        for(Map.Entry<String,Integer> entrySet : map1.entrySet()){
            System.out.println("엔트리: " + entrySet.getKey() + ":" +entrySet.getValue());
        }

        //-------------------------------------------------------------------------------

        map2.put("name", "김기태");
        map2.put("age", "29");
        map2.put("height", "173.8");
        map2.put("weight", "100.4");
        System.out.println(map2);

        if (map2.containsKey("weight")) {
            map2.remove("weight");
        } else {
            System.out.println("해당 key가 존재하지 않음");
        }
        System.out.println("remove 후:    " + map2);

        //해쉬테이블의 순회
        for(Map.Entry<String,String> entrySet2 : map2.entrySet()){
            System.out.println("엔트리: " + entrySet2.getKey() + ":" +entrySet2.getValue());
        }


        //-------------------------------------------------------------------------------

        map3.put("name", 1);
        map3.put("age", 2);
        map3.put("height", 3);
        map3.put("weight", 4);
        System.out.println(map3);

        //트리맵의 순회
        for(Map.Entry<String,Integer> entrySet3 : map3.entrySet()){
            System.out.println("엔트리: " + entrySet3.getKey() + ":" +entrySet3.getValue());
        }


        //========================================================================
        //문자로 넣어야 한다.
        map4.setProperty("키키키키키", "40000000000") ;
        map4.setProperty("margin","40px");
        map4.setProperty("width","1200px");
        map4.setProperty("height","80px");
        System.out.println("폭: " + map4.getProperty("width"));





    }
}
