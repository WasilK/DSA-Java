package HashMap;
import java.util.*;

public class HashMap2 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 1);
        hm.put("USA", 2);
        hm.put("Canada", 3);
        hm.put("UK", 4);
        hm.put("France", 5);

        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for(String k : keys){
            System.out.println("Key = " + k + ", value = " + hm.get(k));
        }
    }
}
