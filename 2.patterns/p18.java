import java.util.*;
public class p18
{
 public static void main(String[] args) 
 {
 
    Scanner scn = new Scanner(System.in);
    // int n = scn.nextInt();
    int n = 9;
    int sp1 = 1;
    int sp2 = n-4;
    int st = 1;
    
    for(int i=1; i<=n; i++)
        {
            if(i==1 || i==n)
                {
                    for(int j=1; j<=n; j++)
                        {
                            System.out.print("*\t");
                        }
                }
            
            else
                {
                    if(i<=n/2) // i < 4
                        {
                            for(int j=1;j<=sp1; j++) {System.out.print("\t");}

                            System.out.print("*\t");
                            
                            for(int j=1;j<=sp2; j++) {System.out.print("\t");}

                            System.out.print("*\t");

                            sp2=sp2-2;
                            sp1++;
                        }
                    
                    else if(i==n/2+1)
                    {
                        for(int j=1; j<=sp1;j++)
                            {
                                System.out.print("\t");
                            }
                        
                        System.out.print("*\t");
                    }

                    else
                        {
                            --sp1;
                            st=st+2;
                            for(int j=1;j<=sp1;j++)
                                {
                                    System.out.print("\t");
                                }
                            for( int j=1; j<=st ; j++ )
                            {
                                System.out.print("*\t");
                            }
                        }
                    


                }

            System.out.println();
        }
   
   
   
}}  