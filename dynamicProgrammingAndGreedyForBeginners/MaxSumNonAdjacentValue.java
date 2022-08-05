package dynamicProgrammingAndGreedyForBeginners;
import java.io.*;
import java.util.*;

public class MaxSumNonAdjacentValue {

    public static void main(String[] args) throws Exception {

        import java.io.*;
        import java.util.*;
        
        public class Main {
        
            public static void main(String[] args) throws Exception {
         Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int arr[]=new int[n];
        
                for(int i=0;i<n;i++){
                    arr[i]=sc.nextInt();
                }
        
                // Count Binary jaisa hai 
        
                int dp[][]=new int[2][n+1];
                for(int i=0;i<=n;i++){
                    if(i==0){
                        dp[0][i]=0;
                        dp[1][i]=arr[i];
        
                    }else{
                        dp[0][i]=Math.max(dp[0][i-1],dp[1][i-1]);
                        dp[1][i]=dp[0][i-1];
                    }
                 
                }
                int finalAns=Math.max(dp[0][n],dp[1][n]);
                System.out.println(finalAns);
        
        
            }
        }