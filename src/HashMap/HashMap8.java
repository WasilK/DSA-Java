package HashMap;
import java.util.*;

public class HashMap8 {
    public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {7,3,9,6,2,4};

        HashSet<Integer> set = new HashSet<>();

        //union
        for(int i = 0; i < arr1.length; i++){
            set.add(arr1[i]);
        }

        for(int i = 0; i < arr2.length; i++){
            set.add(arr2[i]);
        }

//        System.out.println("union = " + set.size());
//        Iterator it = set.iterator();
//        while(it.hasNext()){
//            System.out.print(it.next() + " ");
//        }

        set.clear();

        //intersection
        for(int i = 0; i < arr1.length; i++){
            set.add(arr1[i]);
        }
        int count = 0;
        for(int i = 0; i < arr2.length; i++){
            if(set.contains(arr2[i])){
                count++;
                set.remove(arr2[i]);
                System.out.print(arr2[i] + " ");
            }
        }
        System.out.println("intersection = " + count);
    }
}
