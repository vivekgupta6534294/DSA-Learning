package dynamicProgrammingAndGreedyForBeginners;
import java.util.*;
public class ClimbStairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(rec(n));
        System.out.println(recMemo(n,new int[n+1]));
    }
    public static int rec(int n){
        if(n==0) return 1;
        int ans=0;
        for(int jump=1;jump<=3 &&n-jump>=0;jump++){
            ans+=rec(n-jump);
        }
        return ans;
    }
    public static int recMemo(int n,int []dp){
        if(n==0) return 1;
        if(dp[n]!=0) return dp[n];
        int ans=0;
        for(int jump=1;jump<=3 &&n-jump>=0;jump++){
            ans+=recMemo(n-jump,dp);
        }
        return dp[n]=ans;
    }
 
}
