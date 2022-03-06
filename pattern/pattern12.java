
package pattern;


import java.util.*;

public class Pattern12 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        // write ur code here
        int val=0;
        int b=1;
        // write ur code here
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
            System.out.print(val+"\t");
            int c=val+b;
            val=b;
            b=c;
            }
            System.out.println();
            
        }
        scn.close();
    }
}
// import java.util.*;

// public class pattern12 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num=sc.nextInt();
//         int i,j;
//         int a=0,b=1;
//         int c=a+b;
//         for(i=0;i<num;i++){
//             for(j=0;j<=i;j++){
//                 if(i==0){
//                     System.out.print(a+"	");
//                 }
//                 else if(i==1)
//                 {   if(j==0) {
//                     System.out.print("1");
//                     }
//                     if(j==1){
//                         System.out.print("	");
//                         System.out.print(c+"	");
//                         a=b;
//                         b=c;
//                      }
                    
//                 }else{
//                     c=a+b;
//                     System.out.print(c);
//                     System.out.print("	");
//                     a=b;
//                     b=c;
                    

//                 }
//                 // System.out.println();

//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }



// Sample Input

// 5

// Sample Output
// 0	
// 1	1	
// 2	3	5	
// 8	13	21	34	
// 55	89	144	233	377