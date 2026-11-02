package HashMap;
import java.util.*;

public class HashMap6 {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Hyderabad");
        cities.add("Bengaluru");
        cities.add("Bengaluru");

        //First Method to iterate
        Iterator it = cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println();
        //Second method to iterate
        for(String city : cities){
            System.out.println(city);
        }
    }
}
