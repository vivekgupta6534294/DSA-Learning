import java.util.*;

public class Main {

    public static int solution(int[] arr, int k) {
        // write your code here
        int maxLen=0;
		int i=-1;
		int sum=0;
		HashMap<Integer,Integer> map=new HashMap<>();
        map.put(sum,i);
		while(i<arr.length-1){
			i++;
			sum+=arr[i];
            int rem=sum%k;
            if(rem<0){
                rem=rem+k;
            }
			if(map.containsKey(rem)==true){
                int len=i-map.get(rem);
                maxLen=Math.max(len,maxLen);
            }else{
                map.put(rem,i);
            }
			
		}

		return maxLen;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        System.out.println(solution(arr, k));
    }

}
