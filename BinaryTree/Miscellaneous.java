package BinaryTree;

/*
Input: parent[] = {1, 5, 5, 2, 2, -1, 3}
Output: root of below tree
          5
        /  \
       1    2
      /    / \
     0    3   4
         /
        6
Explanation:
Index of -1 is 5.  So 5 is root.
5 is present at indexes 1 and 2.  So 1 and 2 are
children of 5.
1 is present at index 0, so 0 is child of 1.
2 is present at indexes 3 and 4.  So 3 and 4 are
children of 2.
3 is present at index 6, so 6 is child of 3.


Input: parent[] = {-1, 0, 0, 1, 1, 3, 5};
Output: root of below tree
         0
       /   \
      1     2
     / \
    3   4
   /
  5
 /
6
 */

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

