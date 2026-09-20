// Today we will learn about Recursion
// Print numbers from n to 1 Decreasing order
public class Recursion {
    public static void Decreasing_Order(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        Decreasing_Order(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        Decreasing_Order(n);

        
    }
    
}
