// print nth fibbonaci number

public class nthFibonnaci {
    public static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        int Fibo = fibo(n-1) + fibo(n-2);
        return Fibo;
    }
    public static void main(String[] args) {
        int n = 25;
        int result = fibo(n);
        System.out.println(result);
        
    }
    
}
