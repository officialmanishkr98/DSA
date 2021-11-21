import java.util.*;

public class Find_Element_In_An_Array {

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int [] arr = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i] = scn.nextInt();
        }
        
        int span = scn.nextInt();

        for(int i=0; i<n; i++)
        {
            if(arr[i]==span)
            {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);



}}