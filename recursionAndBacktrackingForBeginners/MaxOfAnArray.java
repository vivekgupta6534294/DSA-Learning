package recursionAndBacktrackingForBeginners;
import java.util.Scanner;
public class MaxOfAnArray {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(maxOfArray(arr, a-1));
        sc.close();
        
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx<0) return 0;
        return Math.max(arr[idx],maxOfArray(arr, idx-1));
    }
}
