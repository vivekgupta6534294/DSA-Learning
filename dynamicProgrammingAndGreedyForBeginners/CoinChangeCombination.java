
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int amt=sc.nextInt();
        int dp[]=new int[am+1];
        dp[0]=1;
        for(int i=0;i<arr.length;i++){
            for(int j=arr[i];j<dp.length;j++){
                int coin=arr[i];
                dp[j]=dp[j-coin]+dp[j];
            }
        }

        System.out.println(dp[amt]);

    }
}