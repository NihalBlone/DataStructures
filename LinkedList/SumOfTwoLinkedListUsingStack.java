package LinkedList;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.Stack;

/*
Given two numbers represented by two linked lists, write a function that returns the sum list.
The sum list is linked list representation of the addition of two input numbers.

Example:
Input:
  First List: 5->6->3  // represents number 563
  Second List: 8->4->2 //  represents number 842
Output
  Resultant list: 1->4->0->5  // represents number 1405
*/

public class SumOfTwoLinkedListUsingStack {
    LinkedList li1 = new LinkedList();
    LinkedList li2 = new LinkedList();

    public static void main(String args[]){
        SumOfTwoLinkedListUsingStack sum = new SumOfTwoLinkedListUsingStack();
        sum.li1.add(5);
        sum.li1.add(6);
        sum.li1.add(3);

        sum.li2.add(8);
        sum.li2.add(4);
        sum.li2.add(2);

        sum.getSum(sum.li1, sum.li2);
        System.out.println(sum.li1);


    }

    void getSum(LinkedList first , LinkedList second){
        Stack sTemp = new Stack();
        Stack sTemp2 = new Stack();
        int power = 0;
        int firstNumber= 0;
        int secondNumber = 0;
        int sum;

        LinkedList temp1 = first, temp2 = second;
        LinkedList result = new LinkedList();

        for(int i = 0; i<temp1.size() ; i++){
            sTemp.push(temp1.get(i));
        }
        for(int i = 0; i<temp2.size() ; i++){
            sTemp2.push(temp2.get(i));
        }

        while(!sTemp.empty()){
           firstNumber = firstNumber +  ((int) sTemp.pop() * (int)(Math.pow(10, power)));
           power++;
        }
        System.out.println("firstNumber: "+ firstNumber);
        power = 0;

        while(!sTemp2.empty()){
            secondNumber = secondNumber + ((int) sTemp2.pop() * (int) (Math.pow(10, power)));
            power++;
        }
        System.out.println("secondNumber: "+ secondNumber);
        sum = firstNumber + secondNumber;
        System.out.println("sum: "+ sum);

        while(sum%10!=0 || sum>10){
            int temp = sum%10;
            sum = sum/10;
            result.addFirst(temp);
        }
        System.out.println(result);


    }

}
