package sec1;


public class Score {
    // 전연 변수
    private int num; //학생번호
    private  String name; //학생이름
    private  int kor; //국어
    private  int eng; // 영어
    private int mat; //수학

    // 기본 생성자
    public Score(){};


    public Score(int num) {
        this.num = num;
    }

    // 오버로딩
    public Score(int num, String name) {
        this.num = num;
        this.name = name;
    }

    // 오버로딩
    public Score(int num, String name, int kor) {
        this.num = num;
        this.name = name;
        this.kor = kor;
    }

    // 오버로딩
    public Score(int num, String name, int kor, int eng) {
        this.num = num;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
    }

    // 오버로딩
    public Score(int num, String name, int kor, int eng, int mat) {
        this.num = num;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    public void prtNum(int num){ //scope(유효범위)
        this.setNum(1004);
        System.out.println("학번: " + num);
    }

    public void prtNum(String name){

        System.out.println("이름: " + name);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }
}
