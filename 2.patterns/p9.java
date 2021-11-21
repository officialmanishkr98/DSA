import java.util.*;
public class p9
{
 public static void main(String[] args) 
 {
 
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    for(int i=1;i<=n ; i++)
        {
            for(int j=1;j<=n;j++)
                {
                    if(i==j  || i+j == n+1)
                        {
                            System.out.print("*\t");
                        }
                    else
                        {
                            System.out.print("\t");
                        }

                    }

            System.out.println("");
        }
    
    /*
    n=5
    1,1  5,1
    2,2  4,2
    3,3
    2,2  4,2
    1,1  5,1
    
    */
     
   
   
   
}}  