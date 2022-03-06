package recursionAndBacktrackingForBeginners;

import java.util.*;

public class LastIndex {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        int last = lastIndex(arr, 0, num);
        System.out.println(last);
        sc.close();
    }

    public static int lastIndex(int[] arr, int idx, int x) {
        if(idx==arr.length) return -1;
        int last=lastIndex(arr, idx+1, x);
        if(last==-1){
            if(arr[idx]==x){
                return idx;
            }else{
                return -1;
            }
        }else{
                return last;
        }
    }
}
// Sample Input

// 6
// 15
// 11
// 40
// 4
// 4
// 9
// 4

// Sample Output
// 4