package sec1;

public class Example5 {

    public static void main(String[] args) {

        byte a1 = 104;
        //byte a2 = -129; 오류->언더플로우(해당 표현 범위보다 작음)
        //byte a3 = 128; 오류 -> 오버플로우 (해당 표현 범위보다 큼)

        short b1 = 10000;
        // short b2 = -32769; 언더플로우
        // short b3 = 32768; 오버플로우

        int c1 = 1000000000;
        //int c2 = -2147483649; 언더플로우
        //int c3 = 2147483648; 오버플로우

        long d1 = 1000000000;
        //long d2 = -9223372036854775809L; 언더플로우
        //long d3 = 9223372036854775808L; 오버플로우

        float e1 = 100000;
        //float e2 = 1.4E-46; 언더플로우
        //float e3 = 3.4028235E39; 오버플로우

        double f1 = 0.1;
        //double f2 = 4.9E-325; 언더플로우
        //double f3 = 1.7976931348623157E309; 오버플로우

        char g1 = 65535; // 0~65535
        //char g2 = 65536; 언더플로우
        //char g3 = -1; 오버플로우


    }
}
