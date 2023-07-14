package sec3;

public class Qna extends Board{

    public static final String DUMMY = "테스트글 제목";

    private int level;
    private int parno;

    public Qna(){
        super();
    } // 부모생성자 호출


    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getParno() {
        return parno;
    }

    public void setParno(int parno) {
        this.parno = parno;
    }

    @Override //Borad클래스의 method 오버라이딩
    public void method() {
        super.method();
        System.out.println("오버라이딩 test");
    }




}





