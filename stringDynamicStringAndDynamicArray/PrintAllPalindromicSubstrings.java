package stringDynamicStringAndDynamicArray;

import java.util.*;

public class PrintAllPalindromicSubstrings {
    public static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            char ch=s.charAt(i);
            char ch1=s.charAt(j);
            if(ch!=ch1){
                return false;
            }else{
                i++;
                j--;
            }

        }
        return true;
    }

	public static void solution(String s){
		for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String tem=s.substring(i,j);
                if(isPalindrome(tem)==true){
                    System.out.println(tem);
                }

            }
        }
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
        scn.close();
	}

}