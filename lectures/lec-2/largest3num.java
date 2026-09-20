import java.util.*;

public class largest3num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int a = sc.nextInt();
        System.out.print("Enter your second number: ");
        int b = sc.nextInt();
        System.out.print("Enter your third number: ");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("largest number is: " + a);
        }
       else if(b>a && b>c){
            System.out.println("largest number is: " + b);
        }
        else{
            System.out.println("largest number is: " + c);
        }
        
    }  
}
