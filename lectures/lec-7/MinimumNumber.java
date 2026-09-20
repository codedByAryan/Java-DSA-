// to fin the smallest number in Array

public class MinimumNumber{
    public static int Minimum_Number_in_Array(int number[]){
    int smaller = Integer.MAX_VALUE;
    for(int i=0; i<number.length; i++){
        if(number[i]<smaller){
            smaller = number[i];

        }
    }
    return smaller;
}
    public static void main(String[] args) {
        int number[] = {1,2,3,4,56,0,56};
        int result =  Minimum_Number_in_Array(number);
        System.out.println("Smaller number in Array is " + result);
    }
    
}
