package BinaryTree;

import java.util.*;

public class CreateBinaryTreeOfChoice {

    public BNode createNode(String nodeSeq){
        Map<Character, BNode> map = new HashMap<Character, BNode>();

        for(int i = 0; i<nodeSeq.length(); i++) {
            if(nodeSeq.charAt(i)!='L' && nodeSeq.charAt(i)!='R'){
                if(!map.containsKey(nodeSeq.charAt(i))){
                    BNode node = new BNode(Character.getNumericValue(nodeSeq.charAt(i)));
                    map.put(nodeSeq.charAt(i), node);
                }
            }
            else{
                if(nodeSeq.charAt(i)=='L'){

                   BNode parentNode =  map.get(nodeSeq.charAt(i-2));
                   parentNode.left = map.get(nodeSeq.charAt(i-1));
                }
                if(nodeSeq.charAt(i)=='R'){
                    BNode parentNode =  map.get(nodeSeq.charAt(i-2));
                    parentNode.right = map.get(nodeSeq.charAt(i-1));
                }
            }
        }
        return (map.get(nodeSeq.charAt(0)));
    }

}
