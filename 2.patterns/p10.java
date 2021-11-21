import java.util.*;
public class p10
{
 public static void main(String[] args) 
 {
 
    Scanner scn = new Scanner(System.in);

    // int n = scn.nextInt();
    int n=5;
    
    /*
    n=5
      3,1
    2,2  2,4
    1,3  5,3
    2,4  4,4
      3,5
    */
    int os = n/2;
    int is = -1;
    int mid = n/2+1;
    for(int i=1 ; i<=n ; i++)
        {
            for(int j=0; j<os ; j++){System.out.print("\t"); }
            
            System.out.print("*\t");
            
            for(int j=0 ; j<is ; j++){System.out.print("\t");}
            
            if(i>1 && i<n){System.out.print("*\t");}
            
            if(i<mid)
                {
                    os--;
                    is=is+2;
                }
            else
                {
                    os++;
                    is = is - 2;
                }
            System.out.println("");
        }
}}  