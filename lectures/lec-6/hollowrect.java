import java.util.*;

public class hollowrect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int totRows = sc.nextInt();
        int totCol = sc.nextInt();
        for(int i=1; i<=totRows; i++){
            for( int j=1; j<=totCol; j++){
                if(i == 0 || i == totRows || j == 0 || j == totCol){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
             
            }
            System.out.println();
            
        }
        
        }
    }
    

