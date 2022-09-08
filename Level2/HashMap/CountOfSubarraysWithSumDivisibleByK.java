import java.util.*;

public class Main {

    public static int solution(int[] arr, int k) {
        // write your code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int ssf=0;
        int count=0;
        map.put(ssf%k,1);
        for(int i=0;i<arr.length;i++){
            ssf=ssf+arr[i];
            int rem=ssf%k;
            if(rem<0){
                rem=rem+k;
            }
            if(map.containsKey(rem)==true){
                int freq=map.get(rem);
                count+=freq;
                map.put(rem,freq+1);
            }else{
                map.put(rem,1);
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
        int k = scn.nextInt();
        System.out.println(solution(arr, k));
    }

}
