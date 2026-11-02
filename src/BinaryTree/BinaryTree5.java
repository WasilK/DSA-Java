package BinaryTree;
import java.util.*;

public class BinaryTree5 {
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
    public static void kthLevel(Node root, int level, int k){
        if(root == null){
            return;
        }
        if(level == k){
            System.out.print(root.data + " ");
            return;
        }
        kthLevel(root.left, level + 1, k);
        kthLevel(root.right, level + 1, k);
    }
    public static void kthLevel2(Node root, int k){
        if(root == null){
            return;
        }
        int level = 1;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                level++;
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if(level == k){
                    System.out.print(currNode.data + " ");
                }
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }
    public static boolean getPath(Node root, int n, ArrayList<Node> path){
        if(root == null){
            return false;
        }
        path.add(root);
        if(root.data == n){
            return true;
        }
        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);
        if(foundRight || foundLeft){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    public static Node lowestCommonAncestor1(Node root, int n1, int n2){
       ArrayList<Node> path1 = new ArrayList<>();
       ArrayList<Node> path2 = new ArrayList<>();

       getPath(root, n1, path1);
       getPath(root, n2, path2);

       int i = 0;
       for(; i<path1.size() && i<path2.size(); i++){
           if(path1.get(i) != path2.get(i)){
               break;
           }
       }
       Node lca = path1.get(i-1);
       return lca;
    }
    public static Node lowestCommonAncestor2(Node root, int n1, int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }
        Node leftLca = lowestCommonAncestor2(root.left, n1, n2);
        Node rightLca = lowestCommonAncestor2(root.right, n1, n2);
        if(leftLca == null){
            return rightLca;
        }
        if(rightLca == null){
            return leftLca;
        }
        return root;
    }
    public static int lcaDist(Node root, int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int left = lcaDist(root.left, n);
        int right = lcaDist(root.right, n);
        if(left == -1 && right == -1){
            return -1;
        }else if(left == -1){
            return right + 1;
        }else{
            return left + 1;
        }
    }
    public static int minDist(Node root, int n1, int n2){
        Node lca = lowestCommonAncestor2(root, n1, n2);
        int dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca, n2);
        return dist1 + dist2;
    }
    public static int kAncestor(Node root, int n, int k){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftDist = kAncestor(root.left, n, k);
        int rightDist = kAncestor(root.right, n, k);
        if(leftDist == -1 && rightDist == -1){
            return -1;
        }
        int max = Math.max(leftDist, rightDist);
        if(max + 1 == k){
            System.out.println(root.data);
        }
        return max+1;
    }
    public static void preOrderTraversal(Node root){ //O(n)
        if(root == null){
//                System.out.print(-1 + " "); // not required here just for explanation
            return;
        }
        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    public static int sumTree(Node root){
        if(root == null){
            return 0;
        }
        int leftSubTree = sumTree(root.left);
        int rightSubTree = sumTree(root.right);
        int data = root.data;
        root.data = leftSubTree + rightSubTree;
        return data + root.data; // explanation - returned value is this but node's own value is different example - 4 is returned value but node value is zero.
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
//        kthLevel(root, 1, 3);
//        kthLevel2(root, 3);
//        System.out.println(lowestCommonAncestor1(root, 4, 6).data);
//        System.out.println(lowestCommonAncestor2(root, 4, 6).data);
//        System.out.println(minDist(root, 4, 5));
//        kAncestor(root,4,1);
        sumTree(root);
        preOrderTraversal(root);
    }
}
