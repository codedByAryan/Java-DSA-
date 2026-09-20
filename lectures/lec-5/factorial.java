import java.util.*;
public class factorial {
    public static int fact(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the umber: ");
        int n = sc.nextInt();
        int result = fact(n);
        System.out.println(result);
    }
    
}
