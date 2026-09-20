// Make function of Linear search

import java.util.*;
public class LineaSearch {
    public static int Linear_Search(int arr[], int key){
        for( int i=0; i<arr.length; i++){
            if(key==arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int arr[] = new int[5];
        System.out.print("Enter the array: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int key = 3;
        System.out.println("Key at index: " + Linear_Search(arr, key));

    }
    
}
