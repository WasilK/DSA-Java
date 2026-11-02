package HashMap;
import java.util.*;

public class HashMap11 {
    public static int subarraySum(int arr[], int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int ans = 0;
        int sum = 0;
        for(int j = 0; j < arr.length; j++){
            sum += arr[j];
            if(map.containsKey(sum-k)){
                ans += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        System.out.println(subarraySum(arr, 3));
    }
}
