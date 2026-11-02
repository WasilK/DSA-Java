package Stack;

public class Stack2 {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }

        static class Stack{
            static Node head = null;
            public static boolean isEmpty(){
                return head == null;
            }

            public static void push(int data){
                Node newNode = new Node(data);
                if(isEmpty()){
                    head = newNode;
                    return;
                }
                newNode.next = head;
                head = newNode;
            }

            public static int pop(){
                int val = head.data;
                if(isEmpty()){
                    return -1;
                }
                head = head.next;
                return val;
            }
            public static int peek(){
                int val = head.data;
                if(isEmpty()){
                    return -1;
                }
                return val;
            }
        }


    }
    public static void main(String[] args) {
        Node.Stack s = new Node.Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}
