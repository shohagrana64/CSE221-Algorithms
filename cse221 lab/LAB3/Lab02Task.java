import java.util.*;
import java.io.*;
public class Lab02Task{
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
          Queue<Integer> q = new LinkedList<>();
          int white = 0;
          int gray = 1;
          int [] color=new int[vertex];
          int [] parent=new int[vertex];
          int [] distance=new int[vertex];
          
          int u=0;
          color[0]=gray;
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
          System.out.println("Output : ");
          System.out.println();
          
          System.out.println(0+" -> distance from source -> "+distance[0]+", path -> "+0);
          for(int i=1;i<vertex;i++){
               int p=i;
               String path="";
               while(parent[p]!=0) {
                    if (parent[p] != 0) {
                         path = parent[p] + "-->" + path;
                         p = parent[p];
                    }
               }
               path=0+"-->"+path+i;
               System.out.println(i+" -> distance from source -> "+distance[i]+", path -> "+path);  
          }
     }
}
