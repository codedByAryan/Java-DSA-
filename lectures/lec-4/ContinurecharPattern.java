import java.util.*;
public class ContinurecharPattern {
   

    public static void main(String[] args) {       

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int x=65;
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print((char)x + " ");
                x++;

            }
            System.out.println();
        }
        
    }
        
}


    