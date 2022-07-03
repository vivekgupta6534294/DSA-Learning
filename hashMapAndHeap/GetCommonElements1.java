package hashMapAndHeap;

import java.io.*;
import java.util.*;
// Example
// Sample Input

// 9
// 5
// 5
// 9
// 8
// 5
// 5
// 8
// 0
// 3
// 18
// 9
// 7
// 1
// 0
// 3
// 6
// 5
// 9
// 1
// 1
// 8
// 0
// 2
// 4
// 2
// 9
// 1
// 5

// Sample Output
// 9
// 0
// 3
// 5
// 8
//  Repeatation Not Allowed
public class GetCommonElements1{

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            map.put(arr[i], 0);
        }
        int m=sc.nextInt();
        int arr1[]=new int[m];
        for(int i=0;i<m;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            if(map.containsKey(arr1[i])){
                System.out.println(arr1[i]);
                map.remove(arr1[i]);
            }
        }
     }
    
    }