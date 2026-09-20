// Print numbers from n to 1 [Increasing Order]

public class Increasing {
    public static void Increasing_order(int n) {
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        Increasing_order(n-1);
        System.out.print(n+" ");
        
    }
    public static void main(String[] args) {
        int n=10;
        Increasing_order(n);

    }
    
}
