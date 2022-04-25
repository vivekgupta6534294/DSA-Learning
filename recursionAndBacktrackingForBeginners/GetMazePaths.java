package recursionAndBacktrackingForBeginners;

import java.io.*;
import java.util.*;
public class GetMazePaths {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        // int sr=scn.nextInt();
        // int sc=scn.nextInt();
        int dr=scn.nextInt();
        int dc=scn.nextInt();
        ArrayList<String> ans=getMazePaths(0, 0, dr-1, dc-1);
        System.out.println(ans);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr==dr && sc==dc){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;//[""]
        }
        if(sr>dr||sc>dc){
            ArrayList<String> base=new ArrayList<>();
            return base;//[]
        }
        //Horizontal path 
        ArrayList<String> hpath=getMazePaths(sr, sc+1, dr, dc);
        //Vertical Path
        ArrayList<String> vpath=getMazePaths(sr+1, sc, dr, dc);
        
        // Result : 
        ArrayList<String> myPath=new ArrayList<>();
        for(String path: hpath){
            myPath.add("h"+path);
        }
        for(String path : vpath) {
            myPath.add("v"+path);
        }
        return myPath;
    }

}