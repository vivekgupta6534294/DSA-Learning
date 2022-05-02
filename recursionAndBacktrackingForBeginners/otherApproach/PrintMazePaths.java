package recursionAndBacktrackingForBeginners.otherApproach;
// package recursionAndBacktrackingForBeginners.otherApproach;
import java.util.*;
public class PrintMazePaths {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dr=sc.nextInt();
        int dc=sc.nextInt();
        printMazePath(0,0,dr-1,dc-1,"");        
        
    }

    private static void printMazePath(int sr, int sc, int dr, int dc, String psf) {
        
        // Reactive 
        // if(sr>dr || sc>dc){
        //     return ;
        // }


        if(sr==dr && sc==dc){
            System.out.println(psf);
            return ;
        }
        //Proactive Code 
        if(sc+1<=dc){
            printMazePath(sr, sc+1, dr, dc, psf+"h");
        }
        if(sr+1<=dr){
            printMazePath(sr+1, sc, dr, dc, psf+"v");
        }
    }  
}
