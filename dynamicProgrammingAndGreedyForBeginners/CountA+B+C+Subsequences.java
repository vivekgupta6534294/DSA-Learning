package dynamicProgrammingAndGreedyForBeginners;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        int dp[][]=new int[3][n];

        for(int i=0;i<3;i++){
            for(int j=0;j<n;j++){
                if(j==0){
                    dp[0][j]=1;
                }
                else if(str.charAt(j)=='a'){
                    dp[0][j]=2*dp[0][j]+1;

                }else if(str.charAt(j)=='b'){
                    dp[1][j]=2*dp[1][j-1]+dp[0][j-1];

                }else if(str.charAt(j)=='c'){
                    dp[2][j]=2*dp[2][j-1]+dp[1][j-1];

                }
            }
        }

        System.out.println(dp[2][n-1]);


    }
}