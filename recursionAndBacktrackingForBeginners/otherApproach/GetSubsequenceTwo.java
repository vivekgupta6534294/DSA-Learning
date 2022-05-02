package recursionAndBacktrackingForBeginners.otherApproach;
import java.util.*;
public class GetSubsequenceTwo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String ques=sc.nextLine();
        printSS(ques,"");
    }
    private static void printSS(String qsf, String asf){
        if(qsf.length()==0){
            System.out.println(asf);
            return ;
        }
        char ch=qsf.charAt(0);
        String roq=qsf.substring(1);
        printSS(roq, asf+ch);
        printSS(roq, asf);
    }
}

// abc
// abc
// ab
// ac
// a
// bc
// b
// c

