import java.util.*;
public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int space = (n-2);
        // 1st half
        for(int i=1; i<=n; i++){
            // stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // spaces
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            // stars
           
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
           
        }
        for(int i=n; i>=1; i--){
            // stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            // spaces
            for(int k=1; k<=2*(n-i); k++){
                System.out.print(" ");
            }

            // stars
           
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
    }
