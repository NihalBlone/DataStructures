package BinaryTree;

public class FindHeightOfTheTree {

    static Node root = null;
    public static void main(String args[]){
        createNode((new Node(5)), root);
        createNode((new Node(4)), root);
        createNode((new Node(9)), root);
        createNode((new Node(2)), root);
        createNode((new Node(0)), root);
        createNode((new Node(8)), root);

        System.out.println(heightOfTheTree(root));


    }

    public static int heightOfTheTree(Node node){
        if(root == null){
            System.out.println("tree is not created");
            return 0;
        }
        if(node == null){
            return 0;
        }

        return Math.max(heightOfTheTree(node.left), heightOfTheTree(node.right)) + 1;
    }

    public static void createNode(Node node, Node head){
        if(root == null){
            root = node;
            return;
        }
        if(head.val>node.val){
            if(head.left!=null){
                createNode(node, head.left);
            }
            else{
                head.left = node;
                return;
            }
        }
        else {
            if(head.right!=null){
                createNode(node, head.right);
            }
            else{
                head.right = node;
                return;
            }
        }
    }

    static class Node{
        int val;
        Node right = null;
        Node left = null;

        public Node(int val){
           this.val = val;
        }
    }
}
