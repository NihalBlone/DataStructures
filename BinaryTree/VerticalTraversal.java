package BinaryTree;

import java.util.*;

public class VerticalTraversal {
    static Map<Integer, List<Integer>> map = new HashMap<>();
    public static void main(String args[]){
        CreateBinaryTreeOfChoice cst = new CreateBinaryTreeOfChoice();
        BNode node = cst.createNode("12L13R24L25R36L37R68R79R");
        verticalTraversal(node, 0);
        printElements(map);
        //printInorder(node);

    }

    public static  void printInorder(BNode node){
        Stack stack = new Stack();

        while(!stack.empty() || node != null){
            if(node!=null){
                stack.push(node);
                node = node.left;
            }
            else{
                node = (BNode) stack.pop();
                System.out.println(node.val);
                node = node.right;

            }
        }
    }

    public static void verticalTraversal(BNode node, int level){
        if(node == null){
            return;
        }
        List<Integer> listOfNode = new ArrayList<>();
        if (map.containsKey(level)) {
            listOfNode = map.get(level);
        }
        listOfNode.add(node.val);
        map.put(level, listOfNode);

        verticalTraversal(node.left, level-1);
        verticalTraversal(node.right, level+1);

    }

   static void  printElements(Map<Integer, List<Integer>> hashmap){
        hashmap.forEach((k,v) -> {
            System.out.println(k);
       });
   }


}
