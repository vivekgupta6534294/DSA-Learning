package pattern;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        int sp=n/2;
        int star=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++){
                System.out.print("\t");
            }
            for (int j = 1; j <= star; j++){
                if(j==1||j==star){
                    System.out.print("*\t");
                }else {
                    System.out.print("\t");
                }
            }
            if (i<=n/2) {
                sp--;
                star+=2;
            } else{
                sp++;
                star-=2;
                
            }
            System.out.println();
            
        }
        scn.close();

    }
}