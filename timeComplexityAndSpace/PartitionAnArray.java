package timeComplexityAndSpace;
// Sample Input

// 5
// 7 
// -2 
// 4 
// 1 
// 3
// 3

// Sample Output
// Swapping -2 and 7
// Swapping 1 and 7
// Swapping 3 and 4
// -2 1 3 7 4

import java.io.*;
import java.util.*;

public class PartitionAnArray {

  public static void partition(int[] arr, int pivot){
    //write your code here
    // left side smaller ane chahiye right side larger
    int i=0,j=0;
    while(j<arr.length){
        if(arr[j]<=pivot){
            swap(arr,j,i);
            i++;
            j++;
        }else{
            j++;
        }

    }
    
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping " + arr[i] + " and " + arr[j]);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    int pivot = scn.nextInt();
    partition(arr,pivot);
    print(arr);
  }

}