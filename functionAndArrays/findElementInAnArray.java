package functionAndArrays;

import java.util.*;

public class findElementInAnArray{

public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int d=sc.nextInt();
    int index=-1;
    for(int val=0;val<n;val++){
        if(arr[val]==d){
            index=val;
            break;
        }
    }
    System.out.println(index);
    sc.close();
 }

}