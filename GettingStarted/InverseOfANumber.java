import java.util.*;

public class InverseOfANumber{

public static void main(String[] args) {
  // write your code here  
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int inverse=0;
  int place=1;
  while(n!=0){
      int digit=n%10;
      int id=place;
      int ip=digit;
      inverse=inverse+id*(int)(Math.pow(10,ip-1));
      n=n/10;
      place++;
  }
  System.out.println(inverse);
  sc.close();
 }
}