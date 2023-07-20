package sec5;

class Cat extends Pet{

    String house ="캣타워";

    public Cat(String name, int age, String owner) {
        super(name, age, owner);
    }

    void climb(){
        System.out.println(name + "이 나무에 오른다.");
    }
}
