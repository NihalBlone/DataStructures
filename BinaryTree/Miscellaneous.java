package BinaryTree;

public class Miscellaneous {
    static Node root = null;

    public static void main(String args[]){
        int[] arr = new int[]{1, 5, 5 , 2, 2, -1, 3};
        Node[] nodeCreated = new Node[arr.length];

        for(int i =0 ;i<nodeCreated.length ; i++){
            nodeCreated[i] = null;
        }
        for(int i =0 ; i<arr.length; i++){
            createNode(arr, i, nodeCreated);
        }
        printInorder(root);

    }

    public static void printInorder(Node node){

        if(node!=null){
            printInorder((node.left));
            System.out.println(node.val);
            printInorder((node.right));
        }
    }

    public static void createNode(int[] arr, int i, Node[] nodeCreated){
        if(nodeCreated[i]!=null){
            return;
        }
        nodeCreated[i] = new Node(i);
        if(arr[i] == -1) {
            root = nodeCreated[i];
            return;
        }
        createNode(arr, arr[i], nodeCreated);

            if(nodeCreated[arr[i]].left==null){
                nodeCreated[arr[i]].left = nodeCreated[i];
            }
            else{
                nodeCreated[arr[i]].right = nodeCreated[i];
            }
        }


}

class Node{
    int val;
    Node left = null, right = null;

    public Node(int val){
        this.val = val;
    }
}

