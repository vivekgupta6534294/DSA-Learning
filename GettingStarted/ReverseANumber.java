
import java.util.*;
  
public class ReverseANumber{

public static void main(String[] args) {
  // write your code here  
  Scanner sc=new Scanner(System.in);
  int num=sc.nextInt();
  while(num!=0){
    
  System.out.println(num%10);
  num=num/10;
  }
  sc.close();
 }
}
// Sample Input

// 65784383

// Sample Output
// 3
// 8
// 3
// 4
// 8
// 7
// 5
// 6