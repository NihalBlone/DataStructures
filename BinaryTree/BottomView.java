package BinaryTree;

import java.util.*;

public class BottomView {

        static Map<Integer, Stack> treeMap = new TreeMap<>();

        public static void main(String args[]){
            CreateBinaryTreeOfChoice cst = new CreateBinaryTreeOfChoice();
            BNode node = cst.createNode("12L13R24L25R36L37R68R79R");
            storeNodeBasedOnVerticalLevel(node, 0);
            displayTopView(treeMap);
        }



        public static void storeNodeBasedOnVerticalLevel(BNode node, int level){
            if(node==null){
                return;
            }

            Stack<Integer> temp = new Stack<>();
            if(treeMap.containsKey(level)){
                temp = treeMap.get(level);
            }
            temp.add(node.val);
            treeMap.put(level, temp);


            storeNodeBasedOnVerticalLevel(node.left, level-1);
            storeNodeBasedOnVerticalLevel(node.right, level+1);

        }

        public static void displayTopView(Map<Integer, Stack> treeMap){
            for(Map.Entry<Integer, Stack> entry: treeMap.entrySet()){
                System.out.println(entry.getValue().peek());
            }
        }
}


