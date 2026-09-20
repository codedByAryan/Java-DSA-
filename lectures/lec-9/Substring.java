public class Substring {
    public static String SubString(String str, int si, int ei){
        String Substr = "";
        for(int i=si; i<ei; i++){
            Substr+= str.charAt(i);
        }
        return Substr;
    }
    public static void main(String[] args) {
         String str  = "HelloWorld";
         int si = 0;
         int ei = 4;
         System.out.println("Substr is: " + SubString(str,si,ei));
         // Shortcut method
         System.out.println(str.substring(0,5)); // -> this is the short method to find Substring

    }
    
}
