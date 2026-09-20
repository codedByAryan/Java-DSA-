/*Find the doublet in the Array whose sum is
equal to the given value x. */
public class Doublet {
   public static void main(String[] args) {
       int arr[] = {2,4,5,7,3,8,3,1};
       int x = 5;
       for(int i=0; i<arr.length; i++){
        for(int j=i+1; j<arr.length; j++){
            if(arr[i] + arr[j] == x){
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
            }
        }
        System.out.println();
       }
   }
    
}
