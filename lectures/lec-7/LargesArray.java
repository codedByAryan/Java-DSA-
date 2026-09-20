// to find the largest number in given array
public class LargesArray {
    public static int Largest_Number_in_Array(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>largest){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1,4,5,3,5,8,9};
        int result = Largest_Number_in_Array(numbers);
        System.out.println("Largest number is " + result);
    }
    
}
