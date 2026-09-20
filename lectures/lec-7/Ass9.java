/*Count the number of triplets whose sum is equal to the given value x */
import java.util.*;
public class Ass9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5};
        System.out.print("Enter the triplet sum: ");
        int x = sc.nextInt();
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                for(int k=0; k<arr.length; k++){
                    if(arr[i]+arr[j]+arr[k] == x){
                        System.out.println("(" + arr[i] + "," + arr[j] + "," + arr[k] + ")");
                        break;
                    }
                }
            }
        }
    }
    
}
