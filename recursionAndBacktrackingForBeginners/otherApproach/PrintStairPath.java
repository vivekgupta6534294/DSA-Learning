package recursionAndBacktrackingForBeginners.otherApproach;
import java.util.*;
public class PrintStairPath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        printStairPath(num,"");
    }    
    private static void printStairPath(int num, String asf){
        if(num==0){
            System.out.println(asf);
            return;
        }
        if(num>=1){
            printStairPath(num-1, asf+1);
        }
        if(num>=2){
            printStairPath(num-2, asf+2);
        }
        if(num>=3){
            printStairPath(num-3, asf+3);
        }
        
    }
}
