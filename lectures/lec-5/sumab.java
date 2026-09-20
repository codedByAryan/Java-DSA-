import java.util.*;

public class sumab {
    public static int sum(int a,int b) {
        int sum;
        sum = a+b;
        return sum;
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result;
        result = sum(a,b);
        System.out.println(result);
    
        
    }
    
}
