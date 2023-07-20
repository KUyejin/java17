package sec5;

class Bird extends Pet{

    public Bird(String name, int age, String owner) {
        super(name, age, owner);
    }
    void fly(){
        System.out.println(name + "이가 하늘을 난다");
    }
}
