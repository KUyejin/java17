package sec1;

//Score 클래스를 상속
public class Middle extends Score{

    private int history;

    public Middle(){ super(); };
    //Score 클래스의 Score()생성자가 생성된다.

    public Middle(int history) {
        this.history = history;
    }

    public void prtPoint(){
        System.out.println(super.getEng());
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }
}
