import java.util.*;
public class p11
{
 public static void main(String[] args) 
 {
 
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    // int n=4;

    int d=1;
    for(int i=1 ; i<=n ; i++)
        {
            for(int j=1 ; j<=i ; j++)
                {
                    System.out.print(d + "\t");
                    d++;
                }
            System.out.println("");
        }

}}  