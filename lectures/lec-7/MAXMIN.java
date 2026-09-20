// Find max and min in Array

public class MAXMIN {
    public static void Maximum_Number(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum value is: " + max);
    }

    public static void Minimum_Number(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
            
        }
        System.out.println("Minimum value is: " + min);
    }

    public static void Second_Largest_in_Array(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        int second_largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>second_largest && arr[i]!=max){
                second_largest = arr[i];
            }

        }
        System.out.println("Second largest of array is: " + second_largest);
        
    }

    public static void count_number_of_elements_greater_than_give_number(int arr[]){
        int x=4;
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>x){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
       // Maximum_Number(arr);
       // Minimum_Number(arr);
      // Second_Largest_in_Array(arr);
       count_number_of_elements_greater_than_give_number(arr);

    }
    
}
