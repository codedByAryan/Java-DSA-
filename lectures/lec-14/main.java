import java.util.*;
public class main{
    public static int LinearSearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int numbers []={10,20,30,10,40,50,60};
        int key=10;
        int index = LinearSearch(numbers,key);
        if(index==-1){
            System.out.println("element not found");
        }
        else{
            System.out.println("element found at" + index);
        }
    }
}