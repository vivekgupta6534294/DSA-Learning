package pattern;
import java.util.*;

public class Pattern14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // write ur code here
        int n=sc.nextInt();
        for(int i=1;i<=10;i=i+1){
            int ans=n*i;
            System.out.println(n+" * "+i+" = "+ans);

        }
        sc.close();

    }
}
// Sample Input

// 3

// Sample Output
// 3 * 1 = 3
// 3 * 2 = 6
// 3 * 3 = 9
// 3 * 4 = 12
// 3 * 5 = 15
// 3 * 6 = 18
// 3 * 7 = 21
// 3 * 8 = 24
// 3 * 9 = 27
// 3 * 10 = 30