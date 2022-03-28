package arrays2d;

import java.io.*;
import java.util.*;

public class SpiralDisplay {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        int mat[][] = new int[r][c];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = scn.nextInt();
            }
        }

        int rmin=0;
        int cmin=0;
        int rmax=mat.length-1;
        int cmax=mat[0].length-1;
        int count=0;
        while(count<r*c){
            //left wall
            for(int i=rmin;i<=rmax;i++){
                count++;
                if(count<=r*c)
                System.out.println(mat[i][cmin]);
            }
            //bottom wall 
            for(int i=cmin+1;i<=cmax;i++){
                count++;
                if(count<=r*c)
                System.out.println(mat[rmax][i]);
            }
            // right wall
            for(int i=rmax-1;i>=rmin;i--){
                count++;
                if(count<=r*c)
                System.out.println(mat[i][cmax]);
            }
            // top wall
            for(int i=cmax-1;i>=cmin+1;i--){
                count++;
                if(count<=r*c)
                System.out.println(mat[rmin][i]);
            }
            rmin=rmin+1;
            rmax=rmax-1;
            cmin=cmin+1;
            cmax=cmax-1;
        }
    }

}