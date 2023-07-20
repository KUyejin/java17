package sec2;

public class Multi2<T,M> {
    private T name;
    private M age;

    public Multi2(){};

    public Multi2(T name, M age) {
        this.name = name;
        this.age = age;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public M getAge() {
        return age;
    }

    public void setAge(M age) {
        this.age = age;
    }


    public static<T,V> boolean compare(Multi2<T,V> com1, Multi2<T,V> com2){
        boolean nameCompare = com1.getName().equals(com2.getName());
        boolean ageCompare = com1.getAge().equals(com2.getAge());
        boolean pass = nameCompare && ageCompare;
        return pass;
    }
}
