package functionAndArrays;

import java.util.Scanner;

public class digitFrequency {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
        scn.close();
    }

    public static int getDigitFrequency(int n, int d) {
        int count = 0;
        while (n != 0) {
            if (n % 10 == d)
                count++;
            n = n / 10;
        }
        return count;
    }
}
// Sample Input

// 994543234
// 4

// Sample Output
// 3