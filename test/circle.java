package test;

import java.io.*;
import java.util.*;

public class circle {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int m=sc.nextInt();
        int n=sc.nextInt();
        int r=sc.nextInt();
        int rr=sc.nextInt();
        double d= Math.sqrt(Math.pow((x-m), 2)+Math.pow((y-n), 2));
        
        if(x==m && y==n){
            System.out.println("concentric");
            return;
        }
        else if(d<=r-rr||d<rr-r){
            System.out.println("overlaps");
            return;
        }else if(d<r+rr){
            System.out.println("touches at 2 point");
            return ;
        }else if(d==rr+r){
            System.out.println("touches at 1 point");
            return ;
        }else{
            System.out.println("far-apart");
            return;
        }
    }
}