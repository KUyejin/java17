package sec2;

public class Example8 {

    public static void main(String[] args) {

        //참조형 변수
        String name = "구예진";
        int age = 32;
        double wt = 72;

        // print -> 한줄로 나옴
        // \n : 개행
        System.out.println("출력문 예시1");
        System.out.print("이름 : " + name + "\n" + "나이: " + age + "\n" + "체중: " + wt);

        // \t : 4칸 뛰기
        System.out.print("\n출력문 예시2 \n");
        System.out.println("이름: " + name + "\t,나이: " + age + "\t,체중: " + wt);

        System.out.println("출력문 예시3");
        System.out.printf("이름: \"%s\",  \t나이:\'%d\',  체중:%f", name,age,wt);

        System.out.println();
        System.out.println("=========================================================");

        int num1 = 127;
        // %b: 2진수, %0: 8진수, %x: 16진수 -> 파이썬, c언어
        // 각 진수에 해당하는 숫자를 문자열로 바꾸므로 나중에 숫자로 변환하면, 그 숫자 그대로 10진수 표기
        // 연산을 하지 않도록 해야 한다.

        String bin = Integer.toBinaryString(num1); //2진수로 저장
        String oct = Integer.toOctalString(num1); //8진수로 저장
        String hex = Integer.toHexString(num1); // 16진수로 저장

        System.out.println("2진수: " + bin); //1111111
        System.out.println("8진수: " + oct); //177
        System.out.println("16진수: " + hex); //7f
        System.out.println("10진수: " + num1); //127


        String k = bin + oct + hex;
        System.out.println("더한 결과 1:" + k); //11111111777f => 문자열이 합쳐짐

        int i = Integer.parseInt(bin) + Integer.parseInt(oct); //10진수로 간주함
        System.out.println("더한 결과 2: " + i); //1111288 => 1111111 + 177 더해짐


        int b1 = 0b101111; // 2진수
        int o1 = 0746; //8진수
        int x1 = 0x4fc; //16진수

        System.out.println("b1: " + b1); // 47
        System.out.println("o1: " +o1); // 486
        System.out.println("x1: " +x1); //1276

        int j = b1 + o1 + x1;
        System.out.println("j= " + j); // 1809


















    }
}
