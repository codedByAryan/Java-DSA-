
public class Linear {
    public static int LinearSearch(int numbers[], int key){
    for(int i=0; i<numbers.length; i++){
        if(numbers[i]==key){
            return i;
        }
    }
    
     return -1;
    
}
    public static void main(String[] args) {
        int numbers[] = {1,3,2,4,5,6,7,8,9,12};
        int key = 68;
        int result = LinearSearch(numbers,key);
        System.out.println("Key at index " + result);
    }
    
}
