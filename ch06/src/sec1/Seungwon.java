package sec1;

//상속
public class Seungwon extends Chunjae{
    @Override
    public void setValue(int no) {
        super.setValue(no + 100);
    }
}
