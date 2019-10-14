import java.io.PrintWriter;
import java.io.File; 
import java.util.*; 
public class MergeSort { 
     void merge(int arr[], int l, int m, int r) { 
          int n1 = m - l + 1; 
          int n2 = r - m; 
          int L[] = new int [n1]; 
          int R[] = new int [n2]; 
          for (int i=0; i<n1; ++i)
               L[i] = arr[l + i];
          for (int j=0; j<n2; ++j)
               R[j] = arr[m + 1+ j];
          int i = 0, j = 0;
          int k = l;
          while (i < n1 && j < n2)
          {
               if (L[i] <= R[j]) 
               {
                    arr[k] = L[i]; 
                    i++; 
               }
               else
               {
                    arr[k] = R[j]; 
                    j++; 
               }
               k++; 
          }
          while (i < n1) 
          {
               arr[k] = L[i]; 
               i++; 
               k++; 
          }
          while (j < n2) 
          { 
               arr[k] = R[j]; 
               j++; 
               k++; 
          } 
     } 
     void sort(int arr[], int l, int r) 
     {
          if (l < r) 
          { 
               int m = (l+r)/2; 
               sort(arr, l, m); 
               sort(arr , m+1, r); 
               merge(arr, l, m, r); 
          } 
     }
     
     
     public static void main(String[] args) throws Exception{
          File file = new File("Test.txt"); 
          Scanner sc = new Scanner(file);
          PrintWriter writer= new PrintWriter("output.txt");
          
          int a= sc.nextInt();
          int[] p= new int[a];
          int i=0;
          while(sc.hasNext()){
               p[i]=sc.nextInt();
               i++;
          }
          writer.println("Given Array:"); 
          int n = p.length; 
          for (int q=0; q<n; ++q){ 
               writer.print(p[q] + " ");  
          }
          MergeSort ob = new MergeSort(); 
          ob.sort(p, 0, p.length-1); 
          writer.println(" ");
          writer.println("Sorted array:"); 
          int z = p.length; 
          for (int r=0; r<z; ++r) 
               writer.print(p[r] + " "); 
          writer.close();
     } 
} 
