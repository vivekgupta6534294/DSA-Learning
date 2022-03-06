package recursionAndBacktrackingForBeginners;
import java.util.*;
public class TowerOfHanoi {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        toh(n,a,b,c);
        sc.close();
    }
    public static void toh(int n, int a, int b, int c){
        if(n==0) return ;
        toh(n-1,a,c,b);
        System.out.println(n+"["+a+" -> " +b+"]");
        toh(n-1,c,b,a);
        
    }

}