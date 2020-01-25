package Arrays;

import java.util.HashSet;
import java.util.Set;

public class FindPairThatMakesTheSum {

    public static void main(String args[]){
        int arr[] = new int[] {4, 5, 7, 2, 8, 4, 3, 6};
        int sum = 8;
        Set temp = new HashSet();
        findThePair(arr, temp, sum);
    }

    public static void findThePair(int[] arr, Set temp, int sum){
        for (int i= 0; i< arr.length; i++){
            if(temp.contains(arr[i])){
                System.out.println(arr[i] + " , " + (sum-arr[i]) );
            }
            else {
                temp.add(sum-arr[i]);
            }
        }
    }
}
