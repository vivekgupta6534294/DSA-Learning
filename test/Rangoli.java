package test;

import java.util.Scanner;

public class Rangoli {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int  n = scn.nextInt();
        int  m = scn.nextInt();
        n=Math.abs(n);
        m=Math.abs(m);
        int dot=1;
        if(n==1){
            System.out.println("WELCOME");
        }
        if(n==3){
            System.out.println("---.|.---");
            System.out.println("-WELCOME-");
            System.out.println("---.|.---");
            return;
        }
        for(int i=0;i<n;i++){
           
            // for(int j=0;j<m;j++){
                int star=(m-(3*dot))/2;
            //     System.out.println("star");
            //     //--
                for(int t=0;t<star;t++){
                    System.out.print("-");
                }
                //dot
                if(i!=n/2){
                    for(int t=0;t<dot;t++){
                        System.out.print(".|.");
                        // j+=2;
                    }
                }else{
                    int str=(m-7)/2;//7 is the length of welcome
                    if(str==n) str=str+1-1;//+1-1 for no reason i have given 
                    else if(str>n){
                        str=n+(str-n);

                    }else{
                        str=n-(str-n);
                    }

                    for(int y=0;y<str;y++){
                        System.out.print("-");
                    }
                    System.out.print("WELCOME");
                    // j=j+5;
                    for(int y=0;y<str;y++){
                        System.out.print("-");
                    }
                }
              //--
                for(int t=0;t<star;t++){
                    System.out.print("-");
                }
                System.out.println();
                if(i<n/2){
                    dot=dot+2;
                }else{
                    dot=dot-2;
                }
            // System.out.print(j);

            }
        // System.out.println();
        }
    }
    
