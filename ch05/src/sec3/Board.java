package sec3;

public class Board {

    private int no; // 글번호
    private String title; //제목
    private String content; //내용
    private String resDate; //작성날짜
    private int viewcnt; // 읽은 횟수


    public Board() { }

    public Board(int no) {
        this.no = no;
    }

    public Board(int no, String title) {
        this.no = no;
        this.title = title;
    }

    public Board(int no, String title, String content) {
        this.no = no;
        this.title = title;
        this.content = content;
    }

    public Board(int no, String title, String content, String resDate) {
        this.no = no;
        this.title = title;
        this.content = content;
        this.resDate = resDate;
    }

    public Board(int no, String title, String content, String resDate, int viewcnt) {
        this.no = no;
        this.title = title;
        this.content = content;
        this.resDate = resDate;
        this.viewcnt = viewcnt;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getResDate() {
        return resDate;
    }

    public void setResDate(String resDate) {
        this.resDate = resDate;
    }

    public int getViewcnt() {
        return viewcnt;
    }

    public void setViewcnt(int viewcnt) {
        this.viewcnt = viewcnt;
    }

    public void method(){

        System.out.println("여기는 Board1 입니다");
    }

    public static void method2(){
        System.out.println("여기는 Boared2 입니다");
    } //static 공유데이터다

    public final static void method3() {

        System.out.println("여기는 Board2입니다");
    } //상속x, 오버라이딩x
}
