import java.util.*;

public class AreaSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        System.out.println("Enter the side of square: ");
        float side = sc.nextFloat();
        float Area = side*side;
        System.out.println("Area of square is: " + Area);
    }
}
