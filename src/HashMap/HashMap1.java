package HashMap;
import java.util.*;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        //insert

        hm.put("India", 150);
        hm.put("China", 140);
        hm.put("Canada", 70);

        System.out.println(hm);

        //get
        System.out.println(hm.get("India"));

        System.out.println(hm.containsKey("India"));

        System.out.println(hm.remove("China"));
    }
}
