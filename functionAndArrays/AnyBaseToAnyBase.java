package functionAndArrays;

import java.util.*;
  
  public class AnyBaseToAnyBase{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();

     int ans=decimal(n, sourceBase);
     ans=destBasee(ans, destBase);
     System.out.println(ans);

   }   
   public static int decimal(int n, int b){
    // write your code here
    int ans=0;
    int mul=1;
    while(n!=0){
        ans+=n%10*mul;
        n=n/10;
        mul=mul*b;

    }
    return ans;
   }
   public static int destBasee(int n, int b){
    // write code here
    int ans=0;
    int mul=1;
    while(n!=0){
      ans=ans+(n%b)*mul;
      n=n/b;
      mul=mul*10;
    }
    return ans;
    }
  }