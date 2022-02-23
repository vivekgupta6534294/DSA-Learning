
import java.util.*;
public class gradingSystem{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    if(num>90)System.out.println("excellent");
    else if(num>80) System.out.println("good");
    else if (num>70)System.out.println("fair");
    else if (num>60)System.out.println("meets expectations");
    else System.out.println("below par");
    sc.close();
}
}