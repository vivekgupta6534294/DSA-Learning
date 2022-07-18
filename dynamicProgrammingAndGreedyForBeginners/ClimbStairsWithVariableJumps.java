package dynamicProgrammingAndGreedyForBeginners;
import java.util.*;
public class ClimbStairsWithVariableJumps {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int moves[]=new int[n];
        for(int i=0;i<n;i++){
            moves[i]=sc.nextInt();
        }  
        // System.out.println(ClimbStairsWithVariableJumps_rec(0, n, moves));   
        int []dp=new int[n];
        Arrays.fill(dp,-1);
        System.out.println(ClimbStairsWithVariableJumps_Memo(0, n, moves,dp));   
     
    }  
    public static int ClimbStairsWithVariableJumps_rec(int currStep,int totalStep,int moves[]){
        if(currStep>totalStep) return 0;
        if(currStep==totalStep) return 1;
        int ans=0;
        for(int i=1;i<=moves[currStep];i++){
           ans += ClimbStairsWithVariableJumps_rec(currStep+i, totalStep, moves);
        }
        return ans;
    } 
    public static int ClimbStairsWithVariableJumps_Memo(int currStep,int totalStep,int moves[],int []dp){       
        if(currStep>totalStep) return 0;
        if(currStep==totalStep) return 1;
        if(dp[currStep]!=-1) return dp[currStep];
        int ans=0;
        for(int i=1;i<=moves[currStep];i++){
           ans += ClimbStairsWithVariableJumps_Memo(currStep+i, totalStep, moves,dp);
        }
        return dp[currStep]=ans;
    } 
    
}
