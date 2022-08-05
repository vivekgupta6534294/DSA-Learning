package dynamicProgrammingAndGreedyForBeginners;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        // first two
        long same=k*1;
        long diff=k*(k-1);

        long total=same+diff;

        for(int i=3;i<=n;i++){
            same=diff*1;
            diff=total*(k-1);
            total=same+diff;
        }
        System.out.println(total);
    }
}