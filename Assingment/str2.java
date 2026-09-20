

public class str2 {
    public static void main(String[] args) {
        String text = "ABABDABACDABABCABBA";
        String pat = "ABABCABAB";

        int lpsarr[] = new int[pat.length()];
        lps(pat, lpsarr);
        for(int k:lpsarr){
            System.out.println(k + " ");
        }
    }
    static void lps(String pat, int lpsarr[]){
            lpsarr[0] = 0;
            int m = pat.length();
            int len = 0; // length of the lps
            int i = 1;
            while(i<m) {
                if(pat.charAt(len) == pat.charAt(i)) { 
                    lpsarr[i] = len+1;
                    i++;
                    len++;
                }else{
                    if(len != 0){
                        len = lpsarr[len-1];
                    }else{
                        lpsarr[i] = 0;
                        i++;
                    }
                }
            }
    }
    
}
