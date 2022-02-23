
import java.util.*;

public class isPrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // write ur code here
        int test = sc.nextInt();
        while (test-- > 0) {
            int flag = 0;
            int num = sc.nextInt();
            if (num == 0 || num == 1) {
                System.out.println("not prime");
            } else {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        System.out.println("not prime");
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    System.out.println("prime");
                }
            }
            sc.close();
        }
    }
}
