package BinaryTree;

public class BinaryTree2 {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh) + 1;
    }
    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }
        int lc = countNodes(root.left);
        int rc = countNodes(root.right);
        return lc + rc + 1;
    }
    public static int sumNodes(Node root){
        if(root == null){
            return 0;
        }
        int ls = sumNodes(root.left);
        int rs = sumNodes(root.right);
        return ls + rs +  root.data;
    }

    public static int diameter1(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        int ld = diameter1(root.left);
        int rd = diameter1(root.right);

        int selfdiam = lh + rh + 1;
        return Math.max(selfdiam, Math.max(ld, rd));
    }

    static class Info{
        int diam;
        int ht;
        public Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter(Node root){
        if(root == null){
            return new Info(0, 0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam, ht);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(height(root));
//        System.out.println(countNodes(root));
//        System.out.println(sumNodes(root));
//        System.out.println(diameter1(root));
//        System.out.println(diameter(root).diam);

    }
}
