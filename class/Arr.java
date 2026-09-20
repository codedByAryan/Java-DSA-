import java.util.*;
public class Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int arr[] = new int[5];
        System.err.print("Enter elements of array: ");
        // input the static array from the user
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        // print the static array 
        System.err.print("your static array is: ");
        for(int i=0; i<arr.length; i++){
             System.err.println(arr[i] + " ");
        }

          ArrayList<Integer> dynarr = new ArrayList<Integer>();
          dynarr.add(1);
           dynarr.add(2);
            dynarr.add(3);
             dynarr.add(4);
              dynarr.add(5);
          System.out.print("your dynamic array is: ");
          for(Integer num: dynarr){
             System.out.print(num + " ");
          }


    }
    
}
