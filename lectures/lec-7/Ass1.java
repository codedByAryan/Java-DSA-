/*Calculate the product of all the elements in the given array */

public class Ass1 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int mul =1; 
        for(int i=0; i<arr.length; i++){
            mul*=arr[i];
        }
        System.out.println("Product of all the array element is: " + mul);
     
    }
    
}
