import java.util.*;
public class p6
{
 public static void main(String[] args) 
 {
 
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
   

    int mid = (n+1)/2;
    int st=mid;
    int sp=1;

    for(int i=1; i<=n ; i++)
        {
            // System.out.println(st + "," + sp + "," + st); //sp=2 & st=1
            for(int j=1;j<=st;j++){System.out.print("*\t");}
            for(int j=1;j<=sp;j++){System.out.print("\t");}
            for(int j=1;j<=st;j++){System.out.print("*\t");}
            System.out.println("");


            if(i<mid)
                {
                    st--; 
                    sp=sp+2;
                }
            else
                {
                    st++; 
                    sp=sp-2;
                }
            
        }
  
}}  