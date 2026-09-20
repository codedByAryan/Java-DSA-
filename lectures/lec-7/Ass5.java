public class Ass5 {
    public static void main(String[] args) {
        int sume=0;
        int sumo=0;
        int arr[] = {1,2,3,4,5,6,7,8,9};
        for(int i=0; i<arr.length; i++){
            if(i%2==0){
                sume+=arr[i];
            }
            else{
                sumo+=arr[i];
            }
        }
        int diff = sumo-sume;
        System.out.println("Difference between odd and even indices is: " + diff);
    }
    
}
