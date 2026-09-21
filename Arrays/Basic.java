import java.util.*;
/* Arrays -> Arrays is a type of Data Structure. In which we store the elements with the same datatype
             in this elements store in a continue memory allocation */


public class Basic {

    // Maximum element of the Array

    public static void Maximum(int arr[]){

        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum of the array is: " + max);
    }

    public static void minimum(int arr[]) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Minimum of the array is: " + min);
    }

    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print("Array -> " + arr[i] + " ");
        }
    }

    public static void reverse(int arr[]){
        int start = 0;
        int end  = arr.length-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        print(arr);
    }

    // linear search

    public static void search(int arr[], int key){

        for(int i=0; i<arr.length; i++){
            if(key == arr[i]){
                System.out.println("Key found at index" + i);
                break;
            }
        }
    }

    // binary search

    public static int BinarySearch(int arr[], int key){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(key > arr[mid]){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        // Create the Array
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input the array

        System.out.print("Enter the elements of the array: ");

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        // Output of the Array
        System.out.print("Array -> ");
        for (int ele: arr) {
            System.out.print(ele + " ");
        }

        Maximum(arr);
        minimum(arr);
        reverse(arr);

        System.out.print("Enter the key: ");
        int key = sc.nextInt();

        Arrays.sort(arr);
        
        search(arr, key);

        int result = BinarySearch(arr, key);
        if(result != -1){
            System.out.println("Key found at index: " + result);
        } else {
            System.out.println("Key not found");
        }

    }
}