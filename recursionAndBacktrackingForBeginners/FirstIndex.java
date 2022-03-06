package recursionAndBacktrackingForBeginners;

import java.util.Scanner;

public class FirstIndex {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int num=sc.nextInt();
        int first=firstIndex(arr, 0, num);
        System.out.println(first);
        sc.close();
    }
    public static int firstIndex(int[] arr, int idx, int x){
        if(idx==arr.length) return -1;
        if(arr[idx]==x){
            return idx;
        }else{
            int first=firstIndex(arr, idx+1, x);
            return first;
        }
    }
    
}
