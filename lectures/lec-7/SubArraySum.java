public class SubArraySum {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length; i++){
            int start = i;
            for(int j=i; j<arr.length; j++){
                int end = j;
                currsum = 0;
                for(int k=i; k<j; k++){
                    // subArray ka sum
                    currsum+=arr[k];
                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.println("Maximum sum is: " + maxsum);

    }
    
}
