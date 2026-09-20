// Recursuion Practice

public class RecursionR {
    public static int filling(int n){
        // base case
        if(n==0 || n==1){
            return 1;
        }
        int totways = filling(n-1)+filling(n-2);
        return totways;
    }

    public static void Remove_Duplicates(String str, StringBuilder newstr, int i, boolean map[]){
        // base case
        if(i == str.length()-1){
            System.out.println(newstr);
            return;
        }
        //kaam
        char currchar = str.charAt(i);
        if(map[currchar-'a']==true){
            Remove_Duplicates(str, newstr, i+1, map);
        }
        else{
            map[currchar-'a'] = true;
            Remove_Duplicates(str, newstr.append(currchar), i+1, map);
        }
    }

    public static int Friends(int n){
        // base case
        if(n==1 ||n==2){
            return n;
        }
        // sigle choice
        int fnm1 = Friends(n-1);
        // pair choice
        int fnm2 = (n-1)*Friends(n-2);
        // totyways

        int totways  = fnm1+fnm2;

        return totways;
    }
    public static void main(String[] args) {
         // int n = 3;
        // System.out.println("Total ways is: " + filling(n));
        //  String str = "apnacollege";
        //  Remove_Duplicates(str, new StringBuilder(""), 0, new boolean[26]);
        System.out.println("Total number of ways: " + Friends(3));
    }
}

        
    
    
    

