package sec5;

class Dog extends Pet {
    String toy ="뼈다구";

    public Dog(String name, int age, String owner) {
        super(name, age, owner); // 부모 생성자 호출
    }

    void bark(){
        System.out.println("멍멍");
    }


}
