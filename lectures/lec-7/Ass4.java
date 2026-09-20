/*Check if the given array is sorted or not */

public class Ass4 {
    public static void Check_Sorted_Array(int arr[]){
        boolean flag = true;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i+1]>arr[i]){
                flag=true;
            }
            else{
                flag = false;
            }
        }
        if(flag==true){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,3};
        boolean flag = true;
        Check_Sorted_Array(arr);
    }
    
}
