import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int noofpairs_src_des = scn.nextInt();
		HashMap<String, String> map = new HashMap<>();
		for (int i = 0; i < noofpairs_src_des; i++) {
			String s1 = scn.next();
			String s2 = scn.next();
			map.put(s1, s2);	
		}

		//write your code here
		HashMap<String,Boolean> help=new HashMap<>();
		for(String src:map.keySet()){
			String dest=map.get(src);
			help.put(dest,false);
			if(help.containsKey(src)==false){
				help.put(src,true);
			}else{
				help.put(src,false);
			}
		}

		String start="";
		for(String src:help.keySet()){
			if(help.get(src)==true){
				// System.out.println(src + " " + help.get(src));
				start=src;
			}
		}
		
		recursion(start, map);
	}
	public static void recursion(String src, HashMap<String,String> map){
		if(map.get(src)==null) {
			System.out.print(src+".");
			return ;
		}
		System.out.print(src+" -> ");
		recursion(map.get(src),map);
	}
}