package BinaryTree;

public class LeftView {
    static int maxLevel = -1;

    public static void main(String args[]){
        CreateBinaryTreeOfChoice bt = new CreateBinaryTreeOfChoice();
        BNode node = bt.createNode("21L23R36L15R14L58L67R79L");
        printLeftView(node, 0);
    }
    
    public static void printLeftView(BNode node, int currentLevel){
        if(node == null){
            return;
        }
        if(currentLevel> maxLevel){
            System.out.println(node.val);
            maxLevel = currentLevel;
        }
        currentLevel++;
        printLeftView(node.left, currentLevel);
        printLeftView(node.right, currentLevel);
    }
}
