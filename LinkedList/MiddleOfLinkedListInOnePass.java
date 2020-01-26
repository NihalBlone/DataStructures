package LinkedList;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;

public class MiddleOfLinkedListInOnePass {

    public static void main(String args[]){
        MiddleOfLinkedListInOnePass mlp = new MiddleOfLinkedListInOnePass();
        LinkedList li = mlp.new LinkedList();
        li.append(1);
        li.append(2);
        li.append(3);
      

        Node node = li.headNode;
        Node slow = node, fast;
        int cycle = 0;

        while(node.next!=null){
            fast = node.next;
            cycle++;
            if(cycle%2==0){
                slow = slow.next;
            }
            node = fast;
        }
        System.out.println("middle of the node is " + slow.value);

    }


    class LinkedList{
        Node headNode = null;

       public void append(int value){
           if(headNode == null){
               headNode = new Node(value);
           }
           else{
               Node temp= headNode;
               while(temp.next!=null){
                   temp = temp.next;
               }
               temp.next = new Node(value);
           }
       }
    }


    class Node{
        int value;
        Node next = null;

        public Node(int value){
            this.value= value;
        }
    }


}
