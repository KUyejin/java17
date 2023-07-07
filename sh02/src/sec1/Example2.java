package sec1;

public class Example2 {

    public static void main(String[] args) {


        int su1 = 90;
        int su2 = 85;
        int su3 = 88;
        System.out.println("==========[관계 연산]==============");
        //관계 연산
        // ==(같다/이다/일치), !=(서로 다르다/아니다/불일치), >(왼쪽이 오른쪽보다 크다/초과/후)
        // >=(이상/이후), <(미만/전), <=(이하/이전)

        System.out.println("su1 == su2 : " + (su1 == su2)); //false
        System.out.println("su1 != su2 : " + (su1 != su2)); //true
        System.out.println("su1 > su2 : " + (su1 > su2)); //true
        System.out.println("su1 >= su2 : " + (su1 >= su2)); //true
        System.out.println("su1 < su2 : " + (su1 < su2)); //false
        System.out.println("su1 <= su2 : " + (su1 <= su2)); //false


        System.out.println("===========[논리 연산]===============");
        //논리 연산
        System.out.println("and(&&) 연산자");
        System.out.println("su1 <= su2 && su2 >= su3: " + (su1 <= su2 && su2 >= su3)); //false
        System.out.println("su1 >= su2 && su2 >= su3: " + (su1 >= su2 && su2 >= su3)); //false
        System.out.println("su1 <= su2 && su2 <= su3: " + (su1 <= su2 && su2 <= su3)); //false
        System.out.println("su1 >= su2 && su2 <= su3: " + (su1 >= su2 && su2 <= su3)); //true

        System.out.println();
        System.out.println("or(||) 연산자");
        System.out.println("su1 <= su2 || su2 >= su3: " + (su1 <= su2 || su2 >= su3)); //false
        System.out.println("su1 >= su2 || su2 >= su3: " + (su1 >= su2 || su2 >= su3)); //true
        System.out.println("su1 <= su2 || su2 <= su3: " + (su1 <= su2 || su2 <= su3)); //true
        System.out.println("su1 >= su2 || su2 <= su3: " + (su1 >= su2 || su2 <= su3)); //true

        System.out.println();
        System.out.println("not(!) 연산자");
        System.out.println("!(su1 >= su2) :" + !(su1 >= su2) ); //false
        System.out.println("!(su2 >= su3) :" + !(su2 >= su3) ); //true





























    }
}
