package gettingStarted;
import java.util.*;
  
  public class CountDigitsInANumber{
  
  public static void main(String[] args) {
    // write your code here  
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int count=0;
    while(num!=0){
      num=num/10;
      count++;
    }
    System.out.println(count);
    sc.close();
   }
  }
//   Sample Input

// 65784383

// Sample Output
// 8