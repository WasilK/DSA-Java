package Queue;
import java.util.*;

public class Queue10 {
    public static void queueReversal(Queue<Integer> q){
        if(q.isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i < 6; i++){
            q.add(i);
        }

        queueReversal(q);
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
