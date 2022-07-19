package dynamicProgrammingAndGreedyForBeginners;
import java.io.*;
import java.util.*;

public class MinCostInMazeTraversal {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int m =sc.nextInt();
        int n=sc.nextInt();
        int cost[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                cost[i][j]=sc.nextInt();
            }
        }
        System.out.println(find(0,0,m-1,n-1,cost));
    }
    public static int find (int sr,int sc, int dr, int dc, int cost[][]){

        int dp[][]=new int[dr][dc];

        for(int i=dr-1;i>=0;i--){
            for(int j=dc-1;j>=0;j--){
                if(i==dr && j== dc){
                    dp[i][j]=cost[i][j];
                }
                else if(i==dr){
                    dp[i][j]=cost[i][j]+cost[i+1][j];
                }else if(j==dc){
                    dp[i][j]=cost[i][j]+cost[i][j+1];
                }else{

                    dp[i][j]=Math.min(dp[i+1][j],dp[i][j+1])+cost[i][j];
                }
            }
        }
        return dp[0][0];


    }

}