import java.util.*;
public class p7
{
 public static void main(String[] args) 
 {
 
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
  

    /*
    0 1
    1 1
    2 1
    3 1
    4 1
    */
    // int sp=0;
    // int st=1;

    // for(int i=0; i<n; i++)
    //     {
    //         for(int j=0;j<sp;j++){ System.out.print("\t");}
    //         System.out.println("*");
    //         sp++;
    //     }

    for(int i=1; i<=n; i++)
        {
            for(int j = 1 ; j<=n; j++)
                {
                    if(j==i){ System.out.print("*\t");}
                    else{System.out.print("\t");}
                }
                
            System.out.println();
                
        }
}}  