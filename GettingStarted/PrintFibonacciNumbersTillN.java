
import java.util.*;

public class PrintFibonacciNumbersTillN {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pre2 = 0;
        System.out.println("0");
        int pre1 = 1;
        System.out.println("1");
        for (int i = 2; i < num; i++) {
            int curr = pre1 + pre2;
            pre2 = pre1;
            pre1 = curr;
            System.out.println(curr);
            sc.close();
        }
    }
}
// Sample Input

// 10

// Sample Output
// 0
// 1
// 1
// 2
// 3
// 5
// 8
// 13
// 21
// 34