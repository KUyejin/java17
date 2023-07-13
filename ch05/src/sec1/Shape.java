package sec1;

public class Shape {

    //멤버 필드
    private String type;
    private int length;
    private double area;

    //생성자 생성 -> 클래스 이름과 같아야 한다
    public Shape() {
    }

    public Shape(String type) {
        this.type = type;
    }

    public Shape(String type, int length) {
        this.type = type;
        this.length = length;
    }

    public Shape(String type, int length, double area) {
        this.type = type;
        this.length = length;
        this.area = area;
    }


    //멤버 메서드
    public double calcArea() {

        if (this.type.equals("square")) {
            this.area = this.length * this.length;
        } else if (this.type.equals("triangle")) {
            this.area = this.length * 10 / 2;
        } else if (this.type.equals("circle")) {
            this.area = this.length * this.length * 3.14159;
        } else {
            this.area = 0.0f;
        }

        return this.area;
    }


    //setMethod(저장 메소드) -> 각 필드에 값을 저장할 목적
    public void setType(String type) {
        this.type = type;

    }


    public void setLength(int length) {
        this.length = length;

    }
}


