import java.util.*;

public class Algorithum {

    // Pair of the Arrays
    public static void pair(int arr[],int n) {
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                System.out.print("(" + arr[i] + "," + arr[j] + ")" );
            }
                System.out.println();
        }
    }

    // SubArray
    public static void SubArray(int arr[], int n){
        for(int i=0; i<n; i++){
            int start = i;
            for(int j=0; j<n; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    // SubArray Maximum Sum using Brute force

    public static void SubArrayMaxsum(int arr[], int n){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int start = i;
            for(int j=0; j<n; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    currsum += arr[k];
                }
                if(currsum > maxsum) {
                    maxsum = currsum;
                }
                
            }
        }
        System.out.println("Maximum sum of the SubArray is: " + maxsum);
    }

    // SubArray Maximum Sum using Auxillary Array with a formula we can say suffix Array

    public static void MaxSumSuffixArray(int arr[], int n){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        // suffix Array -> in this we store the sum of every index. where every index store the sum of previous index + yourself  index

        int prefixarr[] = new int[n];
        prefixarr[0] = arr[0];
        for(int i=1; i<n; i++){
            prefixarr[i] = prefixarr[i-1] + prefixarr[i];
        }

        // formula if we have to calculate the sum between two index then we use the formula 
        // currsum = prefix[end] - prefi[start-1];

        for(int i=0; i<n; i++){
            int start = i;
            for(int j=0; j<n; j++){
                int end = j;
                currsum = (start == 0) ? prefixarr[end] : prefixarr[end] - prefixarr[start-1];
            }
            if(currsum > maxsum) {
                currsum = maxsum;
            }
        }

        System.out.println("Maximum sum of the SubArray is: " + maxsum);
    }

    /* Maxsum using the kadan's Algorithum ->  it states that when we calculate the currsum if we add a number and the overall result is negative then
          we add the zero in the currsum because negative integer make the result overall negative and that is the lesss than maxsum */

          public static void MaxsumKadan(int arr[], int n){

            int currsum = 0;
            int maxsum = Integer.MIN_VALUE;

            currsum = arr[0];

            for(int i=1; i<n; i++){
                currsum = currsum + arr[i];
                if(currsum < 0) {
                    currsum = 0;
                }
                maxsum = Math.max(maxsum, currsum);
            }

            System.out.print("Maxsum of Subarray is : " + maxsum);
            
          }





    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Array: ");

        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter element of the Array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        pair(arr, n);
        SubArray(arr, n);

    }
    
}
