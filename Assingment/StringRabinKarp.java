// public class string {
//     public static void main(String[] args) {
//         String text = "abababababababaaa";
//         String pat = "babaa";
//         rabinkarp(text, pat);
        
//     }

//     public static void rabinkarp(String text, String pat){
//         int t1 = text.length();
//         int p1 = pat.length();

//         int i=0, j=0;
//         int q=101;

//         long ts = 0;
//         long ps = 0;
//         int d = 256;

//         for( j=0; j<p1; j++){
//             ts = (ts*d + text.charAt(j)) % q;
//             ps = (ps*d + pat.charAt(j)) % q;
//             System.out.println("ts = " + ts);
//             System.out.println("ps = "  + ps);
//         }

//     }
// }

public class StringRabinKarp {
    public static void main(String[] args) {
        String text = "abababababababaaa";
        String pat = "babaa";
        rabinkarp(text, pat);
    }

    public static void rabinkarp(String text, String pat){
        int t1 = text.length();
        int p1 = pat.length();

        int i=0, j=0;
        int q=101;

        long ts = 0;
        long ps = 0;
        int d = 256;

        for( j=0; j<p1; j++){
            ts = (ts*d + text.charAt(j)) % q;
            ps = (ps*d + pat.charAt(j)) % q;
            System.out.println("ts = " + ts);
            System.out.println("ps = "  + ps);
        }

        long h = 1;
        for(j=0; j<p1-1; j++){
            h=(h*d) % q;
        }

        for(i=0; i<=t1-p1;i++){
            if(ps == ts){
                for(j=0; j<p1; j++){
                    if(pat.charAt(j)!=text.charAt(i+j))
                    break;
                }

                if(j==p1){
                    System.out.println(i + " ");
                }

                if(j==p1)
                   {
                    System.out.print(i + " ");
                   }
            }
            if(i < (t1-p1)){
                ts = ((ts - h*text.charAt(i)*d) + text.charAt(i+p1)) % q;
                if( ts<0){
                    ts = ts + q;
                    System.err.println("ts = " + ts);
                }
            }
        }


    }


}
