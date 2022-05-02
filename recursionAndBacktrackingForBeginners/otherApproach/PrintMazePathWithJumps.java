package recursionAndBacktrackingForBeginners.otherApproach;

import java.io.*;
import java.util.*;

public class PrintMazePathWithJumps {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int dr=sc.nextInt();
        int dc=sc.nextInt();

        printMazePathWithJumps(0,0,dr-1,dc-1,"");

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePathWithJumps(int sr, int sc, int dr, int dc, String psf) {
        if(sr==dr && sc==dc){
            System.out.println(psf);
            return ;
        }
          for(int i=1;i+sc<=dc;i++){
            printMazePathWithJumps(sr, sc+i, dr, dc, psf+"h"+i);

        }
        
        for(int i=1;i+sr<=dr;i++){
            printMazePathWithJumps(sr+i, sc, dr, dc, psf+"v"+i);

        }
      
        for(int i=1;i+sc<=dc && i+sr<=dr;i++){
            printMazePathWithJumps(sr+i, sc+i, dr, dc, psf+"d"+i);

        }
    }

}