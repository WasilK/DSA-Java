package ArrayList;
import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(4);

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < list.size(); i++){
            max = Math.max(list.get(i), max);
        }
        System.out.println(max);
    }
}
