import java.util.*;

public class GcdAndLcmTwo {

  public static void main(String[] args) {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int a1=a;
    int b1=b;
    while(b%a!=0){
        int rem=b%a;
        b=a;
        a=rem;
    }
    int gcd=a;
    int lcm=(a1*b1)/gcd;
    System.out.println(gcd+"\n"+lcm);
    sc.close();
  }
}
// Sample Input

// 36
// 24

// Sample Output
// 12
// 72
