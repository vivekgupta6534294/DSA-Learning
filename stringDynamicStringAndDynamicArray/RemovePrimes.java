package stringDynamicStringAndDynamicArray;

import java.io.*;
import java.util.*;

public class RemovePrimes {

	public static void solution(ArrayList<Integer> arr){
		// write your code here
        for(int idx=0;idx<arr.size();idx++){
          if(isPrime(arr.get(idx))==true){
            arr.remove(idx);
            idx--;
          }

        }
	}
    public static boolean isPrime(int num){
        for(int i = 2 ; i*i <= num ; i++){
          if(num % i == 0){
            return false;
          }
      }
      return true;
    }
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

}