import java.util.*;

public class GcdAndLcm {

  public static void main(String[] args) {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    if (a == b) {
      System.out.println(a);
      System.out.println(b);
      sc.close();
      return;
      
    }
    int  max = 0;
    if (a > b) {
      max = a;
     // min = b;
    } else {
      //min = a;
      max = b;
    }
    int hcf = 1;
    for (int i = max / 2; i >= 1; i--) {
      if (a % i == 0 && b % i == 0) {
        hcf = i;
        System.out.println(i);
        break;
      }
    }
    // System.out.println(hcf);
    long lcm = (a * b) / hcf;
    System.out.println(lcm);
    sc.close();

  }
}

// Sample Input

// 36 24

// Sample Output 12
// 72