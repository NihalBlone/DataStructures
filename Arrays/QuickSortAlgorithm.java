package Arrays;

import com.sun.xml.internal.bind.v2.model.annotation.Quick;

import java.util.Arrays;

public class QuickSortAlgorithm {



    public static void main(String args[]) {
       int unSortedArr[] = new int[]{5, 6, 7, 3, 6, 9, 23, 1, 0};
       //int unSortedArr[] = new int[]{10, 8, 11, 9, 11, 12, 12};
        //int unSortedArr[] = new int[]{15, 9, 7, 13, 12, 16, 4, 18, 11};
        int length = unSortedArr.length;
        QuickSortAlgorithm qsa = new QuickSortAlgorithm();
        qsa.quickSort(unSortedArr, 0, length-1);
        qsa.print(unSortedArr);


    }

    int partiionMiddlePivot(int[] arr, int low, int high){
        System.out.println(low + "::" + high);
        int pivot = arr[(low+high)/2];
        System.out.println("pivot: "+pivot);

        while(low<=high){

            while(arr[low]<pivot){
                low++;
            }
            while(arr[high]>pivot){
                high--;
            }
            System.out.println("low: "+ low + "  || high: "+ high );
            if(low<=high){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                System.out.println("Swapping :" + Arrays.toString(arr));
                low++;
                high--;
            }

        }
        System.out.println("sorting: "+ Arrays.toString(arr));

        return low;
    }

    public void quickSort(int[] unSortedArray, int low, int high){

        int pi = partiionMiddlePivot(unSortedArray, low, high);
        if(low<high){
            quickSort(unSortedArray, low, pi-1);

            quickSort(unSortedArray, pi, high);
        }
    }

    void print(int []arr){
        System.out.println( Arrays.toString(arr));
    }
}
