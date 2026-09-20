// find the first occurence of an elemnt in an array
public class firstOccurence {
    public static int First_Occurence(int arr[], int key, int i){
        if(i>arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return First_Occurence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,10,2,5,3};
        int key = 3;
        System.out.print(First_Occurence(arr, key, 0));
    }
    
}
