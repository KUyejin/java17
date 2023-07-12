package sec1;

public class Example3_배열3 {
    //원소 추가 함수
    public static String[] add(String[] originArr, String txt) {

        //새로운 배열은 원래 배열의 데이터에서 하나 더 증가
        String[] newArr = new String[originArr.length + 1]; //5+1 = 6

        //원래 배열데이터를 새로운 배열에 복제
        for(int i = 0; i < originArr.length;i++){ // 0 1 2 3 4 5
            newArr[i] = originArr[i];
        }

        //추가되는 원소를 txt변수로 입력받아 새로운 원소로 추가
        newArr[originArr.length] = txt; // 6

        return newArr;
    }


    public static String[] remove(String[] originArr) {

        String[] newArr = new String[originArr.length -1 ]; //6-1=5

        for(int i = 0; i < originArr.length-1; i++){
            newArr[i] = originArr[i];
        }

        return newArr;
    }


    // 원소 추가 요청
    public static void main(String[] args) {
        String[] originArr = {"김기태", "박나연", "김이호", "오태훈", "서광"};
        //originArr = new String[] {"신승원", "오세훈", "신예은" , "김보경"}; // 값을 바꿀 수 있음
        //originArr[5] = "한선";
        System.out.println("-------------------------------------");
        for(String s : originArr) System.out.println(s);

        System.out.println("---------------[값 추가]----------------------");
        originArr = add(originArr, "한선"); //함수 호출할 때 원래 배열과 추가 데이터를 같이 대입
        //originArr = add(originArr, "이슬비");
        for (String s : originArr) {
            System.out.println(s);
        }

        System.out.println("----------------[값 삭제]---------------------");
        originArr = remove(originArr);
        for (String s : originArr) {
            System.out.println(s);
        }




    }

}
