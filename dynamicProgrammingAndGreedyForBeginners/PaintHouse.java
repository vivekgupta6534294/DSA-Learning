package dynamicProgrammingAndGreedyForBeginners;

import java.io.*;
import java.util.*;

public class PaintHouse {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int dp[][]=new int[n][3];

        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                if(i==0){
                    dp[i][j]=arr[i][j];
                }else {
                    if(j==0){
                        dp[i][j]=arr[i][j]+Math.min(dp[i-1][1],dp[i-1][2]);

                    }else if(j==1){
                        dp[i][j]=arr[i][j]+Math.min(dp[i-1][0],dp[i-1][2]);

                    }else{
                        dp[i][j]=arr[i][j]+Math.min(dp[i-1][0],dp[i-1][1]);

                    }
                }
            }
        }

        int ans=Math.min(dp[n-1][0],Math.min(dp[n-1][1],dp[n-1][2]));
        System.out.println(ans);

    }
}