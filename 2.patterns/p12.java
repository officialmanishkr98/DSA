import java.util.*;
public class p12
{
 public static void main(String[] args) 
 {
 
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    // int n=4;

    int a=0;
    int b=1;
    for(int i=1 ; i<=n ; i++)
        {
            for(int j=1 ; j<=i ; j++)
                {
                    System.out.print(a + "\t");
                    int temp=a+b;
                    a = b;
                    b = temp;
                }
            System.out.println("");
        } 
   
   
   
}}  