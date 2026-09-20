/*WAP to find the largest three elements in the array. */

public class Ass3 {
    public static void main(String[] args) {
        int arr[] = {1,2,4,2,1,5,6,7,8,3};
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(max1<arr[i]){
                max1=arr[i];
            }
        }
            for(int i=0; i<arr.length; i++){
            if(arr[i]>max2 && arr[i]!=max1 ){
                    max2 = arr[i];
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max3 && arr[i]!=max1 && arr[i]!=max2){
                max3 = arr[i];
            }
        }
        
        System.out.println(max1);
        System.out.println(max2);
        System.out.println(max3);
    }

    }
    

