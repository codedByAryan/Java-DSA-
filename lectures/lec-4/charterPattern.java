import java.util.*;
public class charterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int x = 65+n;
        
        for(int i=65; i<=x; i++){
            for(int j=65; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
    }
    
}