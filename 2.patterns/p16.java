import java.util.*;
public class p16
{
 public static void main(String[] args) 
 {
 
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    // int n = 7;
    int st = 1;
    int sp = n*2 -3;
    
    for(int i=1; i <= n ; i++)
        {
            int d = 1;
            
            for(int j = 0 ; j < st ; j++)    
                { 
                    System.out.print( d + "\t");
                    d++;
                }
            
            for(int j = 0 ; j < sp ; j++)    { System.out.print("\t");}
            
            
            if(i==n) 
                {
                    st--;
                    d--;
                }
            
            for(int j = 0 ; j < st ; j++)    
                { 
                        { 
                            d--;
                            System.out.print( d + "\t"); 
                        }  
                }
        
            // System.out.println(st + "," + sp + "," + st );



            sp = sp-2;
            st++;
            System.out.println();
        }

   
   
   
}}  