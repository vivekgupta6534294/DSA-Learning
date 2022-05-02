package test;

import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = scn.nextInt();
        }
        int ans=-1;
        // code here
        for(int i=0;i<arr.length;i++){
            int leftsum=0;
            int rightsum=0;
            for(int j=0;j<arr.length;j++){
                if(i==j){
                    continue;
                }else if(j<i){
                    leftsum+=arr[j];
                }else{
                    rightsum+=arr[j];
                }
            }
            if(leftsum==rightsum){
                ans=i;
                break;
            }
        }
        System.out.println(ans);
    }
}