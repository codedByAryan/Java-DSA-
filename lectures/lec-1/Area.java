import java.util.*;
public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        System.out.println("Enter the value of length: ");
        float l = sc.nextFloat();
        System.out.println("Enter the value of breadth: ");
        float b = sc.nextFloat();
        float Area;
        Area = l*b;
        System.out.println("Area of rectangle is: " + Area);
    }
}
