import java.io.*;
import java.util.*;

public class Solution {

    public static void swap(int[] arr , int l , int r)
    {
        int temp = 0;
        int j = l;
        int k = r;

        for(int i=0; i<n/2; i++)
        {
            temp = arr[k];
            arr[k] = arr[i];
            arr[i] = temp;
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

        swap(arr , 0 , arr.length-1);

        
        display(arr);
 
     
    }
}