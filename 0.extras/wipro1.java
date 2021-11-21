import java.util.*;
public class wipro1
{
 public static void main(String[] args) 
 {
 
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();
    for(int i=0 ; i<t ; i++)
    {
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int j=0 ; j<n ; j++)
        {
            arr[j] = scn.nextInt();
        }

        int sum = 0;
        for(int j=0 ; j<arr.length ; j++)
        {
            sum = sum + arr[j];
        }

        // System.out.println("sum is: " + sum);

        // int dif = 0;

        // for(int j = 1 ; j*j<=sum ; j++)
        // {
        //     if(j*j == sum)
        //     {
        //         System.out.println("yes");
        //     }
        //     else
        //     {
        //         dif = ((int)Math.pow(j+1,2)) - sum ;
        //     }
        // }
        // if(dif!=0){ System.out.println(dif); }

        int root = (int)Math.sqrt(sum);
        if(root*root==sum)
        {
            System.out.println("yes");
        }
        else
        {
            root = (root+1)*(root+1);
            System.out.println(root-sum);
        }
    }
   
   
}}  