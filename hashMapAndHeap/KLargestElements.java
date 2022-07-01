package hashMapAndHeap;

import java.util.*;
 import java.lang.*;
 import java.io.*;
 public class KLargestElements
  {
 	 public static void main (String[] args) throws IOException
 	  {
 	 	 Scanner scn= new Scanner(System.in);
 	    	 int n = scn.nextInt();
 	 	 int[] num = new int[n];
 	 	 for (int i = 0; i < n; i++) {
 	 	 	 	 num[i] = scn.nextInt();
 	 	 	 }
 	 	 int k = scn.nextInt();
 	 	 solve(n,num,k);
 	  }
 	 // -----------------------------------------------------
 	 // This is a functional problem. Only this function has to be written.
 	 // This function takes as input an array,n length of array and k.
 	 // It should print required output.
 	  public static void solve(int n,int[] arr,int k){
 	     //Write your code here
         PriorityQueue<Integer> pq=new PriorityQueue<>();
         for(int i=0;i<arr.length;i++){
            if(pq.size()<k){
                pq.add(arr[i]);
            }else{
                if(pq.peek()<arr[i]);
                pq.add(arr[i]);
                pq.remove();
                
            }
         }
         Stack<Integer> stack=new Stack<>();// No need but asked to print in descending order
         while(pq.size()>0){
            stack.push(pq.poll());
         }
         while(stack.size()>0){
            System.out.print(stack.peek()+ " ");
            stack.pop();
         }
     }
 }