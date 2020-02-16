package BinaryTree;

public class ImplementationOfBST {
    Node root = null;

    public static void main(String args[]){

        int[] valArr =  new int[] {5, 3, 9, 1, 6};
        ImplementationOfBST imp = new ImplementationOfBST();
        for(int i = 0; i<valArr.length ; i++){
            imp.createBST(valArr[i],imp.root);
        }
        System.out.println("inOrder: ");
        imp.printInorder(imp.root);
        System.out.println("preOrder: ");
        imp.printPreOrder(imp.root);
        System.out.println("postOrder: ");
        imp.printPostOrder(imp.root);
    }

    public void createBST(int val, Node node){

        if(root == null){
            root = new Node(val);
            return;
        }
        else {
            if (val < node.val) {
                if (node.left == null) {
                    node.left = new Node(val);
                    return;
                } else {
                    createBST(val, node.left);
                }
            } else {
                if (node.right == null) {
                    node.right = new Node(val);
                    return;
                } else {
                    createBST(val, node.right);
                }
            }
        }
    }

    public void printInorder(Node node){

        if(node!=null){
            printInorder((node.left));
            System.out.println(node.val);
            printInorder((node.right));
        }
    }

    public void printPreOrder(Node node){
        if(node!=null){
            System.out.println(node.val);
            printPreOrder(node.left);
            printPreOrder(node.right);
        }
    }

    public void printPostOrder(Node node){
        if(node!=null){
            printPostOrder(node.left);
            printPostOrder(node.right);
            System.out.println(node.val);;
        }
    }

    class Node{
        int val ;
        Node left, right ;

        public Node(int val){
            this.val = val;
            this.left = this.right = null;
        }
    }

}
