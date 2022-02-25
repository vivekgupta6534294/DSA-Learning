import java.util.*;

public class Pattern3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // write ur code here
        int num = sc.nextInt();
        int space=num-1;
        int star=1;
        for (int i = 1; i <=num; i++) {
            for (int j = 1;j<=space;j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= star; j++) {

                System.out.print("*\t");
            }
            space--;
            star++;
            System.out.println();
        }
        sc.close();
    }
}



// Sample Input

// 5

// Sample Output
// *
// * *
// * * *
// * * * *
// * * * * *