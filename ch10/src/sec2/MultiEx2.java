package sec2;

public class MultiEx2 {
    public static void main(String[] args) {
        //Multi2 multi2 = new Multi2();

        Multi2 com1 = new Multi2<String,Integer>("student" , 20);
        Multi2 com2 = new Multi2<String,Integer>("teacher",24);
        Multi2 com3 = new Multi2<String,Integer>("teacher",24);

        boolean res = com1.compare(com1,com2);
        System.out.println("비교결과: " + res);

        boolean res2 = com2.compare(com2,com3);
        System.out.println("비교결과: " + res2);
    }
}
