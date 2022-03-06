package recursionAndBacktrackingForBeginners;
import java.util.*;
public class PrintIncreasing {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        printIncrease(num);
        sc.close();
    }

    public static void printIncrease(int n){
        if(n==0) return;
        printIncrease(n-1);
        System.out.println(n);
        
    }  
}
