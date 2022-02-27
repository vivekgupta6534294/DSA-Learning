// import java.util.*;

// public class PrimeFactorisationOfANumber {

//     public static void main(String[] args) {
//         // write your code here
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         // System.out.println(isPrime(num));
//         for(int i=2;i<=num;){
//             if(num%i==0 && isPrime(i)==1){
//                 System.out.print(i+" ");
//                 num=num/i;
                
//             }else {
//                 i++;
//             }
//         }

//     }

//     public static int isPrime(int num) {
//         if (num == 0 || num == 1)
//             return 0;
//         for (int i = 2; i < num; i++) {
//             if (num % i == 0)
//                 return 0;
//         }
//         return 1;
//     }
// }
import java.util.*;

public class PrimeFactorisationOfANumber {
  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    for (int div = 2; div * div <= n; div++)
    {
      while (n % div == 0)
      {
        System.out.print(div + " ");
        n = n / div;
      }
    }
    if (n != 1)//like 10 46
    {
      System.out.print(n);
    }
    scn.close();

  }
}