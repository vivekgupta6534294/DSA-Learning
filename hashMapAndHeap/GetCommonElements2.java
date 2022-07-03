package hashMapAndHeap;

import java.util.*;
public class GetCommonElements2 {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int m=sc.nextInt();
        int arr1[]=new int[m];
        for(int i=0;i<m;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            if(map.containsKey(arr1[i])){
                System.out.println(arr1[i]);
                
                if(map.get(arr1[i])>1){
                    map.put(arr1[i],map.get(arr1[i])-1);
                }
                else{
                    map.remove(arr1[i]);
                }
            }
        }
     }
}