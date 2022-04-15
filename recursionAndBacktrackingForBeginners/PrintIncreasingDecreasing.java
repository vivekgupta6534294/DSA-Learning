package recursionAndBacktrackingForBeginners;

import java.util.Scanner;

public class PrintIncreasingDecreasing {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        PrintIncreasingDecreasingOrder(num);
        // printDecreasing(num);
        // printIncrease(num);
        sc.close();
    }
    public static void PrintIncreasingDecreasingOrder(int n){
        if(n==0) return;
        System.out.println(n);
        PrintIncreasingDecreasingOrder(n-1);
       //10
        System.out.println(n);
    }

    // public static void printDecreasing(int n){
    //     if(n==0) return;
    //     System.out.println(n);
    //     printDecreasing(n-1);
        
    // }

    // public static void printIncrease(int n) {
    //     if (n == 0)
    //         return;
    //     printIncrease(n - 1);
    //     System.out.println(n);
    // }

}
