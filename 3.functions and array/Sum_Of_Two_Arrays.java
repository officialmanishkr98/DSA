import java.util.*;
public class Sum_Of_Two_Arrays
{
 public static void main(String[] args) 
 {
 
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int [] a1 = new int[n1];
    for(int i=0;i<n1;i++)
    {
        a1[i] = scn.nextInt();
    }
    
    int n2 = scn.nextInt();
    int [] a2 = new int[n2];
    for(int i=0;i<n2;i++)
    {
        a2[i] = scn.nextInt();
    }

    
    int [] sum = new int[n1>n2? n1: n2 ];
    
    int i = a1.length - 1;
    int j = a2.length - 1;
    int k = sum.length - 1;
    
    int d = 0;
    int c = 0;
    int d1 = 0;
    int d2 = 0;

    while(k>=0)
    {
        d1 = (i>=0) ? a1[i] : 0;
        d2 = (j>=0) ? a2[j] : 0;

        d = d1 + d2 + c;

        c = d / 10;
        d = d % 10;
        
        sum[k] = d;
        
        i--;
        j--;
        k--;
    }
    if(c!=0)
    {
        System.out.println(c);
    }
    for(int x=0; x<sum.length; x++)
    {
        System.out.println(sum[x]);
    }   
   
}}  