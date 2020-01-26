package LinkedList;

public class ReverseLinkedList {

    public static  void main(String args[]) {
        String s = "";
        Node headNode = new Node(1, null);
        createLinkedList(new Node(2, null), headNode);
        createLinkedList(new Node(3, null), headNode);
        createLinkedList(new Node(4, null), headNode);
        createLinkedList(new Node(5, null), headNode);



        System.out.println(s);
        //headNode = reverseListRecursion(headNode);
        headNode = reverseWithTwoVariable(headNode);

        while (headNode != null) {
            System.out.println(headNode.value);
            headNode = headNode.next;
        }

    }

   static void createLinkedList(Node node, Node headNode){
        Node temp;
            temp = headNode;/// changing temp get reflected to head node because each node is being shared by temp and headnode as well due to staic method;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = node;

    }


    public static Node reverseListRecursion(Node node){
        Node temp = node;

        if(node.next==null){
            return node;
        }
        temp = reverseListRecursion(node.next);

        node.next.next = node;
        node.next = null;
        return temp;

    }

    public static Node reverseWithTwoVariable(Node node){
        Node forward = null, previous = null ;

        while(node.next!= null){

            forward = node.next;
            System.out.println("forward: " + forward.value);
            node.next = previous;
            previous = node;
            System.out.println("previous: " + previous.value);
            node = forward;
        }
        forward.next = previous;

        return forward;
    }
}

class Node{
    int value;
    Node next = null;

    public Node(int value, Node node){
        this.value = value;
        this.next= node;
    }
}
