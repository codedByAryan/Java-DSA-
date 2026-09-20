import java.util.*;

public class BinomialCoficient {
    public static int fact(int n){
        int fact = 1;
    for(int i=1; i<=n; i++){
        fact*=i;
    }
    return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r: ");
        int r = sc.nextInt();
        int factn = fact(n);
        int factr = fact(r);
        int x = (n-r);
        int factx = fact(x);
        int result;
        result = factn/(factr*factx);
        System.out.println("Binomial coeficient of n and r is: " + result);



        
    }
    
}
