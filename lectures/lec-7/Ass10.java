/*Find the factorial of a large number */
import java.util.*;
public class Ass10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for factorial: ");
        int n = sc.nextInt();
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact*=i;
        }
        System.out.println("Factorial of n is: " + fact);
    }
    
}
