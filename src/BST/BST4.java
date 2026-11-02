package BST;

import java.util.ArrayList;

public class BST4 {
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
    public static void getInorder(Node root, ArrayList<Integer> arr){
        if(root == null){
            return;
        }
        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);
    }
    public static ArrayList<Integer> merge(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
        int i = 0, j = 0;
        ArrayList<Integer> merge = new ArrayList<>();
        while(i < arr1.size() && j < arr2.size()){
            if(arr1.get(i) <= arr2.get(j)){
                merge.add(arr1.get(i));
                i++;
            }else{
                merge.add(arr2.get(j));
                j++;
            }
        }
        while(i < arr1.size()){
            merge.add(arr1.get(i));
            i++;
        }
        while(j < arr2.size()){
            merge.add(arr2.get(j));
            j++;
        }
        return merge;
    }
    public static Node createBST(ArrayList<Integer> merge, int st, int en){
        if(st > en){
            return null;
        }
        int mid = (st + en) / 2;
        Node root = new Node(merge.get(mid));
        root.left = createBST(merge, st, mid-1);
        root.right = createBST(merge, mid+1, en);
        return root;
    }
    public static Node mergeBST(Node root1, Node root2){
        //inorder
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root1, arr1);
        getInorder(root2, arr2);
        //merge
        ArrayList<Integer> merge = merge(arr1, arr2);
        //balanced bst
        return createBST(merge, 0, merge.size()-1);
    }
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);
        Node root = mergeBST(root1, root2);
        preorder(root);
    }
}
