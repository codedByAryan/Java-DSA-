import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the operation that you want perform: ");
        String operation = sc.nextLine();
        System.out.print("Enter first number: ");
        float a = sc.nextFloat();
        System.out.print("Enter second number: ");
        float b = sc.nextFloat();
        switch(operation){
            case "+":
            System.out.print(a+b);
            break;
            case "/":
            System.out.print(a/b);
            break;
            case "*":
            System.out.print(a*b);
            break;
            case "-":
            System.out.print(a-b);
            break;
            default:
            System.out.println("Enter correct operation");
        }
    }
    
}

