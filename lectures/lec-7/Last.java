// Find the last accurence of th array
import java.util.*;

public class Last {
    public static int Last_Ocuurence(int arr[], int x){
        int index = 0;
        for(int i=arr.length-1; i>=0; i--){
            if(x==arr[i]){
                index = i;
                break;
            }

        }
        return index;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the key: ");
        int x = sc.nextInt();
        int arr[] = {1,2,3,4,5,6,1,2,4,5,6,8,2,1,5};
        int result = Last_Ocuurence(arr, x);
        System.out.println("key persent last occurence at index: " + result);
        


    }
    
}
