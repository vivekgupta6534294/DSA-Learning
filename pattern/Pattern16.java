package pattern;
import java.util.*;
public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int space=2*n-1-2;
        int star=1;
        int row=1;
        while(row<=n){
            int val=1;
            for(int j=1;j<=star;j++){
                System.out.print(val+"\t");
                val++;
            }
            for(int j=1;j<=space;j++){
                System.out.print("\t");
            }
            if(row==n) star=star-1;
            int val2=star;
            for(int j=1;j<=star;j++){
                System.out.print(val2+"\t");
                val2--;
            }
            System.out.println();
            star++;
            space=space-2;
            row++;
        }
         sc.close();
    }
    
}
