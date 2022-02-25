
// import java.util.*;
    
//     public class DigitsOfANumber{
    
//     public static void main(String[] args) {
//       // write your code here 
//       Scanner sc=new Scanner(System.in);
//       int num= sc.nextInt();
//       printDigit(num);
//      }
//      public static void printDigit(int num){
//          if(num==0) return;
//          printDigit(num/10);
//          System.out.println(num%10);
         
//      }
// }
import java.util.*;
    
    public class DigitsOfANumber{
    
    public static void main(String[] args) {
      // write your code here  
      Scanner scn=new Scanner(System.in);
      int num=scn.nextInt();
      int n=num;
      int temp=1;
      // 
      while(n>9){
        n=n/10;
        temp=temp*10;
      }

      while(temp!=0){
      int digit=num/temp;
        System.out.println(digit);
        num=num%temp;
        temp=temp/10;
      }
      scn.close();
     }
    }