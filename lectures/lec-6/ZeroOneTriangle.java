import java.util.*;
public class ZeroOneTriangle {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number: ");
    int n = sc.nextInt();
    int a = 5;
    for(int i=1;i<=n;i++){
        if(i%2!=0){
            a=1;
        }
        else{
            a=0;
        }
        for(int j=1;j<=i;j++){
           
            System.out.print(a);

            if(a==1){
                a=0;
            }
            else{
                a=1;
            }
           
        }
        System.out.println();
    }
    }
    
}
