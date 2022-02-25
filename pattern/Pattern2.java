import java.util.*;

public class Pattern2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // write ur code here
        int num=sc.nextInt();
        for(int i=num;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*	");
            }
            System.out.println();
        }
        sc.close();

    }
}

// Sample Input

// 5

// Sample Output
// *	*	*	*	*	
// *	*	*	*	
// *	*	*	
// *	*	
// *