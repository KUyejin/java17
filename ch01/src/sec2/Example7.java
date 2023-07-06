package sec2;

// 형변환
public class Example7 {
    public static void main(String[] args) {

        int data1 = 1004;
        float data2 = data1;

        System.out.println("data1= " + data1); //1004
        System.out.println("data2= " + data2); //1004.0(자동형변환 int -> float)

        char data3 ='K';
        int data4 = data3;

        System.out.println("data3= " + data3); //K
        System.out.println("data4= " + data4); //107 (char -> int)

        int data5 = 2048;
        //byte data6 = data5; //오류
        byte data6 = (byte)data5;

        System.out.println("data5= " + data5); //2048
        System.out.println("data6= " + data6); // 0
    }
}
