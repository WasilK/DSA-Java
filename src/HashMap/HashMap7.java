package HashMap;
import java.util.*;

public class HashMap7 {
    public static void main(String[] args) {
        // count distinct elements
        int nums[] = {4, 3, 2, 5, 6, 7, 3, 4, 2, 1};
        HashSet<Integer> res = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            res.add(nums[i]);
        }

        System.out.println(res.size());
    }
}
