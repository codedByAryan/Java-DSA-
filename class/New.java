import java.util.*;

public class New {
    public static void main(String[] args) {
        String str = "Hello there,     I, am   not her    ";
        int count = 0;  // initialize counter
        str = str.trim();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);  // get character at index i

            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                count++;
            }
        }

        System.out.println("Total letters: " + count);
    }
}
