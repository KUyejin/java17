package sec2;

//제네릭의 제한 -> <T extends 제한클래스>
//제한 클래스의 서브(이하) 클래스만 생성이 허용됨
public class MultiEx3 {
    public static void main(String[] args) {
        //오류 -> Parent는 My의 부모 클래스
        //Child<Parent> c1 = new Child<Parent>();
        
        Child<My> c2 = new Child<>();

        //오류 -> 자기 자신은 만들 수으업서음
        //Child<Child> c3 = new Child<>();

        Child<Season> c4 = new Child<>();
    }
}
