package recursionAndBacktrackingForBeginners;

import java.util.*;

public class DisplayArrayInReverse {

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
        System.out.println(arr[idx]);
        displayArr(arr, idx-1);
        
        
    }

}