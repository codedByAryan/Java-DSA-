/*give a 2*n floor and tiles of sizes 2*1 count the number of ways to tile the given board using the 2*1 tiles */

public class TillingProblem {
    public static int tilling_Problem(int n){ // 2*n (floor ka size)
        // base case
        if(n==0 || n==1){
            return 1;
        }
        // kaam
        // vertical
        int fnm1 = tilling_Problem(n-1);

        // horizontal
        int fnm2 = tilling_Problem(n-2);
        // total number of ways
        int totways = fnm1+fnm2;
        return totways;
    }
    public static void main(String[] args) {
        int n=2;
        System.out.println(tilling_Problem(n));

        
    }
    
}
