import java.util.*;
  
  public class IsPrime{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
  
       // write ur code here
      int num = scn.nextInt();

      int flag = 1; // 1 -> prime
      for(int i = 2 ; i*i <= num ; i++){
          if(num % i == 0){
            // number is not prime
            flag = 0; // 0 -> not prime
            break;
          }
      }

      if(flag == 1){
        System.out.println("prime");
      }else{
        System.out.println("not prime");
      }
   }
  }