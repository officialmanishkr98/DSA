//Pattern m
import java.util.*;
// public class test_2_1
public class Main
{
 public static void main(String[] args) 
 {
 
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    for(int i = 1; i<=n ; i++)
    {
    if(i<=n/2+1)
    {
        for(int j=1; j<=n; j++)
        {
            if(j==i || j+i==n+1 || j==1 || j==n)
            {
                System.out.print("*\t");
            }
            else
            {
                System.out.print("\t");
            }

        }
    }
    else
    {
        for(int j=1; j<=n; j++)
        {
            if(j==1 || j==n)
            {
                System.out.print("*\t");
            }
            else
            {
                System.out.print("\t");
            }

        }
    }

        System.out.println();
    }
   
   
   
}}  