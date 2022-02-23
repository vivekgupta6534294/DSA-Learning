package other;

import java.util.*;
class Sum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int sum=1;
        // for(int i=2;i<=n;i++){
        //     sum=sum+i;
        // }
        int sum=(n*(n+1))/2;
        System.out.println(sum);
        sc.close();
        
    }
}