package other;

import java.util.Scanner;
//Prime number in a range
public class isprime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++){
            if(isprimecheck(i)==1)
            System.out.print(i+" ");
        }
        sc.close();
    }
    public static int isprimecheck(int num){
        int flag = 0;
            if (num == 0 || num == 1) {
                return 0;
            } else {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        flag = 1;
                        return 0;
                    }
                }
                if (flag == 0) {
                    return 1;
                }
            }
            return -1;
    }
    
}
