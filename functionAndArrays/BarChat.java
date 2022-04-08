package functionAndArrays;
import java.util.*;
public class BarChat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int max=-1;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>max) max=arr[i];
        }
        // Max ka Value yaha par mil gya 
        int temp=max;
        for(int i=0;i<max;i++){
            for(int j=0;j<n;j++){
                if(arr[j]==temp){
                    arr[j]--;
                    System.out.print("*\t");

                }else{
                    System.out.print("\t");
                }

            }
            temp--;
            System.out.println();
        }
    }
    
}
