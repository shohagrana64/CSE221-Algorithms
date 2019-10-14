
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
public class JavaApplication1 
{
   public static void main(String[] args)
   {
       int n;
       int e;
       try
      {
         Scanner sc = new Scanner(new File("input.txt"));
         n=sc.nextInt();
         e=sc.nextInt();
       
        ArrayList<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n;i++)
        {
          list.add(new ArrayList<Integer>());
        }
        int a,b;
        for(int i=0;i<e;i++)
        {
          a=sc.nextInt();
          b=sc.nextInt();
          System.out.print(a+" "+b);
          System.out.println();
          list.get(a).add(b);
        }
        System.out.println();
        for(int j=0;j<n;j++)
        {
          System.out.print(j+" ");
          for(int i=0;i<list.get(j).size();i++)
          {
            System.out.print("-->"+list.get(j).get(i));
          }
          System.out.println();
        }
       
    }
       catch(IOException ee)
   {
     System.out.println(ee);
   }
}
}
