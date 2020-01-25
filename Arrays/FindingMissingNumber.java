package Arrays;

public class FindingMissingNumber{

    public static void main(String args[]){
        int[] input =  new int[] {2, 5, 7, 9, 8};
        int max = 0;

        for(int i = 0 ; i<input.length; i++){
             if(input[i]>max)
                 max= input[i];
        }
        FindingMissingNumber fmn = new FindingMissingNumber();
        fmn.getMissingNumber(max, input);

    }

    public void getMissingNumber(int max, int[] inputArr){
        int actualArr[] = new int[max];
        for(int i = 0; i <max; i++){
            actualArr[i] = 0;
        }
         for(int i = 0; i<inputArr.length; i++)
         {
             actualArr[inputArr[i]-1] = inputArr[i];
         }

         for (int i = 0 ; i<max; i++){
             if(actualArr[i]==0){
                 System.out.println("missing number: " + (i+1));
             }
         }
    }
}