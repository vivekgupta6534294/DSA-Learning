package recursionAndBacktrackingForBeginners;

import java.util.*;

public class GetStairPaths {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String> ans=getStairPaths(n);
        System.out.println(ans);
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n==0){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> myList=new ArrayList<>();
        if(n>=1){
            ArrayList<String> paths=getStairPaths(n-1);
            for(String path:paths){
                myList.add(1+path);
            }
        }
        if(n>=2){
            ArrayList<String> paths=getStairPaths(n-2);
            for(String path:paths){
                myList.add(2+path);
            }
        }
        if(n>=3){
            ArrayList<String> paths=getStairPaths(n-3);
            for(String path:paths){
                myList.add(3+path);
            }
        }
        return myList;
    }

}