package Arrays;

import java.util.Arrays;

public class ReverseInPlace {
    public static void main(String args[]){
        int origArr[] = new int[]{1, 2, 4, 5, 6, 7};
        reverseInPlace(origArr);
    }
    public static void reverseInPlace(int arr[]){
       int i = 0;
       int j = arr.length-1;
       while(i<j){
           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
           i++;
           j--;
       }
        System.out.println("reversed: "+ Arrays.toString(arr));
    }


}
