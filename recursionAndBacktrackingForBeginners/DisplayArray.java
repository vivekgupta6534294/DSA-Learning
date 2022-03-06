package recursionAndBacktrackingForBeginners;


import java.util.*;

public class DisplayArray {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        displayArr(arr,a-1);
        sc.close();
    }

    public static void displayArr(int[] arr, int idx){
        if(idx<0) return;
        displayArr(arr, idx-1);
        System.out.println(arr[idx]);
        
    }

}
// Sample Input

// 5
// 3
// 1
// 0
// 7
// 5

// Sample Output
// 3
// 1
// 0
// 7
// 5