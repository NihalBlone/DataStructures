package LinkedList;

import sun.awt.image.ImageWatched;

import java.util.HashSet;
import java.util.Set;

/*
Remove duplicates from Linked List
 */
public class RemoveDuplicatesFromLinkedList {
    public static void main(String args[]){
        RemoveDuplicatesFromLinkedList rm = new RemoveDuplicatesFromLinkedList();
        LinkedList li = rm.new LinkedList();
        li.append(34);
        li.append(22);
        li.append(66);
        li.append(34);

        rm.removeDuplicates(li);
    }


    public void removeDuplicates(LinkedList rm){
        Node current = rm.header;
        Set store = new HashSet();
        Node previous = null;

        while(current!=null){
            if(store.contains( current.val)){
               previous.next= current.next;
            }
            else {
                store.add( current.val);
                previous = current;
            }
            current =  current.next;

        }

        while(rm.header!=null){
            System.out.println(rm.header.val);
            rm.header = rm.header.next;
        }

    }

    class LinkedList{
        Node header;

        public void append(int val){
            if(header==null){
                header = new Node(val);
            }
            else{
                Node temp = header;
                while(temp.next!=null){
                    temp = temp.next;
                }
                temp.next = new Node(val);
            }
        }
    }

    class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }
    }
}
