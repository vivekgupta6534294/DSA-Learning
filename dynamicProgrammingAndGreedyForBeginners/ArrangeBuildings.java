package dynamicProgrammingAndGreedyForBeginners;

import java.io.*;
import java.util.*;

public class ArrangeBuildings{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(tab(n));
 }
 public static long tab(int n){
    int []build=new int[n+1];
    int []space=new int[n+1];
    build[1]=1;
    space[1]=1;

    for(int i=2;i<=n;i++){
        build[i]=space[i-1];
        space[i]=build[i-1]+ space[i-1];
    }
    long ans=build[n]+space[n];
    return ans*ans;
 }

}