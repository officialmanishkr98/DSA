import java.io.*;
import java.util.*;

public class arrayinverse {

    public static void inverse( int[] arr )
    {
        int [] arrnew = new int [arr.length];

        for(int i = 0; i<arr.length ; i++)
        {
            int temp = arr[i];
            arrnew [temp] = i;
        }
        return arrnew;
    }

    public static void display(int[] arr)
    {
        for(int i=0; i<arr.length ; i++)
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
        
        int [] arrnew = new int[n];

        arrnew = inverse(arr);

        display(arrnew);
     
}}
