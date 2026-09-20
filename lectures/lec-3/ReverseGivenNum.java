import java.util.*;

public class ReverseGivenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digit you want reverse: ");
        int digit = sc.nextInt();
        int reverse = 0;
        while(digit>0){
            int lastdigit = digit%10;
            reverse = (reverse*10) + lastdigit;
            digit/=10;
        }
        System.out.println("Your reverse digit is: " + reverse);


    }
    
}
