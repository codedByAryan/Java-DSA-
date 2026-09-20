

public class PrintString {
    public static void printstr(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i));
        }
        
    }
    public static void main(String[] args) {
        String str = "Aryan Chauhan";
        printstr(str);
    }
    
}
