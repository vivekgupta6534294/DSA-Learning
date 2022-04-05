package stringDynamicStringAndDynamicArray;
import java.io.*;
import java.util.*;

public class PrintAllPermutationsOfAStringIteratively {

	public static void solution(String str){
		// write your code here
        int fact=factorial(str);

        
        for(int i=0;i<fact;i++){
            StringBuilder sb=new StringBuilder(str);
            int temp=i;
            for(int div=str.length();div>=1;div--){
                int q=temp/div;
                int r=temp%div;
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                temp=q;
            }


        }
		
	}
    public static int factorial(String str){
        int fact=1;
        for(int i=2;i<=str.length();i++){
            fact=fact*i;
        }
        return fact;

    }
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}