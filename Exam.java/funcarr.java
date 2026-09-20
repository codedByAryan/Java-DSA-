public class funcarr {
    public static void Sum(int arr[]){
        arr[5] = 100;
        
    }
    public static void main(String[] args) {
       int arr[] = {1,2,3,4,5};
        Sum(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    

}
