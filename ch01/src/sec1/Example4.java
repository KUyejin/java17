package sec1;

public class Example4 {

    public static void main(String[] args) {

        //각 프리미티브 변수의 최소값과 최대값 출력

        //boolean은 출력 안됨xxxx

        System.out.println(Character.MIN_VALUE + " ~ " + Character.MAX_VALUE); //  ~ ￿

        System.out.println(Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE); //-128 ~ 127

        System.out.println(Short.MIN_VALUE + " ~ " + Short.MAX_VALUE); //-32768 ~ 32767

        //자바에 Integer라는 클래스가 만들어져 있음
        System.out.println(Integer.MIN_VALUE +" ~ " + Integer.MAX_VALUE); //-2147483648 ~ 2147483647

        System.out.println(Long.MIN_VALUE + " ~ " + Long.MAX_VALUE); //-9223372036854775808 ~ 9223372036854775807

        System.out.println(Float.MIN_VALUE + " ~ " + Float.MAX_VALUE); //1.4E-45 ~ 3.4028235E38

        System.out.println(Double.MIN_VALUE + " ~ " + Double.MAX_VALUE); //4.9E-324 ~ 1.7976931348623157E308











    }
}
