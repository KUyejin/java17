package sec1;
// java.lang 패키지
public class ApiEx1_lang {
    public static void main(String[] args) {

        int a = 1004; //primitive Type
        Integer b = 1004; //Wrapper Type

        int a1 = b; //언박싱(UnBoxing) : Wrapper -> primitive
        Integer b1 = a; //박싱(Boxing) : primitive -> Wrapper

        String val1 = "1004";
        boolean res = isInteger(val1);
        System.out.println("변환 가능한 숫자인지 판단: " + res);
        if (res) {
            int val2 = Integer.parseInt(val1);
            System.out.println("결과 값: " + val2);
        }

        String val3 = "356.24781";
        res = isDouble(val3);
        System.out.println("변환 가능한 숫자인지 판단: " + res);
        if (res) {
            double val4 = Double.parseDouble(val3);
            System.out.println("결과값: " + val4);
        }

    }

    public static boolean isInteger(String val1) {
        try {
            Integer.parseInt(val1);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public static boolean isDouble(String val1) {
        try {
            Double.parseDouble(val1);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


}
