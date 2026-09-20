
public class insertionSort {
    public static void main(String[] args) {
        int arr[] = {5,4,3,1,2};
        for(int i=1; i<arr.length; i++){
            int curr = i;
            int prev = i-1;
            while(prev>=0 && arr[prev]>arr[curr]){
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev+1] = arr[curr];
        }
        for(int k=0; k<arr.length; k++){
            System.out.print(arr[k] + " ");
        }
        System.out.println();
        
    }
  
    
}
