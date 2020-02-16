package BinaryTree;

import java.util.*;

public class TopView {

    static Map<Integer, Queue> treeMap = new TreeMap<>();

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

        Queue<Integer> temp = new LinkedList<>();
        if(treeMap.containsKey(level)){
            temp = treeMap.get(level);
        }
            temp.add(node.val);
            treeMap.put(level, temp);


        storeNodeBasedOnVerticalLevel(node.left, level-1);
        storeNodeBasedOnVerticalLevel(node.right, level+1);

    }

    public static void displayTopView(Map<Integer, Queue> treeMap){
        for(Map.Entry<Integer, Queue> entry: treeMap.entrySet()){
            System.out.println(entry.getValue().peek());
        }
    }
}
