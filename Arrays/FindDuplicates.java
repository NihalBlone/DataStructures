package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicates {

    public static void main(String args[]){
        int arr[] = new int[]{3, 6, 9, 3, 5, 5};
        findDuplicates(arr);
    }

    public static void findDuplicates(int[] arr){
        Set temp = new HashSet();
        int counter=0;
        for(int i = 0 ; i<arr.length; i++){
            if(temp.contains(arr[i])){
                System.out.println("duplicate: "+ arr[i]);
            }
            else{
                temp.add(arr[i]);
            }
        }
    }
}
