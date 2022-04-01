package arrays2d;

import java.io.*;
import java.util.*;

public class SaddlePrice {
    //Row Max Column Min

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int[][]mat=new int [r][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        //visiting all column
        int ans=0;
        for(int i=0;i<r;i++){
            ans=SaddlePrice(mat,i);
            if(ans!=-1){
                System.out.println(ans);
                break;
            }       
        }
        if(ans==-1){
            System.out.println("Invalid input");
        }
    }
    public static int SaddlePrice(int arr[][],int k){
        int max=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i][k]>max){
                max=i;//taking index of max of rows
            }
        }
        //Will Visit column to find min
        int maxArrayValue=arr[max][k];
        for (int i = 0; i < arr.length; i++) {
            if(arr[max][i]<maxArrayValue){
                return -1;
            }
        }
        return maxArrayValue;
    }

}