

import java.util.*;

public class pattern12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int i,j;
        int a=0,b=1;
        int c=a+b;
        for(i=0;i<num;i++){
            for(j=0;j<=i;j++){
                if(i==0){
                    System.out.print(a+"	");
                }
                else if(i==1)
                {   if(j==0) {
                    System.out.print("1");
                    }
                    if(j==1){
                        System.out.print("	");
                        System.out.print(c+"	");
                        a=b;
                        b=c;
                     }
                    
                }else{
                    c=a+b;
                    System.out.print(c);
                    System.out.print("	");
                    a=b;
                    b=c;
                    

                }
                // System.out.println();

            }
            System.out.println();
        }
        sc.close();
    }
}
// Sample Input

// 5

// Sample Output
// 0	
// 1	1	
// 2	3	5	
// 8	13	21	34	
// 55	89	144	233	377