package arrays2d;
import java.io.*;
import java.util.*;

public class RotateBy90Degree {

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
        int [][]arr=new int[r][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                arr[j][i]=mat[i][j];
            }
        }
        reverse(arr);
       display(arr);


    }
    public static void reverse(int [][]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length/2; j++) {
                int temp =arr[i][j];
                arr[i][j]=arr[i][arr.length-1-j];
                arr[i][arr.length-1-j]=temp;
                
            }
        }
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