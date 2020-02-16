package BinaryTree;


public class TreeFromInorderAndPreorder {
  static Node root = null;
  static int counter = 0;

    public static void main(String args[]){
        int[] inorder = new int[] {1,3,5,6,9};
        int[] preorder = new int[] {5,3,1,9,6};

       root = formTree(inorder, preorder, 0, inorder.length-1);

        System.out.println("postOrder: ");
        printPostOrder(root);

        System.out.println("inorder: ");
        printInorder(root);
    }

    public static void printPostOrder(Node node){
        if(node!=null){
            printPostOrder(node.left);
            printPostOrder(node.right);
            System.out.println(node.val);;
        }
    }

    public static void printInorder(Node node){

        if(node!=null){
            printInorder((node.left));
            System.out.println(node.val);
            printInorder((node.right));
        }
    }


    public static Node formTree(int[] inOrder, int[] preorder, int leftIndex, int rightIndex){
        int  indexInInOrder = 0;

        if(leftIndex>rightIndex){
            return  null;
        }
        Node node = new Node(preorder[counter]);
        counter++;

        if(rightIndex==leftIndex){
            return node;
        }

        for(int i= leftIndex;i<=rightIndex; i++){
            if(inOrder[i] == node.val){
                indexInInOrder = i;
                break;
            }
        }
        node.left = formTree(inOrder, preorder, leftIndex, indexInInOrder-1 );
        node.right= formTree(inOrder, preorder, indexInInOrder+1,   rightIndex);

        return node;

    }

}



