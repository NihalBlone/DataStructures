package String;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();   // consuming the enter key entered first
        String s;
        for(int i = 0 ; i<t ; i++){
            s = sc.nextLine();
            reverse(s);
        }
    }


    public static void reverse(String s){
        String[] wordsArray = s.split("\\.");
        String temp = "";
        int i = wordsArray.length-1;
        while(i>=0)
        {
            temp = temp + wordsArray[i];
            if(i!=0){
                temp = temp+".";
            }
            i = i-1;
        }
        System.out.println(temp);
    }
}
