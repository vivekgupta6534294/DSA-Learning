package arrays2d;

import java.io.*;
import java.util.*;

public class TheStateOfWakanda_1 {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][]mat=new int [r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<c;i++){
            if(i%2==0){
                for(int j=0;j<r;j++){
                    System.out.println(mat[j][i]);
                }

            }else{
                for(int j=r-1;j>=0;j--){
                    System.out.println(mat[j][i]);
                }

            }
        }


    }

}