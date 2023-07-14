package sec3;

public class Main {
    public static void main(String[] args) {
        Member mem1 = new Member();
        System.out.println(mem1.getId());

        Qna q1 = new Qna();
        q1.setTitle(q1.DUMMY);
        System.out.println(q1.getTitle() + 1);


        Qna q2 = new Qna();
        q2.setTitle(Qna.DUMMY);
        System.out.println(q2.getTitle() + 1);

        q2.method();






    }
}
