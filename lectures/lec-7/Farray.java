// Array as argument in function
import java.util.*;
public class Farray {
    // Function for input array
    public static void update(int marks[]){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<marks.length; i++){
            marks[i] += 1;
        }

    }
    public static void main(String[] args) {
        int marks[] = {97, 98, 99};
        update(marks);

        // print our marks
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();

       }
    
}
