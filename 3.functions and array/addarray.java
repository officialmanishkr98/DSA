import java.util.*;

public class addarray {

public static void display(int[] sum){

    int indx = 0 ;
    while(sum[indx] == 0)
    {
        indx++;
    }

    for(int i = indx; i<sum.length; i++)
    {
      System.out.println(sum[i] + " ");
    }
  }

public static void addarray(int[] sum , int[] arr , int[] brr)
{
    
    int a = arr.length-1;
    int b = brr.length-1;
    int s = sum.length-1;

    int x = 0;
    int y = 0;
    int d = 0;
    int c = 0;

    for(int i=0 ; i<sum.length ; i++)
    {
        x = (a>=0) ? arr[a] : 0 ;
        y = (b>=0) ? brr[b] : 0 ;

        d = x + y + c;
        c = 0;

        c = d / 10;
        d = d % 10;
        sum[s] = d ;
        a--;b--;s--;
    }    

    
}

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner (System.in);
    int a = scn.nextInt();
    int [] arr = new int[a];
    for(int i=0; i<a ; i++)
    {
        arr[i] = scn.nextInt();
    }
    
    
    int b = scn.nextInt();
    int [] brr = new int[b];
    for(int i=0; i<b ; i++)
    {
        brr[i] = scn.nextInt();
    }

    int s = (a>b)? a : b;
    s += 1;
    int [] sum = new int[s];



    addarray(sum , arr , brr);

    display(sum);


  

}}