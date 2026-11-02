package Heaps;
import java.util.*;

public class Heaps1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // to reverse the order
        pq.add(3);
        pq.add(1);
        pq.add(4);
        pq.add(7);
        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
