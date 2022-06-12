package timeComplexityAndSpace;

import java.io.*;
import java.util.*;

public class MergeTwoSortedArrays {

  public static int[] mergeTwoSortedArrays(int[] a, int[] b){
    //write your code here
    int an=a.length,bn=b.length;
    int []arr=new int[an+bn];
    int index=0;
    int p1=0;
    int p2=0;
    while(index<arr.length){
        int num1=(p1<a.length)?a[p1]:Integer.MAX_VALUE;
        int num2=(p2<b.length)?b[p2]:Integer.MAX_VALUE;
        if(num1<num2){
            arr[index++]=num1;
            p1++;
        }else{
            arr[index++]=num2;
            p2++;
        }

    }    
    return arr;
  }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
    for(int i = 0 ; i < n; i++){
      a[i] = scn.nextInt();
    }
    int m = scn.nextInt();
    int[] b = new int[m];
    for(int i = 0 ; i < m; i++){
      b[i] = scn.nextInt();
    }
    int[] mergedArray = mergeTwoSortedArrays(a,b);
    print(mergedArray);
  }

}