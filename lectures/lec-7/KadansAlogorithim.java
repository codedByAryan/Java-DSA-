// MaxSubArray sum using Kadans problem
// this is the another way for maximum subArray sum more optimized solution

// KADANS Alogrithim --> Agr sum value minus me Aa rha hai tu ushko Zero kerdo

public class KadansAlogorithim {
    public static int Kadans(int arr[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        
        for(int i=1; i<arr.length; i++){
            currsum+=arr[i];
            if(currsum<0){
                currsum=0;
            }
            if(currsum>maxsum){
                maxsum=currsum;
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println("Maximum sum: " + Kadans(arr));
    }
    
}
