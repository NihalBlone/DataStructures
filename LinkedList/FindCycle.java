package LinkedList;

public class FindCycle {

    public static void main(String args[]){
        FindCycle mlp = new FindCycle();
        LinkedList li = mlp.new LinkedList();
        li.append(1);
        li.append(2);
        li.append(3);
        li.append(4);


        Node node = li.headNode;
        Node temp = li.headNode;

        while(node.next!=null){
            if(node.value==2){
                node.next.next.next = node;
                break;
            }
            node = node.next;
        }
        Node slow = temp, fast;

        //finding Loop in Linked List
        while(temp.next!=null){
            slow= slow.next;
            fast = temp.next.next;
            temp = fast;
            if(slow == fast){
                System.out.println("loop found");
                mlp.findLoopPoint(li.headNode, fast);
                break;
            }

        }



    }
    void findLoopPoint(Node headNode, Node fast){
        Node slow = headNode;
        while(slow != fast){
            slow= slow.next;
            fast = fast.next;

        }
        System.out.println("Loop point : "+ slow.value);

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
