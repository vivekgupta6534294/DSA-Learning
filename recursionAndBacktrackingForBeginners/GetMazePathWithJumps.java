package recursionAndBacktrackingForBeginners;

import java.io.*;
import java.util.*;

public class GetMazePathWithJumps {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        // int sr=scn.nextInt();
        // int sc=scn.nextInt();
        int dr=scn.nextInt();
        int dc=scn.nextInt();
        ArrayList<String> ans=getMazePaths(0, 0, dr-1, dc-1);
        System.out.println(ans);
    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr==dr && sc==dc){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;//[""]
        }
        ArrayList<String> myList=new ArrayList<>();
        for(int i=1;i+sc<=dc;i++){
            ArrayList<String> dcPath=getMazePaths(sr, sc+i, dr, dc);
            for(String s: dcPath){
                myList.add("h"+i+s);
            }
        }
        for(int i=1;i+sr<=dr;i++){
            ArrayList<String> drPath=getMazePaths(sr+i, sc, dr, dc);
            for(String s: drPath){
                myList.add("v"+i+s);
            }
        }
        for(int i=1;i+sc<=dc && i+sr<=dr;i++){
            ArrayList<String> dcPath=getMazePaths(sr+i, sc+i, dr, dc);
            for(String s: dcPath){
                myList.add("d"+i+s);
            }
        }
        return myList;
    }

}