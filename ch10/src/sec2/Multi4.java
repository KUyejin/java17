package sec2;

import java.util.List;
public class Multi4 {
    // 와일드 카드
    public void method1(List<?> lst){
        for(Object obj : lst){
            System.out.println(obj + "\t");
        }
    }

    //목록의 합계
    public int method2(List<? extends Number> lst){
        int hap = 0;
        for(Number i : lst){
            hap +=i.doubleValue();

        }
        return hap;
    }

    //목록 추가 Integer의 위의 클래스만 사용 가능
    public List<? super Integer> method3(List<? super Integer> lst){
        for(int i = 0; i < 5; i++){
            lst.add(i);
        }
        return lst;
    }

}
