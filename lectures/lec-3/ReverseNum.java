import java.util.*;
// this is print the number 
public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        while (n>0) {
          int  r = n%10;
          System.out.print(r+" ");
        
            n = n/10;
        }

            }
    
}
