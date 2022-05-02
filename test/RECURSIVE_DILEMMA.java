package test;
import java.util.Scanner;

public class RECURSIVE_DILEMMA {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        recursiveCode(n);
    }
    public static void recursiveCode(int n){
        if(n==0) return;
        recursiveCode(n-1);
        System.out.println(n);
        recursiveCode(n-1);
    }
}