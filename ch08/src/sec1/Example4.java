package sec1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int su;


        try{
            System.out.println("숫자 입력");
            su = scan.nextInt();
        }catch (InputMismatchException e){
            System.out.println("문자로 입력하였음. 숫자로 입력해야함");
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("원인 불명");
            e.printStackTrace();
        }
        
        
        
        
        
        
        
        
        
        
        
    }
}
