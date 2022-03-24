package functionAndArrays;

import java.io.*;
import java.util.*;

public class SubarrayProblem{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    subArrayProblem(arr);
    sc.close();
 }
 public static void subArrayProblem(int[] arr){
     for(int i=0;i<arr.length;i++){
         for(int j=i;j<arr.length;j++){
            for(int idx=i;idx<=j;idx++){
                System.out.print(arr[idx]+"\t");
            }
            System.out.println();

         }
     }

 }

}