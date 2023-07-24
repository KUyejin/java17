package sec2;

public enum Week {

    Sunday("월요일","月"), 
    Monday("화요일","火"), 
    Tuesday("수요일","水"), 
    Wednesday("목요일","木"),
    Thursday ("금요일","金"),
    Friday("토요일","土"),
    Saturday("일요일","日");

    public String korean;
    public String chinese;

    Week(String korean, String chinese) {
        this.korean = korean;
        this.chinese = chinese;
    }
}
