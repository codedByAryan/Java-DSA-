// Find the Factorial of a number n

public class Fact {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int Fact = n*fact(n-1);
        return Fact;
       
    }
    public static void main(String[] args) {
        int n=5;
       int result =  fact(n);
       System.out.print("Factorial of " + n + " is: " + result);
    }
}
