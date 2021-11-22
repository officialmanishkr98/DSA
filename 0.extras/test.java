import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class test{

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        
        int [][] mat = new int[r][c];
        
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                mat[i][j] = scn.nextInt();
            }
        }
        
        
        int frow = 0, lrow = r-1, fcol = 0, lcol = c-1;
        
        int count = 0;
        // //clock wise
        
        // while(count<=r*c)
        // {
        //     for(int i=fcol; i<=lcol; i++)
        //     {
        //         if(count==r*c)break;
        //         System.out.print(mat[frow][i] + " ");
        //         count++;
        //         if(count==r*c)break;
        //     }
            
        //     frow++;
            
        //     for(int i=frow; i<=lrow; i++)
        //     {
        //         if(count==r*c)break;
        //         System.out.print(mat[i][lcol] + " ");
        //         count++;
        //         if(count==r*c)break;
        //     }
            
        //     lcol--;
            
        //     for(int i=lcol; i>=fcol;i--)
        //     {
        //         if(count==r*c)break;
        //         System.out.print(mat[lrow][i] + " ");
        //         count++;
        //         if(count==r*c)break;
        //     }
            
        //     lrow--;
            
        //     for(int i=lrow; i>=frow; i--)
        //     {
        //         if(count==r*c)break;
        //         System.out.print(mat[i][fcol] + " ");
        //         count++;
        //         if(count==r*c)break;
        //     }
            
        //     fcol++;
        // }
        
        // System.out.println();
        
        
        frow = 0; lrow = r-1; fcol = 0; lcol = c-1;
        
        count = 0;
        //anticlock wise
        
        while(count<=r*c)
        {
            for(int i=frow; i<=lrow; i++)
            {
                System.out.print(mat[i][fcol] + " ");
                count++;
                if(count==r*c)return;
            }
            
            fcol++;
            
            for(int i=fcol; i<=lcol; i++)
            {
                System.out.print(mat[lrow][i] + " ");
                count++;
                if(count==r*c)return;
            }
            
            lrow--;
            
            for(int i=lrow; i>=frow;i--)
            {
                System.out.print(mat[i][lcol] + " ");
                count++;
                if(count==r*c)return;
            }
            
            lcol--;
            
            for(int i=lcol; i>=fcol; i--)
            {
                System.out.print(mat[i][fcol] + " ");
                count++;
                if(count==r*c)return;
            }
            
            frow++;
        }
        
        
        
    }
}