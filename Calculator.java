import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        System.out.println("IF you want Subtract two numbers then press 1");
        System.out.println("IF you want  Addtion of two numbers then press 2");
        System.out.println("IF you wantt Divide of two numbers then press 3");
        System.out.println("IF you want Modulo of two numbers then press 4");
        int button=sc.nextInt();
       
         // A simple calculator using java programming for multipliction divide and addition subtraction and aonther things 

        switch(button){
            case 1:System.out.print(a-b);
            break;
            case 2:System.out.print(a+b);
            break;
            case 3:System.out.print(a/b);
            break;
            case 4:System.out.print(a%b);
            break;
            default:System.err.println("Incalid");
        }
    }
}
