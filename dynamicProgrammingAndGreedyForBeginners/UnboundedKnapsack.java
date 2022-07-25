package dynamicProgrammingAndGreedyForBeginners;

import java.io.*;
	import java.util.*;

	public class UnboundedKnapsack {

	    public static void main(String[] args) throws Exception {
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


            // Input portion done 
            // logic starts from here 
            // capacity +1 size ka array lena hoga 
            // since unbounded mai infinity supply hai like coin change 

            int dp[]=new int[capacity+1];
            for(int cap=1;cap<=capacity;cap++){
                for(int j=0;j<n;j++){
                    int val=value[j];
                    int wt=weight[j];


                    // Include
                    if(cap>=wt){
                        
                        dp[cap]=Math.max(dp[cap],val+dp[cap-wt]);
                    }
                }
            }
            System.out.println(dp[capacity]);

	    }
	}