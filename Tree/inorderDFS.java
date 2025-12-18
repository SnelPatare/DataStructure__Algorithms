package Tree;

import java.util.Stack;

class Node{
    int data;
    Node left, right;

    public Node(int item){
        data = item;
        left = right = null;

    }
}
public class inorderDFS {

    Node root;

    inorderDFS() { root = null;}

    void inorder(Node node){
        if(node == null) return;

        inorder(node.left);
        System.out.println(node.data + " ");
        inorder(node.right);
    }

    void iterativeinorder(Node node){

        Stack<Node> stack = new Stack<>();

        Node curr = root;

        while(curr != null || !stack.isEmpty()){
            while (curr!= null){
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            System.out.println(curr.data + " ");
            curr = curr.right;
        }


    }

    public static void main(String[] args)
    {
        inorderDFS tree = new inorderDFS();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);

        tree.iterativeinorder(tree.root);
    }

    
}
