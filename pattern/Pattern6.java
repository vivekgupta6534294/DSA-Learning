package pattern;

import java.util.*;

public class Pattern6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int star=(n/2)+1;
        int space=1;
        int row=1;
        while(row<=n){
            // code for each row
            for(int i=1;i<=star;i++){
                System.out.print("*\t");
            }
            for(int i=1;i<=space;i++){
                System.out.print("\t");
            }
            for(int i=1;i<=star;i++){
                System.out.print("*\t");
            }
            // move to next line 
            System.out.println();
            // preparation for next row 
            if(row<=n/2){
                star=star-1;
                space=space+2;
            }else{
                star=star+1;
                space=space-2;
            }
            row++;

        }
        
        sc.close();
    }
}
