package ArrayList;
import java.util.ArrayList;

public class ArrayList3 {
    public static void swapNum(ArrayList <Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String[] args) {
      ArrayList <Integer> list = new ArrayList<>();
      list.add(2);
      list.add(5);
      list.add(3);
      list.add(9);
      list.add(6);
        System.out.println(list);

        swapNum(list, 1, 3);
        System.out.println(list);

    }
}
