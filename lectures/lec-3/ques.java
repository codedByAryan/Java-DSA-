// keep entering numbers till user enters a multiple of 10
import java.util.*;
public class ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) { 
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if(num%10==0){
                break;
            }
            else{
                System.out.println(num);
            }
        }
        System.out.println("outside the loop");
    }

    }

