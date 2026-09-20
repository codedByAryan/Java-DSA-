// check if a number is prime or not
import java.util.*;
public class numprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        if(n!=1){
            for(int i=2; i<n; i++){
                if(n%i==0){
                    System.out.println(n + " is not a prime number");
                }
                else{
                    System.out.println(n + " is a prime number");
                    break;
                }
            }
            
        }
        else{
            System.out.println(n + " is a prime number");
        }
    }
    
}
