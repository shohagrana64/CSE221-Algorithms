import java.util.*;
import java.io.*;
public class Lab4Task{
     public static void main(String [] args)throws IOException{
          File file = new File("Test.txt");
          Scanner sc = new Scanner(file);
          Scanner pc=new Scanner(System.in);
          int vertex=sc.nextInt();
          
          int[][] x=new int[vertex][vertex];
          while(sc.hasNext()){
               int z=sc.nextInt();
               int y=sc.nextInt();
               x[z][y]=1;
          }
          ArrayList<Integer> arrli = new ArrayList<Integer>();
          int white = 0;
          int black = 1;
          int [] color=new int[vertex];
          int [] parent=new int[vertex];
          int [] distance=new int[vertex];
          int time=0;
          int u=0;
          color[0]=black;
          q.add(u);
          while(q.isEmpty()==false) {
               int k = q.poll();
               
               for (int i = 0; i < vertex; i++) {
                    if (x[k][i] == 1) {
                         if (color[i] == white) {
                              color[i] = gray;
                              q.add(i);
                              distance[i]=distance[k]+1;
                              parent[i]=k;
                         }
                    }
               }
          }
          
     }
}
