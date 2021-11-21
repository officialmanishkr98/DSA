import java.util.*;
public class p17
{
 public static void main(String[] args) 
 {
 
    // Scanner scn = new Scanner(System.in);
    // int n = scn.nextInt();
    // // int n = 5;
    // int sp = n/2;
    // int st = 1;
    
    // for(int i = 1; i<=n ; i++)
    // {
    //     if(i==n/2+1)
    //         {
    //             for(int j=1 ; j<=n ; j++)
    //                 {
    //                     System.out.print("*\t");
    //                 }
    //         }

    //     else if(i<n/2+1 || i>n/2+1)
    //     {
    //         for(int j=1; j<=sp ; j++)
    //             {
    //                 System.out.print("\t");
    //             }
    //         for(int j=1 ; j<=st ; j++)
    //             {
    //                 if(j > st/2)
    //                 {
    //                     System.out.print("*\t");
    //                 }
    //                 else
    //                 {
    //                     System.out.print("\t");
    //                 }
    //             }
            
    //     }

    //         if(i<=n/2)
    //         {
    //             sp--;
    //             st = st+2;
    //         }
    //         else
    //         {
    //             sp++;
    //             st = st-2;
    //         }

    //         System.out.println();

    // }
        int n = 5;
        int sp = n/2;
        int st = 1;

        for(int i=1; i<=n ; i++)
            {
                if(i==n/2+1)
                    {
                        for(int j=1; j<=n ; j++)
                            {
                                System.out.print("*\t");
                            }
                    }
                else
                    {
                        for(int j=0; j<sp; j++)
                            {
                                System.out.print("\t");
                            }
                        
                        for(int j=0; j < st ; j++)
                            {
                                System.out.print("*\t");
                            }
                    }

                if(i<=n/2){st++;}
                else{st--;}
                System.out.println();
            }
   
   
}}  