
import java.util.*;
    
    public class DigitsOfANumber{
    
    public static void main(String[] args) {
      // write your code here 
      Scanner sc=new Scanner(System.in);
      int num= sc.nextInt();
      printDigit(num);
     }
     public static void printDigit(int num){
         if(num==0) return;
         printDigit(num/10);
         System.out.println(num%10);
         
     }
}