package sec5;

import java.util.ArrayList;

public class PetMain {

    public static void main(String[] args) {

        Dog choco = new Dog("초코",3,"길순");
        choco.callOwner("왈왈");

        Cat nabi = new Cat("나비",5,"연미");

        Bird blue = new Bird("파랑새",6,"슬애");

        Hamster ham = new Hamster("모찌",1,"예진");
        ham.getName();

        //다형성
        Pet p1 = new Dog("미니",7,"슬애");
        System.out.println(p1.name);

        double test = 3.14;
        int num = (int)test;

        Dog d1 = (Dog)p1;
        System.out.println(d1.toy);
        d1.bark();

        Pet p2 = new Cat("다주",8,"연미");
        Cat c1 = (Cat)p2;

        ArrayList<Pet> petlist = new ArrayList<>();
        petlist.add(choco);
    }
}
