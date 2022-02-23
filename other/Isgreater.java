package other;

// given ais not =b .. bis not equal to c and c is not equal to a
import java.util.*;
public class Isgreater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        //1 2 3   3 2 1  132
        // if(a>b && a>c)System.out.println(a);
        // else if (b>c && b>a) System.out.println(b);
        // else System.out.println(c);
        if(a>b){
            if(a>c)System.out.println(a);
            else {
                System.out.println(c);
            }
        }else{
            if(b>c)System.out.println(b);
            else{
                System.out.println(c);
            }
        }
        sc.close();
    }
    
}
