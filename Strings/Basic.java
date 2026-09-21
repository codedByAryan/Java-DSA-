import java.util.*;
/* Strings -> anything we rap in the double quote ' "" ' is called strings  
      Note -> In java Strings are imutable 
      operations done on  string -> Create , Read 

      if we want to do Adding or removing the character from string we use the stringBuilder
       functions in stringBuilder -> create -> StringBuilder sb = new StringBuilder() or Adding elements using sb.append("some character") -> add the elements fro the back in the Stringbuilder
        Read(Traverse) -> for(int i=0; i<sb.length(); i++) -> sb.charAt(i);
        Update -> sb.setcharAt("index", "waht we want to update");
        Delete -> sb.delete("first index", "second index") -> it delete the elemnt from index one to index second
           sb.deletecharAt("index") -> deleting from specific index

           sb.reverse() -> it will reverse
      */
public class Basic{

    // Check if a string is palindrome or not using 2 pointer technique

    public static boolean Pallindrome(String str){

        int start = 0;
        int end = str.length() - 1;

        while(start < end) {
            if(str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;

    }

    

    
    public static void main(String args[]){
        //  Create of a String
        
      //  String str = "Aryan";

      // input string

      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the string: ");

      String str = sc.nextLine();

        System.out.println(str);

        if(Pallindrome(str) == true) {
            System.out.println("String is pallindrome");
        } else {
             System.out.println("String is Not pallindrome");
        }

        StringBuilder str2 = new StringBuilder(str);
        str2.reverse();
        System.out.println(str2.toString());

    //     System.out.println(str);
    //    System.out.println(str.charAt(0));
    //     System.out.println(str.charAt(2));

    //       char temp = str.charAt(3);
    //         System.out.println(temp);

    }
}