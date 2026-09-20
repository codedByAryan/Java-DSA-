import java.util.*;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("You can vote");
            System.out.println("You can derive");
        }
        else{
            System.out.println("You cannot vote");
            System.out.println("You cannot derive");
        }


        
    }
}
