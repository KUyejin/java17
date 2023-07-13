package sec2;

import java.util.Arrays;

public class Example4_String함수 {

    public static void main(String[] args) {

        //startsWith
        //endsWith



        //charAt() -> 특정 인덱스의 있는 문자가져옴
        String code = "801225-1278000";
        char m = code.charAt(7);

        String gender = (m == '1') || (m == '3') ? "남" : "여";

        //특정 번째(begin index)부터 특정번째(end index) 특정 번째 전까지 추출
        String yy = code.substring(0, 2); //생년
        String mm = code.substring(2, 4); //월
        String dd = code.substring(4, 6); //일

        System.out.println("성별 코드 : " + m);
        System.out.println("성별 : " + gender);
        System.out.println("생년월일: " + yy + "-" + mm + "-" + dd);


        //==============================================
        //indexOf : 해당 문자의 인덱스 반환
        // lastIndexOf : 해당 문자의 인덱스 반환
        String nick = "kimkitea";
        int idx = nick.indexOf('g'); //해당 문자의 인덱스 반환
        System.out.println("g의 문자 인덱스 값: " + idx); //해당 문자가 없으므로 -1
        int idx2 = nick.indexOf('i'); //해당 문자의 첫번째 인덱스 반환
        System.out.println("i의 문자 인덱스 값: " + idx2);  // 
        int idx3 = nick.lastIndexOf('i'); //해당 문자의 인덱스 반환
        System.out.println("i의 문자 마지막 인덱스 값: " + idx3); //4
        

        //======================================================
        // concat: 문자열 결합
        String name1 = nick + " imparial";
        String name2 = nick.concat(" imperial");
        System.out.println(name1);
        System.out.println(name2);


        //=====================================================
        //char[] nArr = nick.getBytes(); 문자배열 k i m k i t a e 분리됨
        // toCharArray() : 문자열 ->문자 배열
        // getBytes() : 문자열 -> 바이트 배열
        char[] nArr = nick.toCharArray();
        byte[] bArr = nick.getBytes();
        System.out.println("@ 2번째 : " + nArr[2]); //m
        System.out.printf("# 2번째 : %s", nArr[2] + "\n"); // 109 -> m의 아스키 코드값

        int age = 43;
        float ht = 173.8f;
        boolean ps = true;

        // =========== valueof -> 변환 ===================
        String vail = String.valueOf(age); //정수를 문자열로 변환
        String val2 = String.valueOf(ht); // 실수 -> 문자열
        String val3 = String.valueOf(ps); // 불리언 -> 문자열

        if (vail.equals("43")) System.out.println("문자열 변환 성공");

        System.out.println(vail);
        System.out.println(val2);
        System.out.println(val3);


        //================================================================
        //nick.toUpperCase() - 대문자로 변환
        //nick.toLowerCase() - 소문자로 변환
        System.out.println("대문자로 변환: " + nick.toUpperCase());
        System.out.println("소문자로 변환: " + nick.toLowerCase());


        //=========replace(찾는 문자, 바꿀문자): 대문자 or 소문자 변환 ====================
        String nick2 = nick.replace('k', 'g');
        System.out.println("바꿘 값 : " + nick2);

        String a = "I have a book";
        System.out.println(a.replace('I','Y'));



        //======== split -> 문자열 배열을 특정 구분자로 요소 분리 ===================
        String chunjae1 = "오세훈/오태훈/이은영/서광/이소윤/신예은";
        String chunjae2 = "백준철-신승원/구예진-한선/박진관-박나연";

        String[] stArr = chunjae1.split("/");
        String[] stArr2 = chunjae2.split("|"); // | -> 연산자기 때문에 구분자로 사용할 수 없음
        String[] stArr3 = chunjae2.split("/|-");

        System.out.println(stArr.toString()); // 주소값
        System.out.println(Arrays.toString(stArr));
        System.out.println(stArr2.toString()); //주소값
        System.out.println(Arrays.toString(stArr2));
        System.out.println(Arrays.toString(stArr3));



        // =========== trim : 공백 제거 ===================
        String data1 = "            kim            ";
        String data2 = "tae                ";
        String data3 = "             gi";
        System.out.println("글자 수: " + data1.length());
        System.out.println("글자 수: " + data2.length());
        System.out.println("글자 수: " + data3.length());


        String trans1 = data1.trim();
        String trans2 = data1.trim();
        String trans3 = data1.trim();
        System.out.println("글자 수: " + trans1.length());
        System.out.println("글자 수: " + trans2.length());
        System.out.println("글자 수: " + trans3.length());










    }

}
