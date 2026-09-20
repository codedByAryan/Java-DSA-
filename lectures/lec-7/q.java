import java.util.*;
public class q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int x = 35;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<35){
                System.out.println(i);
            }
        }

        
    }
    
}
