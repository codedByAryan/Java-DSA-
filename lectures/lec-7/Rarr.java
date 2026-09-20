// Array input and output
import java.util.*;
public class Rarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arr: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();

        }

        // output the Array
        for(int j=0; j<arr.length; j++){
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        
    }
    
}
