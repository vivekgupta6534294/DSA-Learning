import java.util.*;

public class Pattern1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // write ur code here
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*	");
            }
            System.out.println();
        }
        sc.close();

    }
}
// Sample Input

// 2

// Sample Output
// *	
// *	*