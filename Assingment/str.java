public class str {
    public static void main(String[] args) {
        String text = "ABABDABACDABABCABAB";
        String pat = "ABABCABAB";

        sm(text, pat);
    }

    static void sm(String text, String pat)
    {
        int n = text.length();
        int m = pat.length();
        int i=0;
        for(; i<(n-m+1); i++){
            int j = 0;
            for(; j<m; j++){
                if(text.charAt(i+j) != pat.charAt(j)){
                    break;
                }
            }
            if(j == m){
                System.out.println("String matches at index = " + i);
            }
        }
}
}