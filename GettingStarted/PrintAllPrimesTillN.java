
import java.util.*;

public class PrintAllPrimesTillN {
    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int low=sc.nextInt();
        int high=sc.nextInt();
        for(int i=low;i<=high;i++){
            if(isPrime(i)==1)
                System.out.println(i);
        }
        sc.close();

    }
    static int isPrime(int num){
        if(num<=1)return 0;
        if(num<=3) return 1;
        if(num%2==0|| num%3==0) return 0;

        for(int i=5;i*i<num;i++){
            if(num%i==0|| num%(i+2)==0){
                return 0;
            }
        }
        return 1;
    }
}
// Give low from to high value
// Sample Input

// 6 
// 24

// Sample Output
// 7
// 11
// 13
// 17
// 19
// 23