package arrays2d;

import java.io.*;
import java.util.*;
 
public class RingRotate {
    public static void main(String[] args){
        // input
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        int mat[][] = new int[r][c];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = scn.nextInt();
            }
        }
        int s=scn.nextInt();
        int k=scn.nextInt();

        ringRotate(mat,s,k);
        display(mat);
        scn.close();
    }
    public static int[] fill1d(int mat[][], int s){
        int rmin=0+s-1;
        int cmin=0+s-1;
        int rmax=mat.length-1-s+1;
        int cmax=mat[0].length-1-s+1;

        int size=2*(rmax-rmin+cmax-cmin);
        int arr[]=new int[size];
        int idx=0;
        //left wall
        for(int i=rmin;i<=rmax;i++){
            arr[idx++]=mat[i][cmin];
        }
        //bottom wall 
        for(int i=cmin+1;i<=cmax;i++){
            arr[idx++]=mat[rmax][i];
        }
        // right wall
        for(int i=rmax-1;i>=rmin;i--){
            arr[idx++]=mat[i][cmax];
        }
        // top wall
        for(int i=cmax-1;i>=cmin+1;i--){
            arr[idx++]=mat[rmin][i];
        }
        return arr;

    }
    public static void fill2d(int mat[][],int s, int []arr){
        int rmin=0+s-1;
        int cmin=0+s-1;
        int rmax=mat.length-1-s+1;
        int cmax=mat[0].length-1-s+1;

        // int size=2*(rmax-rmin+cmax-cmin);
        // int arr[]=new int[size];
        int idx=0;
        //left wall
        for(int i=rmin;i<=rmax;i++){
            mat[i][cmin]=arr[idx++];
        }
        //bottom wall 
        for(int i=cmin+1;i<=cmax;i++){
            mat[rmax][i]=arr[idx++];
        }
        // right wall
        for(int i=rmax-1;i>=rmin;i--){
            mat[i][cmax]=arr[idx++];
        }
        // top wall
        for(int i=cmax-1;i>=cmin+1;i--){
            mat[rmin][i]=arr[idx++];
        }
    }
    public static void reverse(int[] a, int li, int ri){
        while(li < ri){
        int temp = a[li];
        a[li]= a[ri];
        a[ri] = temp;
 
        li++;
        ri--;
        }
    }
    public static void rotate(int[] a, int k){
        k = k % a.length;
        if(k < 0){
        k += a.length;
        }
 
        reverse(a, 0, a.length - k - 1);
        reverse(a, a.length - k, a.length - 1);
        reverse(a, 0, a.length - 1);
    }
    public static void ringRotate(int [][]mat, int s, int k){
        int rmin=0+s-1;
        int cmin=0+s-1;
        int rmax=mat.length-1-s+1;
        int cmax=mat[0].length-1-s+1;

        int size=2*(rmax-rmin+cmax-cmin);
        int arr[]=new int[size];
        arr=fill1d(mat, s);
        // 1darray fill


        rotate(arr, k);
        // rotate 
        fill2d(mat, s, arr);
        // 2darray , shell fill   
    }
 
    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
 
}