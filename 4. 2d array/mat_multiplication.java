import java.io.*;
import java.util.*;

public class mat_multiplication{

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

    public static void main(String[] args) throws Exception 
    {


        // write your code here
        Scanner scn = new Scanner(System.in);
        int r1 = scn.nextInt();
        int c1 = scn.nextInt();
        int [][] mat1 = new int [r1][c1];

        for(int i=0; i<r1; i++)
        {
            for(int j=0; j<c1; j++)
            {
                mat1[i][j] = scn.nextInt();
            }
        }

        int r2 = scn.nextInt();
        int c2 = scn.nextInt();

        int[][] mat2 = new int[r2][c2];
        for(int i=0; i<r2; i++)
        {
            for(int j=0; j<c2; j++)
            {
                mat2[i][j] = scn.nextInt();
            }
        }

        if(c1 != r2)
        {
            System.out.println("Invalid input");
            return;
        }

        int[][] matres = new int [r1][c2];

        for(int i=0; i<matres.length; i++)
        {
            for(int j=0; j<matres[i].length; j++)
            {
                for(int k=0; k<c1; k++)
                {
                    matres[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        display(matres);



    }

}