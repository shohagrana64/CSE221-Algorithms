import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
public class LAB03 {
    static int[][] matrix = null;
    static int[] parent;
    static int vertexTemp;
    public static void main(String[] args) {
        input("input1.txt");
        BFS(matrix);
    }
    private static void input (String fileName){
        try {
            Scanner input = new Scanner(new File(fileName));
            int vertex = 0, edge = 0;

            while (input.hasNextInt()) {
                vertex = input.nextInt();
                edge = input.nextInt();
                 if (matrix == null) {
                    matrix = new int[vertex + 1][vertex + 1];
                    vertexTemp=vertex+1;
                    parent = new int[vertex + 1];

                } else {
                    matrix[vertex][edge] = 1;
                }
            }
        }
        catch (IOException e) {
            System.out.println("ERROR!! File not found!");

        }
    }

    private static void BFS (int[][] _matrix){
        int temp=1;
        Queue<Integer> white = new LinkedList<>();
        Queue<Integer> grey = new LinkedList<>();
        Queue<Integer> black = new LinkedList<>();
        white.add(temp);
        while (white.peek()!=null){
                temp = white.peek();
                grey.add(white.remove());
                for(int j=temp+1;j<vertexTemp;j++) {
                    if (_matrix[temp][j] == 1) {
                        white.add(j);
                        parent[j]=temp;
                    }
                }
                black.add(grey.remove());
            }
            //parent[1]=1;
            print(parent);
            printing(parent);
        }
        private static void print(int[] _parents) {
            for (int i = 1; i < _parents.length; i++) {
                if (i == 1) {
                    System.out.println(" parent[" + i + "] : Source");
                } else {
                    System.out.println(" parent[" + i + "] : " + _parents[i]);
                }
            }
            System.out.println();
        }
        private static void printing(int[] _parent){


        for(int i=1;i<vertexTemp;i++){
            int counter=0;
            String forPrint=i+": distance from source - ";
            String pathPrint=", path -> ";
            int j=i;
            while(_parent[j]!=0){
                pathPrint += j +",";
                j=_parent[j];
                counter++;
            }
            forPrint+=counter;
            pathPrint +="1";
            forPrint+=pathPrint;
            System.out.println(forPrint);
        }
        }
    }