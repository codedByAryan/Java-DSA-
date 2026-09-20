/*Given an array of integers, change the value of all odd indexed elements to its second multiple
and increment all even indexed values by 10. */

public class Ass6 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,2,3,45,6,7};
        for(int i=0; i<arr.length; i++){
            if(i%2==0){
                arr[i] +=10;
            }
            else{
                arr[i] *=2;
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
}
