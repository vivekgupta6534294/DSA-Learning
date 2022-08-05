package dynamicProgrammingAndGreedyForBeginners;

import java.io.*;
import java.util.*;

public class CountEncodings {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        int dp[]=new int[n+1];
        dp[n]=1;
        for(int i=n-1;i>=0;i--){
            String s=str.substring(i,i+2);
            int sum=0;
            for(int j=0;j<s.length();i++){
                sum+=s.charAt(i)-'a'+1;
            }
            int value=Integer.parseInt(s);
            dp[i]=dp[i+1];
            if(value<=26){
                dp[i]+=dp[i+2];  
            }

        }

        System.out.println(dp[0]);
        // return dp[0];

    }
}