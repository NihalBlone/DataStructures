package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesisChecker {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int testCount = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i<testCount ; i++){
            String expression = sc.nextLine();
            if(isBalancedParenthesis(expression)){
                System.out.println("balanced");
            }
            else System.out.println("not balanced");
        }
    }

    public static boolean isBalancedParenthesis(String brackets){
        Stack stack = new Stack<>();
        if(brackets.charAt(0) == ']'|| brackets.charAt(0) == '}' || brackets.charAt(0) == ')'){
            return false;
        }
        for(int i = 0 ;i<brackets.length(); i++){
            if(brackets.charAt(i) != ']'&& brackets.charAt(i) != '}' && brackets.charAt(i) != ')'){
                stack.push(brackets.charAt(i));
            }
            else{
                if(!stack.empty()) {
                    char openBracket = (Character) stack.pop();
                    if (findClosedBracket(openBracket) != (brackets.charAt(i))) {
                        return false;
                    }
                }
            }

        }
      return stack.empty();
    }

    public static char findClosedBracket(char bracket){
        if(bracket == ('[')){
            return ']';
        }
        else if(bracket==('{')){
            return '}';
        }
        else if(bracket==('(')){
            return ')';
        }
        else return '\0';
    }

}
