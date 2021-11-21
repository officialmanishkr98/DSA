import java.io.*;
import java.util.*;

public class arrayrotate {

    public static void swap(int[] arr , int l , int r)
    {
        int temp = 0;
        int j = l;  
        int k = r;
        int n = (r-l-1)/2 ;

        for(int i=0; i<n; i++)
        {
            temp = arr[k];
            arr[k] = arr[j];
            arr[j] = temp;
            j++;
            k--;
        }
    }

    public static void display(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
       
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        
        for(int i=0; i<n; i++)
        {
            arr[i] = scn.nextInt();
        }
        
        int k = scn.nextInt();
        

        swap(arr , 0 , k-1);
        swap(arr , k , arr.length-1);
        swap(arr , 0 , arr.length-1);


        
        display(arr);
 
     
    }
}