public class Reverse {
    public static void Reverse(int arr[]){
        int j = arr.length-1;
        for(int i=0; i<arr.length/2; i++){
            // swap ka code 
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;

        }
        for(int k=0; k<arr.length; k++){
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Reverse(arr);
    }
}
