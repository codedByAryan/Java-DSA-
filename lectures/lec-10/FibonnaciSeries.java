// nth fibonnaci number

public class FibonnaciSeries {
    public static void main(String[] args) {
        int n = 5;
        int n1 = 0;
        System.out.print(n1+" ");
        int n2 = 1;
        System.out.print(n2+" ");
        for (int i=2; i<n; i++) {
           int n3 = n1+n2;
           System.out.print(n3+" ");
           n1 = n2;
           n2 = n3;
        }
    }
    
}
