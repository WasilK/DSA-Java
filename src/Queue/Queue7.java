package Queue;
import java.util.*;

public class Queue7 {
    static class Stack{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();
        public static boolean isEmpty(){
            return q1.isEmpty();
        }
        public static void push(int data){
            q2.add(data);
            while(!q1.isEmpty()){
                q2.add(q1.remove());
            }
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
        }

        public static int pop(){
            return q1.remove();
        }

        public static int peek(){
            return q1.peek();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
