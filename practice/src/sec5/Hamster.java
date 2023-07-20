package sec5;

class Hamster extends Pet{

    String name = "햄찌";

    public Hamster(String name, int age, String owner) {
        super(name, age, owner);
    }
    
    void getName(){
        System.out.println(this.name);
        System.out.println(super.name);
    }
    void bite(){
        System.out.println(name + "이 해바라기씨를 먹는다");
    }
}
