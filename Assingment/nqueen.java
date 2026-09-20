import java.util.*;

public class nqueen {

public void solveNQueens(int n, int col, int[] board, ArrayList<ArrayList<Integer>> result) 
    {
        if (col == n) 
        {
            ArrayList<Integer> solution = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) 
               solution.add(board[i]);
           result.add(solution);
        }
        for (int row = 0; row < n; row++) {
            if (isSafe(row, col, board)) {
                board[col] = row;
                solveNQueens(n, col + 1, board, result);
                // Backtrack
                board[col] = -1;
            }
        }
    }
    public boolean isSafe(int row, int col, int[] board) 
    {
        for (int i = 0; i < col; i++) 
       {
            // Check column and diagonal conflicts
            if (board[i] == row || Math.abs(i - col) == Math.abs(board[i] - row)) 
                return false;
        }
        return true;
    }
    private static void printBoard(ArrayList<Integer> solution, int n){
        for(int row = 0; row < n; row++){
            int queenCol = solution.indexOf(row);
            for(int col = 0; col < n; col++){
                if (col == queenCol){
                    System.out.print("Q ");
                }else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        nqueen solver = new nqueen();
        int[] board = new int[n];
        for (int i = 0; i < n; i++) board[i] = -1;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        solver.solveNQueens (n, 0, board, result);
       if (result.isEmpty()) {
       System.out.println("No solutions found for N = " + n);
       } 
       else {
       System.out.println("Solutions for N = " + n + ":");
       int count = 1;
       for (ArrayList<Integer> solution: result) {
       System.out.println("Solution" + count++ + ":");
       printBoard(solution, n);
      System.out.println();
}
}
}
}