import java.io.*;
import java.util.*;

public class Main {
	static int max = 0;
	public static void getMaxGold(int[][] arr){
		//write your code here
        boolean visited[][]=new boolean[arr.length][arr[0].length];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]!=0 && visited[i][j]!=true){
                    ArrayList<Integer> ans=new ArrayList<>();
                    travelandChange(arr,i,j,visited,ans);
                    int sum=0;
                    for(int val:ans){
                        sum+=val;
                    }
                    max=Math.max(max,sum);
                }
            }
        }
		
	}
    public static void travelandChange(int[][]arr, int i,int j,boolean [][]visited,ArrayList<Integer>ans){
        if(i<0 || i>=arr.length||j<0||j>=arr[0].length||arr[i][j]==0|| visited[i][j]==true){
            return;
        }
        visited[i][j]=true;
        ans.add(arr[i][j]);
        travelandChange(arr, i+1, j, visited, ans);
        travelandChange(arr, i-1, j, visited, ans);
        travelandChange(arr, i, j+1, visited, ans);
        travelandChange(arr, i, j-1, visited, ans);
    }
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int[][] arr = new int[m][n];
		for(int i = 0; i < arr.length; i++){
			for(int j = 0 ; j  < arr[0].length; j++){
				arr[i][j] = scn.nextInt();
			}
		}
		getMaxGold(arr);
		System.out.println(max);
	}
		
}