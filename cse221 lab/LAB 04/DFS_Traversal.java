import java.util.*;
import java.io.*;
public class DFS_Traversal{
     
     static ArrayList<ArrayList<String>> list; //the adjacency list
     static ArrayList<String> node; //retrieves all the nodes
     static String source; //The source node
     static int nod; //counts number of nodes
     static int edge;  //counts number of edges
     
     public static void main(String [] args){
          try{
               Scanner sc = new Scanner(new File("input.txt"));
               nod=sc.nextInt();
               edge=sc.nextInt();
               sc.nextLine();
               source= sc.nextLine().trim();
               
               list=new ArrayList<ArrayList<String>>(); //the adjacency list
               node= new ArrayList<String>(); //retrieves all the nodes
               
               //   System.out.println(nod + " " +edge+" "+source);
               
               node.add(source); //adds the source to the list of nodes
               
               String [] str=new String [edge]; //array to hold all the edges in the i/p file
               for(int i=0;i<edge;i++){ //traverses all the edges in the i/p file
                    
                    String s=sc.nextLine(); //gets the ith edge
                    str[i]=s;  //stores the edge in the ith index of str array
                    String temp []=s.split("\\s+");  //splits the edge into two parts to get  u and v nodes
                    
                    
                    /*temp[0] contains  node u
                     * temp[1] contains node v
                     */
                    if(!node.contains(temp[0].trim())){ 
                         node.add(temp[0].trim()); //adds node u to the list of nodes , if it's not yet present in list
                    }
                    if(!node.contains(temp[1].trim())){
                         node.add(temp[1].trim());  //adds node v to the list of nodes,  if it's not yet present in list
                    }
                    
                    
               }
               
               
               for(int j=0;j<nod;j++){
                    list.add(new ArrayList<String>()); //initializing type arraylist<integer>
                    list.get(j).add(node.get(j)); //adding the node present in the jth index of node to the jth position of list
               } 
               
               
               for(int i=0;i<edge;i++){
                    
                    String [] temp= str[i].split(" ");
                    
                    for (int j=0;j<nod;j++){
                         
                         if (list.get(j).get(0).equals(temp[0].trim())){ //get(j).get(0) finds the first elem at the jth index of the list
                              
                              list.get(j).add(temp[1].trim()); //adds the v node of edge (u,v) to the adjaceny list of u 
                              
                         }
                         
                    }
                    
               }
               
          }
          
          
          catch (FileNotFoundException e) 
          {
               // TODO Auto-generated catch block
               
               System.out.println("FIle not found");
               e.printStackTrace();
               
          }
          /////////////////////the adjacency list print
          System.out.println(list);
          DFS_Traversal d=new DFS_Traversal();
          d.DFS();
     }
     
     
     
     public void DFS(){
          
     }
     public void DFS_Visit(String node,int index){
          
          
          
     }
}