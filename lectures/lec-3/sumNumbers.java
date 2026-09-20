import java.util.*;

public class sumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number which you want to sum: ");
        int n = sc.nextInt();
        int sum = 0;
        int counter = 1;
        while(counter<=n){
            sum+=counter;
            counter++;
        }
        System.out.println("Sum of first " + n + " natural number is: " + sum);

        
    }
    
}
