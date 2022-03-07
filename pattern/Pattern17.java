package pattern;

import java.util.*;

public class Pattern17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int space=n/2;
        int star=1;
        int row=1;
       while(row<=n){
           for(int i=1;i<=space;i++){
               if(row==n/2+1){
                   System.out.print("*\t");
               }else {
                System.out.print("\t");
               }   
           }
           for(int i=1;i<=star;i++){
               System.out.print("*\t");
           }
           System.out.println();
           if(row<=n/2){
               star++;
           }else{
               star--;
           }
           row++;
       }
       sc.close();
    }
}
