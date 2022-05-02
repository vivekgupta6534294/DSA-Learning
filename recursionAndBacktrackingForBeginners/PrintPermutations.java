package recursionAndBacktrackingForBeginners;

import java.io.*;
import java.util.*;

public class PrintPermutations {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        printPermutations(str,"");

    }

    public static void printPermutations(String qsf, String asf) {
        if(qsf.length()==0){
            System.out.println(asf);
            return;
        }
        for(int i=0;i<qsf.length();i++){
            char ch=qsf.charAt(i);
            StringBuilder sb=new StringBuilder(qsf);
            sb.deleteCharAt(i);
            String roq=sb.toString();
            printPermutations(roq, asf+ch);
        }
        
    }

}