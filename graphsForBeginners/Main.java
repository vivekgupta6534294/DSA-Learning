package graphsForBeginners;
import java.util.*;
public class Main {
    public static class Edge{
        int src,nbr;
        Edge(int src,int nbr){
            this.src=src;
            this.nbr=nbr;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int e=sc.nextInt();
        ArrayList<Edge>[] graph=new ArrayList[v];

        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<>();
        }
        // Jitni Edge Utna bar loop 
        for(int i=1;i<=e;i++){
            int v1=sc.nextInt();
            int v2=sc.nextInt();
            graph[v1].add(new Edge(v1,v2));
            graph[v2].add(new Edge(v2,v1));
        }
        for(ArrayList<Edge> list:graph){
            for(Edge ee:list){
                System.out.println(ee.src+"->"+ee.nbr);
            }
            
        }
    }    
}
/*
7
8
0 1
1 2
2 3
0 3
3 4
4 5
5 6
4 6 
*/