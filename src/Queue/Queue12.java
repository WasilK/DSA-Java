package Queue;
import java.util.*;

public class Queue12 {
    static class Queue{
        static Deque<Integer> dq = new LinkedList<>();
        public static boolean isEmpty(){
            return dq.isEmpty();
        }
        public static void add(int data){
            dq.addFirst(data);
        }
        public static int remove(){
            return dq.removeLast();
        }
        public static int peek(){
            return dq.getLast();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
