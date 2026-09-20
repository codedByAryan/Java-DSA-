// Binary Search 

public class Binary {

    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int key = 3;
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
          int  mid = (start+end)/2;
            if(arr[mid]==key){
                System.out.println("key at index: " + arr[mid]);
            }
            if(arr[mid]<key){
                start = mid+1;
            }
            else{
                end=mid-1;
            }
            
        }
    }
    
}
