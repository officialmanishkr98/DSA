import java.util.*;

public class saddle {
    public static void display(int[][] mat)
    {
        for(int i=0; i<mat.length; i++)
        {
            for(int j=0; j<mat[i].length; j++)
            {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){

        

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int [][] mat = new int[n][n];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                mat[i][j] = scn.nextInt();
            }
        }

        for(int i=0; i<n; i++)
        {
            int minCol = 0;
            for(int j=0; j<n; j++)
            {
                if( mat[i][j] < mat[i][minCol] )
                {
                    minCol = j;
                }
            }

            int maxRow = 0;
            for(int k=0; k<n; k++)
            {
                if(  mat[k][minCol] > mat[maxRow][minCol] )
                {
                    maxRow = k;
                }
            }

            if(maxRow == i)
            {
                System.out.println( mat[maxRow][minCol] );
                return;
            }
            
        }
        
        System.out.println("Invalid input");
        


}}