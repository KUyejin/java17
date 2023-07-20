package sec5;

public class Pet {

    String name;
    int age;
    String owner;

    Pet(){
        System.out.println("Pet() 호출했음");
    }

    public Pet(String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    void eat(String food){
        System.out.println(name +"이가"+food+"를 먹는다");
    }
    void like(String act){
        System.out.println(name + "이가" + act + "를 좋아한다");
    }
    void callOwner(String sound){
        System.out.println(name + "이가" + sound+ "로 "+ owner + "를 부른다");
    }
}
