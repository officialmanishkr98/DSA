import java.util.*;

public class Span_Of_Array {

    public static void main(String[] args){

    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int [] arr = new int [n];

    for(int i=0; i<n; i++)
    {
        arr[i] = scn.nextInt();
    }

    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for(int i=0; i<n; i++)
    {
        if(max<arr[i]) max=arr[i];
        if(min>arr[i]) min=arr[i];
    }

    System.out.println(max-min);



}}