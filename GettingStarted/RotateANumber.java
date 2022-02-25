import java.util.*;
   
   public class RotateANumber{
   
   public static void main(String[] args) {
     // write your code here 
     Scanner sc=new Scanner(System.in);
     int num=sc.nextInt();
     int k=sc.nextInt();
     int temp=num;
     int nod=0;//no of digit
     while(temp>0){
         temp=temp/10;
         nod++;
     } 
     k=k%nod;
     if(k<0){
         k=k+nod;
     }
     int div=1;
     int mul=1;
     for(int i=1;i<=nod;i++){
         if(i<=k) div=div*10;
         else mul=mul*10;
     }
     int q=num/div;
     int r=num%div;
     int rotate=r*mul +q;
     System.out.println(rotate);
     sc.close();

    }
   }
// Sample Input

// 562984
// 2

// Sample Output
// 845629
