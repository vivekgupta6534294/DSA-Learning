package dynamicProgrammingAndGreedyForBeginners;

import java.util.*;
public class ZeroOneKnapsack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int value[]=new int[n];
        int weight[]=new int[n];
        for(int i=0;i<n;i++){
            value[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            weight[i]=sc.nextInt();
        }
        int capacity=sc.nextInt();
        System.out.println(tab(value, weight,capacity));    
    }
    public static int tab(int value[],int weight[], int capacity){
        int n=value.length;
        int [][]dp=new int[n+1][n+1];
        for(int i=1;1<=n;i++){
            for(int cap=1;cap<=capacity;cap++){
                int v=value[i-1];
                int wt=weight[i-1];
                if(cap>=wt){
                    // include exclude
                    int inc=v+dp[i-1][cap-wt];
                    int exc=dp[i-1][cap];
                    dp[i][cap]=Math.max(inc,exc);
                }else {
                    //exclude kro 
                    dp[i][cap]=dp[i-1][cap];

                }
            }
        }
        return dp[n][capacity];

    }


    
}
