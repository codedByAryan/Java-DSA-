//Write a program to copy the contents of one
//array into another in the reverse order

public class CopyArray {
    public static void Reverse_Array_using_Copy(int arr[]){
        int j = 0;
        int arrc[] = new int[arr.length];
        for(int i=arr.length-1; i>=0; i--){
            arrc[j] = arr[i];
            j++;
        }
        System.arraycopy(arrc, 0, arr, 0, arrc.length);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Reverse_Array_using_Copy(arr);
    }
}
