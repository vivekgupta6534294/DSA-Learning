package pattern;
import java.util.Scanner;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int space=1;space<=i-1;space++){
                System.out.print("\t");
            }
            for(int j=1;j<=num+1-i;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
