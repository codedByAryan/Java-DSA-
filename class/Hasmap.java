
import java.util.HashMap;


public class Hasmap {
    public static void main(String[] args) {
       // int arr[] = {10,7,6,10,8,8,1,1,1};
        String arr2[] = {"aryan", "chauhan", "charlie", "charlie", "charlie", "charlie", "charlie", "charlie", "charlie"};
        // int[] hash = new int[11];
        // for(int i=0; i<hash.length; i++){
        //     hash[i] = 0;
        // }
        //  for(int element : arr){
        //     hash[element]++;
        // }

        HashMap<String, Integer> mp = new HashMap<>();
        for(String name : arr2){
            if(mp.containsKey(name)){
                int val = mp.get(name);
                mp.put(name, val+1);
            } else {
               mp.put(name, 1);
            }
        }

        System.out.println();
        System.out.println("no of times i seen charlie ");
        System.out.println(mp.get("charlie"));

        for(HashMap.Entry<String, Integer> key: mp.entrySet()){
            System.out.print(key.getKey() + " ");
            System.out.print(key.getValue() + " ");
        }

    }
}