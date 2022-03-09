package pattern;
import java.util.*;
public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int space=n-2;
        int temp=1;
         for(int i=1;i<=n/2+1;i++){
            int temp2=temp;
             for(int j=1;j<=i;j++){
              System.out.print( temp2+"\t");
              temp2++;   
             }
             for(int j=1;j<=space;j++){
                 System.out.print("\t");
             }
             int temp3=temp2-1;
             if(i==n/2+1) temp3=temp3-1;
             for(int j=1;j<=i;j++){
                if(!(i==n/2+1 && j==i)) 
                {
                    System.out.print(temp3+"\t");
                    temp3--;
                }   
            }
            space=space-2;

             System.out.println();
        }
         sc.close();
    }
    
}
