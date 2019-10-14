import java.io.File; 
import java.util.*; 
public class ReadFromFileUsingScanner{
     public static void main(String[] args) throws Exception{
          File file = new File("Test.txt"); 
          Scanner sc = new Scanner(file); 
          int m=sc.nextInt();
          int[][] a=new int[m][m];
          int y=sc.nextInt();
          while(sc.hasNext()){
               int x=sc.nextInt()-1;
               y=sc.nextInt()-1;
               a[x][y]=1;
               a[y][x]=1;
          }
          System.out.println("Adjacency matrix:"); 
          System.out.print(" ");
          for(int i=1;i<=a.length;i++){
               System.out.print(" "+i);
          }
          System.out.println();
          for(int i=0; i<a.length;i++){
               System.out.print(i+1+" ");
               for(int j=0; j<a.length;j++){
                    System.out.print(a[i][j]+" ");
               }
               System.out.println();
          }
     } 
} 