package pattern;
import java.util.*;
public class Pattern13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
             int icj=1;
            for(int j=0;j<=i;j++){
               
                System.out.print(icj+ "\t");
                int icj1=icj*(i-j)/(j+1);
                icj=icj1;
            }
            System.out.println();
        }
        sc.close();
    }
}
