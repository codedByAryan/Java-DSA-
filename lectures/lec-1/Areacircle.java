import java.util.*;
public class Areacircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        System.out.print("Enter the value of radius of circle: ");
        float r = sc.nextFloat();
        float area = 3.14f*r*r;
        System.out.println(area);
    }
    
}
