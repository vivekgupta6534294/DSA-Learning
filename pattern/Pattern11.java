package pattern;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int i,j,k=0;
        for(i=0;i<num;i++){
            for(j=0;j<=i;j++){
                System.out.print(++k+ "	");
            }
            System.out.println();
        }


    }
    
}
// Sample Input

// 5

// Sample Output
// 1	
// 2	3	
// 4	5	6	
// 7	8	9	10	
// 11	12	13	14	15