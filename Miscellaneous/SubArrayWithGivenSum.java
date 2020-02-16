package Miscellaneous;

/*
* Input:
        2  // number of test cases

        5 12  // size of an array followed by sum
        1 2 3 7 5

        10 15  // size of an array followed by sum
        1 2 3 4 5 6 7 8 9 10


*  Output:
        2 4
        1 5

Explanation :
Testcase1: sum of elements from 2nd position to 4th position is 12
Testcase2: sum of elements from 1st position to 5th position is 15
*
*
* */

import java.util.Scanner;

public class SubArrayWithGivenSum {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int numberOfTest = sc.nextInt();

        for(int j = 0 ; j< numberOfTest ; j++){
            int size = sc.nextInt();
            int sum = sc.nextInt();
            int arr[] = new int[size];
            for(int i = 0; i<size; i++ ){
                arr[i] = sc.nextInt();
            }
            findIndexNew(arr, sum);
        }
        sc.close();



    }

    public static void findIndexNew(int arr[], int sum){
        int str = 0;
        int end = 0;
        int tempSum = arr[0];
        int size = arr.length;

        if(tempSum == sum){
            System.out.println((str+1)+ " "+ (end+1));
        }

        while(tempSum!=sum){
            if(tempSum>sum){
                if(str>=size){
                    System.out.println(-1);
                    break;
                }
                tempSum = tempSum - arr[str];
                str = str + 1;
                if(tempSum == sum){
                    System.out.println((str+1) + " " + (end+1));
                    break;
                }
            }
            else{
                end = end + 1;
                if(end >= size){
                    System.out.println(-1);
                    break;
                }
                tempSum = tempSum+arr[end];
                if(tempSum == sum){
                    System.out.println((str+1) + " " + (end+1));
                    break;
                }


            }
        }
    }
    public static void findIndexOld(int arr[], int sum){
        int tempSum = 0, strIndex = 0;
        boolean sumFound = false;
        for(int i = 0 ; i<arr.length ; i++){

            if((tempSum + arr[i]) > sum){
                while((tempSum + arr[i])>sum){
                    tempSum = tempSum - arr[strIndex];
                    strIndex = strIndex + 1;

                }
                if((tempSum + arr[i]) == sum){
                    sumFound = true;
                    System.out.println(strIndex+1 + " " + (i+1));
                    break;
                }
            }
            if((tempSum + arr[i]) < sum){
                tempSum = tempSum + arr[i];
                continue;
            }
            else if((tempSum + arr[i]) == sum){
                sumFound = true;
                System.out.println(strIndex+1 + " " + (i+1));
                break;
            }

        }
        if(!sumFound){
            System.out.println("No such sub array is present");
        }
    }
}
