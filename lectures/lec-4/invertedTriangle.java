import java.util.*;

public class invertedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=i; j<=n; j++){ // second method -> (n-i+1)
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        
    }
    
}
