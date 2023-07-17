package sec2;

public class TV {

    boolean power;
    int channel;

    void power(){
        power = !power;
    }
    void channelUp(){
        ++channel;
    }
    void channelDown(){
        --channel;
    }
}

//자식
class SmartTV extends TV{
    boolean caption;


    void displayCaption(String text){
        if(caption){
            System.out.println(text);
        }
    }
}

class TvMain{
    public static void main(String[] args) {
        SmartTV stv = new SmartTV();
        stv.channelUp();;
        System.out.println(stv.channel);
        stv.displayCaption("Hello, World");
        stv.caption = true;
        stv.displayCaption("Hello,World");
    }
}
