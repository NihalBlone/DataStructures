package Stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {
    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
        long testCount = sc.nextInt();

        for(long i = 0 ; i<testCount; i++)
        {
            int size = sc.nextInt();
            long[] arr = new long[size];
            for(int j = 0 ; j<arr.length; j++)
            {
                  arr[j] = sc.nextLong();
            }
            findNextGreaterElementArray(arr);
        }
    }

    public static void findNextGreaterElementArray(long arr[]){

        long[] resultArray = new long[arr.length];

        if(arr.length<=1)
        {
            resultArray[0] = -1;
        }
        else {
           Stack stack = new Stack<>();
           for(int i = arr.length - 1; i>=0 ; i--)
           {

               while(!stack.empty() && arr[i]>=(Long) stack.peek()){
                   stack.pop();
               }
               if(stack.empty()){
                   resultArray[i] = -1;
               }
               else {
                   resultArray[i] = (Long) stack.peek();
               }
               stack.push(arr[i]);
           }
        }
        String result = Arrays.toString(resultArray).replaceAll("[\\[|\\]]", "");
        System.out.println(result.replaceAll(",", ""));

    }



}
