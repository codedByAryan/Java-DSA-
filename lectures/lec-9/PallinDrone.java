// Check if a String is a pallindrone

public class PallinDrone {
    public static void main(String[] args) {
        String str = "racecar";
        for(int i=0; i<str.length()/2; i++){
            int n=str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                  // not a pallindrone
                System.out.println("String Not a Pallindrone");
            }
        }
        
            System.out.println("String pallindrone");
        
    }
    
}
