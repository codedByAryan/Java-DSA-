import java.util.*;

public class Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        System.out.print("Enter first number: ");
        float a = sc.nextFloat();
        System.out.print("Enter second number: ");
        float b = sc.nextFloat();
        System.out.println("Enter third number: ");
        float c = sc.nextFloat();
        float Avg;
        Avg = (a+b+c)/3;
        System.out.println("Average of three numbers is: " + Avg);
    }
}
