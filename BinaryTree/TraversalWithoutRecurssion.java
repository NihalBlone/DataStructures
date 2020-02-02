package BinaryTree;

import java.util.Stack;

public class TraversalWithoutRecurssion {
   static Node root = null;
    public static void main(String args[]){
    createNode(new Node(5), root);
        createNode(new Node(3), root);
        createNode(new Node(7), root);
        createNode(new Node(1), root);
        createNode(new Node(4), root);
        createNode(new Node(9), root);

        printInOrder(root);
        printInOrderWithoutRecurssion(root);
        printPreOrderWithoutResurssion(root);
        printPostOrderWithoutRecurssion(root);
        printPostOrderWithRecurssion(root);

    }

    public static void printInOrderWithoutRecurssion(Node node){
        Stack stack= new Stack<Node>();
        Node current = node;
        while(!stack.empty() || current!=null){
                if(current == null){
                    current =  (Node) stack.pop();
                    System.out.println(current.val);
                    current = current.right;
                    continue;
                }
                else{
                    stack.push(current);
                    current = current.left;
                }

        }
    }

    public static void printPostOrderWithRecurssion(Node node){
        if(node!=null){
            printPostOrderWithRecurssion(node.left);
            printPostOrderWithRecurssion(node.right);
            System.out.println(node.val);
        }
    }

    public static void printPreOrderWithoutResurssion(Node node){
        Stack stack = new Stack();
        Node current = node;
        stack.push(current);
        while(!stack.empty() || current!=null){
            current = (Node) stack.pop();
            if(current!=null){
                System.out.println(current.val);
                stack.push(current.right);
                stack.push(current.left);
            }

        }
    }

    public static void printPostOrderWithoutRecurssion(Node node){
        Stack stack= new Stack();
        Node current = node;
        stack.push(current);
        while(!stack.empty()){
            current = (Node) stack.peek();
            if(current.left == null &&  current.right ==null) {
                current = (Node) stack.pop();
                System.out.println(current.val);
            }
            if(current.right!=null) {
                stack.push(current.right);
                current.right = null;
            }

          if(current.left!=null){
            stack.push(current.left);
            current.left = null;
          }
        }
    }
    public static void printInOrder(Node node){
        if(node!=null){
            printInOrder(node.left);
            System.out.println(node.val);
            printInOrder(node.right);
        }
    }
    public static void createNode(Node node, Node tempRoot){
        if(root == null){
            root = node;
            return;
        }

        if(tempRoot.val>node.val){
            if(tempRoot.left!=null){
                createNode(node, tempRoot.left);
            }
            else{
                tempRoot.left = node;
                return;
            }
        }else{
            if(tempRoot.right!=null){
                createNode(node,tempRoot.right);
            }
            else{
                tempRoot.right = node;
                return;
            }
        }
    }

    static class Node{
        int val;
        Node left, right;

        public Node(int val){
            this.val = val;
            this.left = this.right = null;
        }
    }

}




