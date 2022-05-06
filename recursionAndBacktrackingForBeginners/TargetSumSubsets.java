package recursionAndBacktrackingForBeginners;
import java.util.*;

public class TargetSumSubsets {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        printTargetSumSubsets(arr, 0, "", 0, target);

    }

    // set is the subset
    // sos is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int target) {
        if(idx==arr.length){
            if(sos==target){
                System.out.println(set+'.');
            }
            return;
        }
        if(sos>target){
            return;
        }
        
        printTargetSumSubsets(arr, idx+1, set+arr[idx]+", ", sos+arr[idx], target);
        printTargetSumSubsets(arr, idx+1, set, sos, target);
        
   
        
    }

}