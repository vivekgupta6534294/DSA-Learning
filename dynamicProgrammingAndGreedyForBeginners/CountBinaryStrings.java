package dynamicProgrammingAndGreedyForBeginners;

import java.io.*;
import java.util.*;

public class CountBinaryStrings{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(tab(n));


 }
 public static int tab(int n){

    int dp[][]=new int[2][n+1];

    for(int i=0;i<=n;i++){
        if(i==0){
            dp[0][i]=0;
            dp[1][i]=0;
        }else if(i==1){
            dp[0][i]=1;
            dp[1][i]=1;
        }else{
            dp[0][i]=dp[1][i-1];// previous ke 1 ke bad join ho jayega
            dp[1][i]=dp[0][i-1]+dp[1][i-1];// dono ke end mai lag jayega
        }
    }
    return dp[0][n]+dp[1][n];
 }

}