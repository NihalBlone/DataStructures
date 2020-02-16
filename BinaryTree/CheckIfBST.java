package BinaryTree;

import java.util.Stack;

public class CheckIfBST {
    int max = Integer.MAX_VALUE;
    int min = Integer.MIN_VALUE;

    public static void main(String args[]){
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        CreateBinaryTreeOfChoice bt = new CreateBinaryTreeOfChoice();
        BNode node = bt.createNode("21L23R");
        //printInorder(node);
        System.out.println(isBST(node, min, max));
    }

    public static  void printInorder(BNode node){
        //System.out.println(node.left.val);
        Stack stack = new Stack<>();
        BNode currentNode= node;
        while(!stack.empty()|| currentNode!=null){
           if(currentNode==null){
               currentNode = (BNode) stack.pop();
              System.out.println(currentNode.val);
               currentNode = currentNode.right;
           }
           else{
               stack.push(currentNode);
               currentNode = currentNode.left;
           }
        }
    }

    public static boolean isBST(BNode node, int min, int max){
        if(node==null){
            return true;
        }
        else if(node.val<min || node.val>max) {
            return false;
        }
       return isBST(node.left, min, node.val) && isBST(node.right, node.val, max); // and condition used as both should return true;
    }
}
