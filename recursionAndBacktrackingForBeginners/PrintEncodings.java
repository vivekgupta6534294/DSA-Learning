package recursionAndBacktrackingForBeginners;

import java.io.*;
import java.util.*;

public class PrintEncodings {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String num=sc.nextLine();
        printEncodings(num,"");
    }

    public static void printEncodings(String qsf, String asf) {
        if(qsf.length()==0){
            System.out.println(asf);
            return;
        }
        char n1=qsf.charAt(0);
        if(n1=='0'){
            return;
        }else{
            //Single Digit
            char enco=(char)('a'+(n1-'1'));
            printEncodings(qsf.substring(1), asf+enco);
            //multidigit;
            if(qsf.length()>1){
               String ab=qsf.substring(0,2);
               int n2=Integer.parseInt(ab);
               if(n2<=26){
                   char enc2=(char)('a'+(n2-1));
                   printEncodings(qsf.substring(2), asf+enc2);
               }
            }
           
        }
        
    }

}