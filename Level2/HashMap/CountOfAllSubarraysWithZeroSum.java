import java.util.*;

public class Main {

	public static int solution(int[] arr) {
		// write your code here
		// sum so far leke chalunga 
		int count=0;
		HashMap<Integer,Integer> map=new HashMap<>();
		int ssf=0;
		map.put(0,1);
		for(int i=0;i<arr.length;i++){

			ssf+=arr[i];
			if(map.containsKey(ssf)==true){
				int freq=map.get(ssf);
				count+=freq;
				map.put(ssf,freq+1);//update krdia 
			}else{
				map.put(ssf,1);
			}


		}

		return count;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(solution(arr));

	}

}
