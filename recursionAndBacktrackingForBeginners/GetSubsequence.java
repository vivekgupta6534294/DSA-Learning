package recursionAndBacktrackingForBeginners;
import java.util.*;
public class GetSubsequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        ArrayList<String> ans=getSS(s);
        System.out.println(ans);
    }
    public static ArrayList<String> getSS(String s){
        if(s.length()==0){
           ArrayList<String> base=new ArrayList<>();
           base.add("");
           return base;
        }

        String res=s.substring(1);//g f g ,,, f   g
        char ch=s.charAt(0);/// g



        ArrayList<String> rres=getSS(res);

        ArrayList<String> myList=new ArrayList<>();
        // Exclude
        for(String str: rres){
            myList.add(str);
        }
        for(String str: rres){
            myList.add(ch+str);
        }
        return myList;
    }
    
}
