// maximum subarray sum using the prefix array
// this is the optimize solution of Maximum subArray Sum

public class prefix {
    public static int Sum(int arr[]){
        int currsum=0;
        int max_sum=Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        // making prefix array
        prefix[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=0; j<arr.length; j++){
                int end = j;
                currsum= start==0? prefix[end]:prefix[end]-prefix[start-1];
                if(currsum>max_sum){
                    max_sum=currsum;
                }
            }
        }
        return max_sum;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,5,8,2};
        System.out.println("Maximum subarray sum is: " + Sum(arr));
    }
    
}
