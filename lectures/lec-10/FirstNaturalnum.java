// print the sum of fist n natural number

public class FirstNaturalnum {
    public static int Sum(int n){
        if(n==1){
            return 1;
        }
        int sum = n+Sum(n-1);
        return sum;
    }
    public static void main(String[] args) {
        int n=10;
        int result = Sum(n);
        System.out.print("Sum of first " + n + " natural number is: " + result);
    }
    
}
