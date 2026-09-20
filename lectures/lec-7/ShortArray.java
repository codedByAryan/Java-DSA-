public class ShortArray {
    public static void S(int arr[]){
        int noo = 0;
        int noz = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                noz++;
            }
            else{
                noo++;
            }

            // filling elements
            for(int j=0; j<arr.length; j++){
                if(j<noz){
                    arr[i] = 0;
                }
                else{
                    arr[i] = 1;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,0,1,0,1,0,1,1,0,0};
        S(arr);

    }
    
}
