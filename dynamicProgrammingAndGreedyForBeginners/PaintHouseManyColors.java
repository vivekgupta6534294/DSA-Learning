package dynamicProgrammingAndGreedyForBeginners;
import java.io.*;
import java.util.*;

public class PaintHouseManyColors {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int color=sc.nextInt();
        int arr[][]=new int[n][color];
        for(int i=0;i<n;i++){
            for(int j=0;j<color;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int [][]dp=new int [arr.length][arr[0].length];

        for(int i=0;i<arr[0].length;i++){
            dp[0][i]=arr[0][i];
        }
        for(int i=1;i<dp.length;i++){
            for(int  j=0;j<dp[0].length;j++){
                int min=Integer.MAX_VALUE;
                for(int k=0;k<dp[0].length;k++){
                     if(k!=j){
                        if(dp[i-1][k]<min){
                            min=dp[i-1][k];
                        }
                     }
                }
                dp[i][j]=arr[i][j]+min;
            }
        }
        int min =Integer.MAX_VALUE;
        for(int k=0;k<dp[0].length;k++){
            if(dp[n-1][k]<min){
                min=dp[n-1][k];
            }
        }
        System.out.println(min);

    }
}

// input output
// 4 -house
// 3-k color
// 1
// 5
// 7
// 5
// 8
// 4
// 3
// 2
// 9
// 1
// 2
// 4
// 8ans