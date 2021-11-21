import java.util.*;
public class p15
{
 public static void main(String[] args) 
 {
 
    Scanner scn = new Scanner(System.in);
    // int n = scn.nextInt();

    int n = 5;

    int sp = n/2;
    int st = 1;
    int dig = 1;
     

    for(int i=1 ; i<=n ; i++)
        {
            for(int j=1; j<=sp ; j++)
                {
                    System.out.print("\t");
                }              
                
            int temp_dig = dig;
                
            for(int j=1 ; j <= st ; j++)
                {
                    System.out.print( temp_dig + "\t");
                    if( j <= st/2 ) { temp_dig++ ; }
                    else { temp_dig-- ; }
                }

            System.out.println();

            if(i<=n/2)
                {
                    sp--; 
                    st = st+2;
                    dig++;
                }
            else
                {
                    sp++; 
                    st = st-2;
                    dig--;
                }
     
        }
   
}}  